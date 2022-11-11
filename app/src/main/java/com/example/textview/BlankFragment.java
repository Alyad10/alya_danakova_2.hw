package com.example.textview;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class BlankFragment extends Fragment {
    private TextView text;
    private MaterialButton btn_plus;
    private MaterialButton btn_minus;
    int i = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_plus = view.findViewById(R.id.btn_plus);
        text = view.findViewById(R.id.text__);
        btn_minus = view.findViewById(R.id.btn_minus);


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                text.setText(String.valueOf(i));
            }


        });


        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                text.setText(String.valueOf(i));
            }
        });

    }


}











