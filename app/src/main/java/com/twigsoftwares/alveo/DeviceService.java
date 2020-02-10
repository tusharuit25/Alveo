package com.twigsoftwares.alveo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DeviceService {

    @GET("getdevices")
    Call<Devices> getDeviceList();
}
