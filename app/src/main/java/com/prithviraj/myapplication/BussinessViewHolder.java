package com.prithviraj.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class BussinessViewHolder extends RecyclerView.ViewHolder {
    TextView cname,ccityndist,cprogtxt,cdesc;
    LinearProgressIndicator cprog;

    public BussinessViewHolder(@NonNull View itemView) {
        super(itemView);
        cname=itemView.findViewById(R.id.companyname);
        ccityndist=itemView.findViewById(R.id.cityanddist);
        cprogtxt=itemView.findViewById(R.id.progress);
        cdesc=itemView.findViewById(R.id.description);
        cprog=itemView.findViewById(R.id.progbar);
    }
}
