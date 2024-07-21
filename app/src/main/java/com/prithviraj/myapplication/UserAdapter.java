package com.prithviraj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.userdetailsdesign, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        // Assuming you have a default image in drawable
        holder.userImage.setImageResource(R.drawable.profilepic);
        holder.userName.setText(user.getUserName());
        holder.city.setText(user.getCity());
        holder.occupation.setText(user.getOccupation());
        holder.distance.setText(String.valueOf(user.getDistance()) + " KM");
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}

