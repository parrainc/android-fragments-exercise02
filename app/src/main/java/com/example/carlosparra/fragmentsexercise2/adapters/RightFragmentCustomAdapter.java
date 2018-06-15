package com.example.carlosparra.fragmentsexercise2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carlosparra.fragmentsexercise2.R;
import com.example.carlosparra.fragmentsexercise2.models.Device;
import com.example.carlosparra.fragmentsexercise2.models.DeviceMakes;

import java.util.List;

public class RightFragmentCustomAdapter extends
        RecyclerView.Adapter<RightFragmentCustomAdapter.ViewHolder> {

    private List<Device> deviceList;

    public RightFragmentCustomAdapter(List<Device> devices) {
        deviceList = devices;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View deviceListView = inflater.inflate(R.layout.list_devices, parent, false);

        return new ViewHolder(deviceListView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Device device = deviceList.get(position);

        TextView textView = holder.deviceNameTextView;
        textView.setText(device.getDeviceName());
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public void setDevices(DeviceMakes deviceMake) {
        this.deviceList = Device.createListOfDevices(deviceMake);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView deviceNameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            deviceNameTextView = itemView.findViewById(R.id.deviceNameTextView);
        }
    }
}
