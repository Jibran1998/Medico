package com.lgu.medico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DashboardPatient extends AppCompatActivity {

    ImageButton searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_patient);
        getSupportActionBar().hide();
        searchButton=findViewById(R.id.imageButtonSearch);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardPatient.this, Search.class);
                startActivity(intent);
            }
        });
    }
}
