package com.example.area_prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.area_prueba.profile.UserProfileActivity;

public class DashboardActivity extends AppCompatActivity {

    private Button bn_Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bn_Profile = findViewById(R.id.btn_Profile);
        bn_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), UserProfileActivity.class);
                startActivity(i);
            }
        });
    }
}
