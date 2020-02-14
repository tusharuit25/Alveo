package com.twigsoftwares.alveo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface DeviceService {

    @GET("Devices")
    Call<Devices> GetDeviceList();

    @POST("Devices")
    Call<Integer> SaveDevice(@Body Device device);
}
