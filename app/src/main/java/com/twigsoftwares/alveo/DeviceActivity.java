package com.twigsoftwares.alveo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeviceActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        Button button2 = findViewById(R.id.button2);
        button2.setVisibility(View.GONE);

        Button button3 = findViewById(R.id.button3);
        button3.setVisibility(View.VISIBLE);


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DeviceActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText deviceName = DeviceActivity.this.findViewById(R.id.device_name);
                EditText devicelastsynced = DeviceActivity.this.findViewById(R.id.device_last_synced);
                EditText devicepairedwith = DeviceActivity.this.findViewById(R.id.device_paired_with);
                EditText device_type = DeviceActivity.this.findViewById(R.id.device_type);

                Device device = new Device(deviceName.getText().toString(),devicelastsynced.getText().toString(),devicepairedwith.getText().toString(),Integer
                        .parseInt(device_type.getText().toString()));


                API.deviceService().SaveDevice(device).enqueue(new Callback<Integer>() {
                    @Override
                    public void onResponse(Call<Integer> call, Response<Integer> response) {
                        Toast.makeText(DeviceActivity.this, "Saved Successfully...", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Integer> call, Throwable t) {

                    }
                });
                
                
            }
        });

    }
}
