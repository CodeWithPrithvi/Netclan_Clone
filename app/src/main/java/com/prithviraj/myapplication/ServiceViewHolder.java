package com.prithviraj.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class ServiceViewHolder extends RecyclerView.ViewHolder {
    ImageView userImage;
    TextView serviceUser, serviceCity, serviceDist, profileScore, occupation, yearsOfExp, availabilityMessage, invite;
    ImageView callIcon, contactIcon;
    LinearProgressIndicator progressIndicator;

    public ServiceViewHolder(View itemView) {
        super(itemView);
        userImage = itemView.findViewById(R.id.userImage);
        serviceUser = itemView.findViewById(R.id.serviceuser);
        serviceCity = itemView.findViewById(R.id.servicecity);
        serviceDist = itemView.findViewById(R.id.servicedist);
        profileScore = itemView.findViewById(R.id.profileScore);
        occupation = itemView.findViewById(R.id.occupation);
        yearsOfExp = itemView.findViewById(R.id.yearsofexp);
        availabilityMessage = itemView.findViewById(R.id.availabilityMessage);
        invite = itemView.findViewById(R.id.invite);
        callIcon = itemView.findViewById(R.id.callIcon);
        contactIcon = itemView.findViewById(R.id.contactIcon);
        progressIndicator = itemView.findViewById(R.id.progressIndicator);
    }
}

