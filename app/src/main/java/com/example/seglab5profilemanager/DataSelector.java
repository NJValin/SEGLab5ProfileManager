package com.example.seglab5profilemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
@SuppressLint("MissingInflatedId")
public class DataSelector extends AppCompatActivity {
    EditText sportClub;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_selector);

        sportClub = findViewById(R.id.sportClub);
        submitBtn = findViewById((R.id.submitBtn));

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("text_data", sportClub.getText().toString());
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
    }
}