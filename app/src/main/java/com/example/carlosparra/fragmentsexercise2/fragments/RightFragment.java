package com.example.carlosparra.fragmentsexercise2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carlosparra.fragmentsexercise2.R;
import com.example.carlosparra.fragmentsexercise2.adapters.RightFragmentCustomAdapter;
import com.example.carlosparra.fragmentsexercise2.models.Device;
import com.example.carlosparra.fragmentsexercise2.models.DeviceMakes;

import java.util.ArrayList;

public class RightFragment extends Fragment {

    private RecyclerView recyclerView;
    RightFragmentCustomAdapter adapter;
    ArrayList<Device> devices;


    public RightFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_right, container, false);

        recyclerView = view.findViewById(R.id.fragmentRightRecyclerView);

        adapter = new RightFragmentCustomAdapter(new ArrayList<Device>());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    public void setDeviceMake(DeviceMakes make) {
        devices = Device.createListOfDevices(make);

        adapter.setDevices(make);
        adapter.notifyDataSetChanged();
    }
}
