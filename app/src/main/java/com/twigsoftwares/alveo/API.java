package com.twigsoftwares.alveo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    public static final String API_BASE_URL = "https://1951777e-4847-49c0-a4a7-7ec3c6a2943e.mock.pstmn.io/";
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
