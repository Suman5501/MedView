package com.example.medview.authscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.medview.MainActivity;
import com.example.medview.R;
import com.example.medview.models.ResponseModel;
import com.example.medview.network.ApiService;
import com.example.medview.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterUserActivity extends AppCompatActivity {

    ApiService apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Button btn1= (Button) findViewById(R.id.btn_continue);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RegisterUserActivity.this,
                        MainActivity.class));
                finish();
            }
        });
    }
}