package com.sp.taskmate;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Back to Login when "Login" is clicked
        findViewById(R.id.tvLoginLink).setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, loginregi.class);
            startActivity(intent);
            finish();
        });
    }
}
