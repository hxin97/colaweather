package com.example.colaweather.util;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.d("HttpUtil", "sendOkHttpRequest: herehere"+request.toString());
        client.newCall(request).enqueue(callback);
    }
}
