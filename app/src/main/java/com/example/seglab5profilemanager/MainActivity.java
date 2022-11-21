package com.example.seglab5profilemanager;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button mapBtn, setValue;
    ImageButton flag;
    EditText teamname, teamaddress;
    TextView nameDisplay, addressDisplay;
    ActivityResultLauncher<Intent> launcher;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapBtn = (Button) findViewById(R.id.mapsBtn);
        setValue = (Button) findViewById(R.id.setValues);
        flag = (ImageButton) findViewById(R.id.flagBtn);
        teamname = (EditText) findViewById(R.id.teamNameBox);
        teamaddress = (EditText) findViewById(R.id.postalCodebox);
        nameDisplay = (TextView) findViewById(R.id.teamnamedisplay);
        addressDisplay = (TextView) findViewById(R.id.addressdisplay);

        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>(){
                    @Override
                    public void onActivityResult(ActivityResult result){
                        if(result.getResultCode()== Activity.RESULT_OK) {
                            Intent data = result.getData();
                            //Bundle data = result.getData().getExtras();
                            String flagName = data.getStringExtra("image");
                            if (flagName.equals("korea")) {
                                flag.setImageResource(R.drawable.flag_kr);
                            }
                            else if (flagName.equals("canada")) {

                                flag.setImageResource(R.drawable.flag_ca);
                            }
                            else if (flagName.equals("egypt")) {

                                flag.setImageResource(R.drawable.flag_eg);
                            }
                            else if (flagName.equals("france")) {
                                flag.setImageResource(R.drawable.flag_fr);
                            }
                            else if (flagName.equals("japan")) {
                                flag.setImageResource(R.drawable.flag_jp);
                            }
                            else if (flagName.equals("spain")) {
                                flag.setImageResource(R.drawable.flag_sp);
                            }
                            else if (flagName.equals("turkey")) {
                                flag.setImageResource(R.drawable.flag_tr);
                            }
                            else if (flagName.equals("uk")) {
                                flag.setImageResource(R.drawable.flag_uk);
                            }
                            else if (flagName.equals("us")) {
                                flag.setImageResource(R.drawable.flag_us);
                            }

                        }
                    }
                }
        );
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnOpenInGoogleMaps(view);
            }
        });
        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DataSelector.class);
                launcher.launch(intent);
            }
        });
        setValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (teamaddress.getText().toString().equals("")&& teamname.getText().toString().equals("")) {
                    return;
                }
                else if (teamaddress.getText().toString().equals("")) {
                    nameDisplay.setText(teamname.getText().toString());
                    teamaddress.setText("");
                    teamname.setText("");
                }
                else if (teamname.getText().toString().equals(""))  {
                    addressDisplay.setText(teamaddress.getText().toString());
                    teamaddress.setText("");
                    teamname.setText("");
                }
                else {
                    nameDisplay.setText(teamname.getText().toString());
                    addressDisplay.setText(teamaddress.getText().toString());
                    teamaddress.setText("");
                    teamname.setText("");
                }
            }
        });
    }
    public void OnOpenInGoogleMaps(View view) {
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+addressDisplay.getText().toString());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }



}