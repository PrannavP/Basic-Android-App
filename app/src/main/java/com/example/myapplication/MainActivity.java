package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the TextView
        TextView displayMessage = findViewById(R.id.displayMessage);

        // Retrieve the message from intent
        String username = getIntent().getStringExtra("USERNAME");

        // Display the recieved message
        if(username != null){
            displayMessage.setText("Welcome, " + username);
        }

        // Go back button listener
        Button gobackButton = findViewById(R.id.gobackButton);

        gobackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int responseCode = 301;

                Intent intent = new Intent(MainActivity.this, IndexActivity.class);
                intent.putExtra("RESPONSE_CODE", responseCode);
                startActivity(intent);
            }
        });
    }
}