package com.sstTechnologies.smartOt.fragment.login;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sstTechnologies.smartOt.R;

public class splashFrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_splash, container, false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(root).navigate(R.id.action_splashFrag_to_signUp);
            }
        }, 3000);

        return root;
    }
}