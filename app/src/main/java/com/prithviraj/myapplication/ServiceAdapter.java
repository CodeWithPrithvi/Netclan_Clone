package com.prithviraj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceViewHolder> {
    private List<Service> userList;
    private Context context;

    public ServiceAdapter(Context context, List<Service> userList) {
        this.context = context;
        this.userList = userList;
    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.servicedetaildesign, parent, false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ServiceViewHolder holder, int position) {
        Service user = userList.get(position);

        holder.serviceUser.setText(user.getUserName());
        holder.serviceCity.setText(user.getCity()+",");
        holder.serviceDist.setText("within "+user.getDistance());
        holder.profileScore.setText("Profile Score - " + user.getProfileScore() + "%");
        holder.occupation.setText(user.getOccupation() + " |");
        holder.yearsOfExp.setText(user.getYearsOfExperience() + " years of experience");
        holder.availabilityMessage.setText(user.getAvailabilityMessage());


        holder.userImage.setImageResource(R.drawable.profilepic2);
        holder.progressIndicator.setProgress(user.getProfileScore());


        holder.callIcon.setImageResource(R.drawable.rounded_call_24);
        holder.contactIcon.setImageResource(R.drawable.baseline_contacts_24);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}

