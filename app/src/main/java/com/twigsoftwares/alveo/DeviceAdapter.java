package com.twigsoftwares.alveo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DeviceAdapter extends  RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder> {

    List<Device> deviceList;

    public DeviceAdapter(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {

        Device device = deviceList.get(position);
        if(device.getType() == 0)
            holder.deviceImage.setImageResource(R.drawable.alveodot);
        else
            holder.deviceImage.setImageResource(R.drawable.alveoair);
        holder.deviceName.setText(device.getName());
        holder.lastPairedWith.setText(device.getPairedwith());
        holder.lastSyncedTime.setText(device.getLastsycned());

    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public class DeviceViewHolder extends RecyclerView.ViewHolder
    {
        public TextView deviceName,lastSyncedTime,lastPairedWith;
        public ImageView deviceImage;
        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);
            deviceImage = (ImageView) itemView.findViewById(R.id.device_image);
            deviceName = (TextView) itemView.findViewById(R.id.device_name);
            lastSyncedTime = (TextView) itemView.findViewById(R.id.last_sync_time);
            lastPairedWith = (TextView) itemView.findViewById(R.id.last_paired_time);
        }
    }

}

