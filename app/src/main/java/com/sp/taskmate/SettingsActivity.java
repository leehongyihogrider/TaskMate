package com.sp.taskmate;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Dropdown options
        String[] reminderOptions = {"Every day", "Every 2 days", "Every week", "Every month"};

        // Spinner setup
        Spinner spinnerFrequency = findViewById(R.id.spinnerFrequency);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, reminderOptions);
        spinnerFrequency.setAdapter(adapter);

        // Handle Spinner selection
        spinnerFrequency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedFrequency = reminderOptions[position];
                Toast.makeText(SettingsActivity.this, "Selected: " + selectedFrequency, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        // Logout Button setup
        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            // Logout logic here
            Toast.makeText(SettingsActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
            // Redirect to login screen or finish activity
            finish();
        });
    }
}
