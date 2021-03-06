package com.example.carlosparra.fragmentsexercise2.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.carlosparra.fragmentsexercise2.R;
import com.example.carlosparra.fragmentsexercise2.fragments.LeftFragment;
import com.example.carlosparra.fragmentsexercise2.fragments.RightFragment;

public class MainActivity extends FragmentActivity implements LeftFragment.LeftFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String data) {
        RightFragment rightFragment = (RightFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentRight);
        rightFragment.setText(data);
    }
}
