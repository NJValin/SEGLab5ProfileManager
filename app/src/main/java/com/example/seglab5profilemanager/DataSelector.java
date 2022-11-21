package com.example.seglab5profilemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

@SuppressLint("MissingInflatedId")
public class DataSelector extends AppCompatActivity {
    EditText sportClub;
    ImageButton submitBtn, korea, canada, egypt, france, japan, spain, turkey, uk, us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_selector);


        korea = (ImageButton) findViewById(R.id.korea);
        canada = (ImageButton) findViewById(R.id.canada);
        egypt = (ImageButton) findViewById(R.id.egypt);
        france = (ImageButton) findViewById(R.id.france);
        japan = (ImageButton) findViewById(R.id.japan);
        spain = (ImageButton) findViewById(R.id.spain);
        turkey = (ImageButton) findViewById(R.id.turkey);
        uk = (ImageButton) findViewById(R.id.britain);
        us = (ImageButton) findViewById(R.id.america);

        korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "korea");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "canada");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        egypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "egypt");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "france");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "japan");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        spain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "spain");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        turkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "turkey");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "uk");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("image", "us");
                setResult(RESULT_OK, returnIntent);

                finish();
            }
        });
    }
}