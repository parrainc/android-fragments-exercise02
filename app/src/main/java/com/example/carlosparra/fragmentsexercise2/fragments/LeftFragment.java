package com.example.carlosparra.fragmentsexercise2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.carlosparra.fragmentsexercise2.R;

public class LeftFragment extends Fragment {

    ImageButton imageButtonAdd;
    ImageButton imageButtonAndroid;
    ImageButton imageButtonLaptop;

    private LeftFragmentListener callback;

    public LeftFragment() { }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            callback = (LeftFragmentListener) context;
        }
        catch(Exception e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_left, container, false);

        imageButtonAdd = view.findViewById(R.id.fragmentLeftButtonAdd);
        imageButtonAndroid = view.findViewById(R.id.fragmentLeftButtonAndroid);
        imageButtonLaptop = view.findViewById(R.id.fragmentLeftButtonLaptop);

        imageButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked("Add");
            }
        });

        imageButtonAndroid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                buttonClicked("Android");
            }
        });

        imageButtonLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked("Laptop");
            }
        });

        return view;
    }

    private void buttonClicked(String from) {
        callback.sendData(getString(R.string.message_on_fragment, from));
    }

    public interface LeftFragmentListener {
        void sendData(String data);
    }
}
