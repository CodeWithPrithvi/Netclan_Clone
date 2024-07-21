package com.prithviraj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BussinessAdapter extends RecyclerView.Adapter<BussinessViewHolder> {

    private Context context;
    private List<BData> companyList;

    public BussinessAdapter(Context context, List<BData> companyList) {
        this.context = context;
        this.companyList = companyList;
    }

    @NonNull
    @Override
    public BussinessViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bussinessdetaildesign, parent, false);
        return new BussinessViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BussinessViewHolder holder, int position) {
        BData company = companyList.get(position);
        holder.cname.setText(company.getName());
        holder.ccityndist.setText(company.getCity()+" within "+company.getDist()+" KM");
        holder.cprogtxt.setText("Profile score - " + company.getProg() + "%");
        holder.cdesc.setText(company.getDesc());
        holder.cprog.setProgress(company.getProg());
    }
    @Override
    public int getItemCount() {
        return companyList.size();
    }
}
