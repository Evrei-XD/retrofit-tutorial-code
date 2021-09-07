package com.thetehnocafe.gurleensethi.retrofitexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);

        Post data = new Post();
        Post new_data = new Post();
        data.data = "{\"sn\":\"xxx\",\"data\": [{\"tm\": 3,\"data\": {\"1_46\": {\"ch\": \"Kto molodec? Roma!!!\"}}},{\"tm\": 10,\"data\": {\"1_46\": {\"ch\": \"Kto molodec? I serioja toje(&Andrei)!!!\"}}}]}";
        new_data.data = "{\"messages\":[{\"deviceId\":\"8A:10:3C:8C:2B:EC\",\"occurred\":1630066846,\"data\":{\"1_49\":{\"gripper\":\"1\"},\"2_50\":{\"angle_open\":\"60\",\"speed_open\":\"100\",\"angle_close\":\"60\",\"speed_close\":\"100\"},\"3_50\":{\"angle_open\":\"60\",\"speed_open\":\"100\",\"angle_close\":\"60\",\"speed_close\":\"100\"},\"4_50\":{\"angle_open\":\"60\",\"speed_open\":\"100\",\"angle_close\":\"60\",\"speed_close\":\"100\"},\"5_50\":{\"angle_open\":\"60\",\"speed_open\":\"100\",\"angle_close\":\"60\",\"speed_close\":\"100\"},\"6_50\":{\"angle_open\":\"60\",\"speed_open\":\"100\",\"angle_close\":\"60\",\"speed_close\":\"100\"}}}]}";

        NetworkService.getInstance()
                .getJSONApi()
                .postData(data)
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(Call<Post> call, Response<Post> response) {

                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable t) {

                    }
                });
//                .enqueue(new Callback<Post>() {
//                    @Override
//                    public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
//                        Post post = response.body();
//
//                        textView.append(post.getId() + "\n");
//                        textView.append(post.getUserId() + "\n");
//                        textView.append(post.getTitle() + "\n");
//                        textView.append(post.getBody() + "\n");
//                    }
//
//                    @Override
//                    public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {
//
//                        textView.append("Error occurred while getting request!");
//                        t.printStackTrace();
//                    }
//                });
    }
}
