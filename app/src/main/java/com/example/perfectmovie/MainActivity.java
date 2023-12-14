package com.example.perfectmovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            int itemId = item.getItemId();
            if (itemId == R.id.Premiers_MenuItem) {
                selectedFragment = new PremiersFragment();
            } else if (itemId == R.id.Collections_MenuItem) {
                selectedFragment = new CollectionFragment();
            }



            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        });

        // Показать начальный фрагмент
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PremiersFragment()).commit();

    }
}

