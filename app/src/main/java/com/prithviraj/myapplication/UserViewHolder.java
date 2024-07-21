package com.prithviraj.myapplication;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userImage;
    TextView userName;
    TextView city;
    TextView occupation;
    TextView distance;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userImage = itemView.findViewById(R.id.userImage);
        userName = itemView.findViewById(R.id.username);
        city = itemView.findViewById(R.id.city);
        occupation = itemView.findViewById(R.id.occupation);
        distance = itemView.findViewById(R.id.distance);
    }
}
