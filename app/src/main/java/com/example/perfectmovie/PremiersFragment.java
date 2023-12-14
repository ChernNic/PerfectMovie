package com.example.perfectmovie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PremiersFragment extends Fragment {

    private RecyclerView recyclerView;
    private PremierAdapter adapter;
    private ProgressBar progressBar;
    private ArrayList<Premieres.Premier> list = new ArrayList<Premieres.Premier>();
    public PremiersFragment() {
    }
    public static PremiersFragment newInstance(String param1, String param2) {
        PremiersFragment fragment = new PremiersFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_premiers, container, false);

        progressBar = rootView.findViewById(R.id.progress_bar);

        recyclerView = rootView.findViewById(R.id.recycler_view);

        Retrofit retrofit = ServiceBuilder.buildRetrofit("b16a2c4d-26a8-4d2f-a5ef-e0fb9819eba3");
        ApiInterface service = retrofit.create(ApiInterface.class);
        Call<Premieres> GetPremieresCall = service.getPremieres( LocalDate.now().getYear(), LocalDate.now().getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH).toUpperCase());
        GetPremieresCall.enqueue(new Callback<Premieres>() {
            @Override
            public void onResponse(Call<Premieres> call, Response<Premieres> response) {
                if (response.isSuccessful()) {
                    list = response.body().getItems();

                    adapter = new PremierAdapter(getContext(), list, getActivity());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(adapter);

                    progressBar.setVisibility(View.INVISIBLE);

                } else {
                    try {
                        String errorBody = response.errorBody().string();
                        Log.e("PremiersFragment", "API request failed. Error: " + errorBody);
                        Log.e("PremiersFragment", "Error: " + response.code());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<Premieres> call, Throwable t) {
                Log.e("PremiersFragment", "API request failed. Error: " + t.getMessage());
            }
        });


        return rootView;
    }


}