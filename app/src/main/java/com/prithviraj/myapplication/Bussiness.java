package com.prithviraj.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Bussiness extends Fragment {
    private RecyclerView recyclerView;
    private BussinessAdapter companyAdapter;
    private List<BData> companyList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bussiness, container, false);
        recyclerView = view.findViewById(R.id.businesslist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        companyList = new ArrayList<>();
        companyList.add(new BData("Tech Innovators", "Kolkata", "2", 50, "Hi Community! We have great deals for you. Please check us out!!"));
        companyList.add(new BData("Fresh Farms", "Mumbai", "5", 65, "We offer the best products in the market."));
        companyList.add(new BData("Urban Outfitters", "Delhi", "10", 80, "Visit us for amazing discounts!"));
        companyList.add(new BData("Green Solutions", "Chennai", "3", 90, "Special offers available now!"));
        companyList.add(new BData("Fitness First", "Bangalore", "7", 75, "Don't miss our limited-time offers."));
        companyList.add(new BData("Healthy Eats", "Hyderabad", "4", 60, "Quality products at unbeatable prices."));
        companyList.add(new BData("Creative Minds", "Pune", "8", 55, "Discover great deals with us."));
        companyList.add(new BData("Eco Warriors", "Ahmedabad", "6", 70, "Top-notch services just for you."));
        companyList.add(new BData("Fashion Hub", "Jaipur", "9", 85, "Your satisfaction is our priority."));
        companyList.add(new BData("Gadget World", "Surat", "2", 50, "Check out our new arrivals."));
        companyList.add(new BData("Smart Home", "Lucknow", "5", 65, "Best prices guaranteed."));
        companyList.add(new BData("Travel Experts", "Kanpur", "10", 80, "We bring you the best offers."));
        companyList.add(new BData("Auto Mart", "Nagpur", "3", 90, "Grab our exclusive deals now!"));
        companyList.add(new BData("Beauty Bliss", "Indore", "7", 75, "Limited-time discounts available."));
        companyList.add(new BData("Tech Gurus", "Bhopal", "4", 60, "Premium quality at affordable prices."));
        companyAdapter = new BussinessAdapter(getContext(), companyList);
        recyclerView.setAdapter(companyAdapter);
        return view;

    }
}