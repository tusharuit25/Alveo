package com.twigsoftwares.alveo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    public static final String API_BASE_URL = "http://192.168.0.3:44374/api/";
    private static <T> T builder(Class<T> endpoint) {
        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(endpoint);
    }

    public static DeviceService deviceService() {
        return builder(DeviceService.class);
    }

}
