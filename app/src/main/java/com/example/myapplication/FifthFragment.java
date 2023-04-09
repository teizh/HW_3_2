package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FifthFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBundle();

    }

    private void getBundle() {
        if (getArguments() != null) {
            String funnyAnimal = getArguments().getString("key5");
            System.out.println(funnyAnimal);
            TextView textView;
            textView = requireActivity().findViewById(R.id.textFromFirstFragment);
            textView.setText(funnyAnimal);
        }
    }
}