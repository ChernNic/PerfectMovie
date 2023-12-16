package com.example.perfectmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;


import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FilmDataActivity extends AppCompatActivity {


    TextView title_textView;
    TextView description_textView;
    TextView staff_textView;
    TextView date_textView;
    ImageView imageView;
    WebView webView;

    ProgressBar progressBar;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_data);

        imageView = findViewById(R.id.cover_imageView);
        title_textView = findViewById(R.id.title_TextView);
        description_textView = findViewById(R.id.description_TextView);
        date_textView = findViewById(R.id.date_TextView);
        staff_textView = findViewById(R.id.staff_TextView);
        webView = findViewById(R.id.webview);
        progressBar = findViewById(R.id.progress_bar);

        Intent intent = getIntent();
        if (intent.hasExtra("id")) {
            int id = intent.getIntExtra("id", 301);
            Retrofit retrofit = ServiceBuilder.buildRetrofit("b16a2c4d-26a8-4d2f-a5ef-e0fb9819eba3");
            ApiInterface service = retrofit.create(ApiInterface.class);

            Call<Data> GetFilmCall = service.getFilmDetails(id);
            GetFilmCall.enqueue(new Callback<Data>() {
                @Override
                public void onResponse(Call<Data> call, Response<Data> response) {
                    if (response.isSuccessful()) {
                        Film film = response.body().data;
                        title_textView.setText(film.getNameRu());
                        description_textView.setText(film.getDescription());
                        date_textView.setText(film.getYear()+"");
                        Picasso.with(FilmDataActivity.this).load(film.getPosterUrl()).into(imageView);

                    } else {
                        try {
                            String errorBody = response.errorBody().string();
                            Log.e("FilmDataActivity", "API request failed. Error: " + errorBody);
                            Log.e("FilmDataActivity", "Error: " + response.code());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Data> call, Throwable t) {
                    Log.e("FilmDataActivity", "API request failed. Error: " + t.getMessage());
                }
            });

            Retrofit retrofit1 = ServiceBuilder.buildRetrofit("b16a2c4d-26a8-4d2f-a5ef-e0fb9819eba3");
            ApiInterface service1 = retrofit1.create(ApiInterface.class);
            Call<Videos> GetFilmVideoCall = service1.getFilmVideo(id);
            GetFilmVideoCall.enqueue(new Callback<Videos>() {
                @Override
                public void onResponse(Call<Videos> call, Response<Videos> response) {
                    if (response.isSuccessful()) {
                        Videos collections = response.body();
                        ArrayList<Video> videos = collections.items;

                        for (Video video : videos){
                            if(video.site.equals("YOUTUBE")) {
                                webView.setVisibility(View.VISIBLE);

                                WebSettings webSettings = webView.getSettings();
                                webSettings.setJavaScriptEnabled(true);

                                webView.setWebViewClient(new WebViewClient());
                                String youtubeUrl = video.url;
                                webView.loadUrl(youtubeUrl);
                                progressBar.setVisibility(View.INVISIBLE);
                                break;
                            }
                            else {
                                webView.setVisibility(View.INVISIBLE);
                                progressBar.setVisibility(View.INVISIBLE);
                            }
                        }

                    } else {
                        try {
                            String errorBody = response.errorBody().string();
                            Log.e("FilmDataActivity", "API request failed. Error: " + errorBody);
                            Log.e("FilmDataActivity", "Error: " + response.code());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Videos> call, Throwable t) {
                    Log.e("FilmDataActivity", "API request failed. Error: " + t.getMessage());
                }
            });


            Retrofit retrofit2 = ServiceBuilder.buildRetrofit("b16a2c4d-26a8-4d2f-a5ef-e0fb9819eba3");
            ApiInterface service2 = retrofit2.create(ApiInterface.class);
            Call<ArrayList<Staff>> GetFilmStaffCall = service2.getFilmStaff(id);
            GetFilmStaffCall.enqueue(new Callback<ArrayList<Staff>>() {
                @Override
                public void onResponse(Call<ArrayList<Staff>> call, Response<ArrayList<Staff>> response) {
                    if (response.isSuccessful()) {
                        ArrayList<Staff> staff = response.body();

                        for(Staff member : staff){
                            staff_textView.append(member.nameRu + "(" + member.professionText+ ")" + "\n");
                        }

                    } else {
                        try {
                            String errorBody = response.errorBody().string();
                            Log.e("FilmDataActivity", "API request failed. Error: " + errorBody);
                            Log.e("FilmDataActivity", "Error: " + response.code());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(Call<ArrayList<Staff>> call, Throwable t) {
                    Log.e("FilmDataActivity", "API request failed. Error: " + t.getMessage());
                }
            });
        }
    }
}
