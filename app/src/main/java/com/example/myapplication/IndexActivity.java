package com.example.myapplication;

import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class IndexActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        // Find views
        EditText usernameField = findViewById(R.id.usernameField);
        Button loginButton = findViewById(R.id.loginButton);

        // Set click listener 
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String username = usernameField.getText().toString();

                System.out.println("Username: " + username);

                // Username validate
                if(!username.equals("prannavpanta")){
                    Toast.makeText(getApplicationContext(), "Invalid username!!", Toast.LENGTH_SHORT).show();
                }else{
                    // Create an Intent to send data
                    Intent intent = new Intent(IndexActivity.this, MainActivity.class);
                    intent.putExtra("USERNAME", username); // Passing data
                    startActivity(intent);
                }
            }
        });

//        int defaultValue = -1;
//
//        // Go Back Intent
//        int responseCode = getIntent().getIntExtra("RESPONSE_CODE", defaultValue);
//        Toast.makeText(this, responseCode, Toast.LENGTH_SHORT).show();
    }
}