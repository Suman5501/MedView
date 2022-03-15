package com.example.medview.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medview.MainActivity;
import com.example.medview.R;
import com.example.medview.patient.RegisterUserActivity;

public class RegisterDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_doctor);
        Button btn1= (Button) findViewById(R.id.btn_continue);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RegisterDoctorActivity.this,
                        MainActivity.class));
            }
        });
    }
}