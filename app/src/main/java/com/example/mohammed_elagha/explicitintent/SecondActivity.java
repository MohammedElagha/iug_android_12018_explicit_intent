package com.example.mohammed_elagha.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Mohammed El-Agha on 27/10/18.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        if(intent.hasExtra("domain") && intent.hasExtra("telephone")) {
            String domain = intent.getStringExtra("domain");
            int telephone = intent.getIntExtra("telephone", 2644400);
            Toast.makeText(SecondActivity.this, domain + " - " + telephone, Toast.LENGTH_SHORT).show();
        }


        //////////////////


        Button button = findViewById(R.id.back_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent();
                backIntent.putExtra("back", "Back from Second");
                setResult(201, backIntent);
                finish();
            }
        });
    }
}
