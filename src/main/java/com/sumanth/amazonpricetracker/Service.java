package com.sumanth.amazonpricetracker;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

// Annotation
@org.springframework.stereotype.Service
public class Service {

    // Method
    // To compute factorial
    public String getPrice() throws IOException {
        String url = "https://www.amazon.in/OnePlus-Nord-Pastel-128GB-Storage/dp/B0BY8JZ22K/ref=sr_1_1?keywords=B0BY8JZ22K&qid=1692543631&sr=8-1";


        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://amazon-price1.p.rapidapi.com/search?keywords=B0C46H59YD&marketplace=IN")
                .get()
                .addHeader("X-RapidAPI-Key", "4cbe865158mshab61d7fe8dd3e2dp1e4376jsndd3c7872b2d3")
                .addHeader("X-RapidAPI-Host", "amazon-price1.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        String op = response.body().string();
        System.out.println(op);

return op;

    }
}
