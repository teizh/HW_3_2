package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    AppCompatButton buttonSecondFragment;
    AppCompatButton buttonThirdFragment;
    AppCompatButton buttonFourthFragment;
    AppCompatButton buttonFifthFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        clickListeners();
    }

    private void clickListeners() {
        buttonSecondFragment = requireActivity().findViewById(R.id.buttonNavigate);
        buttonSecondFragment.setOnClickListener(view -> navigateToSecondFragment());
        buttonThirdFragment = requireActivity().findViewById(R.id.buttonThirdFragment);
        buttonThirdFragment.setOnClickListener(view -> navigateToThirdFragment());
        buttonFourthFragment = requireActivity().findViewById(R.id.buttonFourthFragment);
        buttonFourthFragment.setOnClickListener(view -> navigateToFourthFragment());
        buttonFifthFragment = requireActivity().findViewById(R.id.buttonFifthFragment);
        buttonFifthFragment.setOnClickListener(view -> navigateToFifthFragment());
    }

    private void navigateToFifthFragment() {
        FifthFragment fifthFragment = new FifthFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key4", "suslik");
        bundle.putString("key5", "pavlin no on gei");
        fifthFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.fragment_container_view,
                        fifthFragment).commit();
    }

    private void navigateToFourthFragment() {
        FourthFragment fourthFragment = new FourthFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key3", "skuns");
        fourthFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.fragment_container_view,
                        fourthFragment).commit();
    }


    private void navigateToThirdFragment() {
        ThirdFragment thirdFragment = new ThirdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key2", "enot");
        thirdFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.fragment_container_view,
                        thirdFragment).commit();
    }

    private void navigateToSecondFragment() {
        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key", "kapibara");
        secondFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.fragment_container_view,
                        secondFragment).commit();
    }

}