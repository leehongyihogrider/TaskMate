package com.sp.taskmate;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class loginregi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginregi);

        // Navigate to Sign Up page when "Sign Up" is clicked
        findViewById(R.id.tvSignupLink).setOnClickListener(v -> {
            Intent intent = new Intent(loginregi.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}

