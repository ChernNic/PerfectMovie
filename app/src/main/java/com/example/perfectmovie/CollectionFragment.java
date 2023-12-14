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
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CollectionFragment extends Fragment {

    private RecyclerView recyclerView;
    private CollectionAdapter adapter;
    private ProgressBar progressBar;
    private ArrayList<Collection.Item> list = new ArrayList<Collection.Item>();

    public CollectionFragment() {
        // Required empty public constructor
    }

    public static CollectionFragment newInstance(String param1, String param2) {
        CollectionFragment fragment = new CollectionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_collection, container, false);

        progressBar = rootView.findViewById(R.id.progress_bar);

        recyclerView = rootView.findViewById(R.id.recycler_view);

        Retrofit retrofit = ServiceBuilder.buildRetrofit("b16a2c4d-26a8-4d2f-a5ef-e0fb9819eba3");
        ApiInterface service = retrofit.create(ApiInterface.class);
        Call<Collection> GetCollectionsCall = service.getCollections("TOP_250_MOVIES", 1);
        GetCollectionsCall.enqueue(new Callback<Collection>() {
            @Override
            public void onResponse(Call<Collection> call, Response<Collection> response) {
                if (response.isSuccessful()) {
                    Collection collections = response.body();
                    list = collections.getItems();

                    adapter = new CollectionAdapter(getContext(), list, getActivity());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(adapter);

                    progressBar.setVisibility(View.INVISIBLE);

                } else {
                    try {
                        String errorBody = response.errorBody().string();
                        Log.e("CollectionFragment", "API request failed. Error: " + errorBody);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<Collection> call, Throwable t) {
                Log.e("CollectionFragment", "API request failed. Error: " + t.getMessage());
            }

        });


        return rootView;
    }
}