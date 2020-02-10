package com.twigsoftwares.alveo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Device> deviceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DeviceAdapter deviceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.device_list);
        deviceAdapter = new DeviceAdapter(deviceList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(deviceAdapter);
        preparestaticdata();
    }

    private void preparestaticdata() {

       /* Device device = new Device("Rescue sensor", "2 min ago",  "Ventolin 200 | 1 Puff | Twice Daily",  0);
        deviceList.add(device);

        Device device1 = new Device("Controller sensor 01", "6 min ago",  "Ventolin 200 | 1 Puff | Twice Daily",  0);
        deviceList.add(device1);

        Device device2 = new Device("Controller sensor 02", "5 dec 2019 03:00 pm",  "No Medication",  0);
        deviceList.add(device2);

        Device device3 = new Device("alveoAiralveoAir", "5 dec 2019 03:00 pm",  "No Medication",  1);
        deviceList.add(device3);*/

        API.deviceService()
                .getDeviceList()
                .enqueue(new Callback<Devices>() {
                    @Override
                    public void onResponse(@NonNull Call<Devices> call, @NonNull Response<Devices> response) {

                        deviceList = response.body().getDevices();
                        recyclerView.setAdapter(new DeviceAdapter(deviceList));
                    }

                    @Override
                    public void onFailure(@NonNull Call<Devices> call, @NonNull Throwable t) {
                        System.out.println(t.getMessage());
                    }
                });



        deviceAdapter.notifyDataSetChanged();




    }
}
