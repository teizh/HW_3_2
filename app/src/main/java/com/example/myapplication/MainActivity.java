package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToFirstFragment();
        findViews();
    }

    private void navigateToFirstFragment() {
        getSupportFragmentManager().
                beginTransaction().
                add(R.id.fragment_container_view,
                        new FirstFragment()).commit();
     }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void findViews() {
        fragmentContainerView = findViewById(R.id.fragment_container_view);
    }


}