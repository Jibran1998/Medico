package com.lgu.medico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DashboardDoctor extends AppCompatActivity {
    ImageButton profileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_doctor);
        profileButton=findViewById(R.id.imageButtonProfile);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DashboardDoctor.this,PatientProfile.class);
                startActivity(intent);
            }
        });
    }
}
