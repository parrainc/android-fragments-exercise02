package com.example.carlosparra.fragmentsexercise2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carlosparra.fragmentsexercise2.R;

public class RightFragment extends Fragment {

    TextView textViewMessage;

    public RightFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_right, container, false);

        textViewMessage = view.findViewById(R.id.fragmentRightTextViewMessage);

        return view;
    }

    public void setText(String message) {
        textViewMessage.setText(message);
    }
}
