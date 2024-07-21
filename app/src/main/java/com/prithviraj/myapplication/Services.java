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


public class Services extends Fragment {
    private RecyclerView recyclerView;
    private ServiceAdapter serviceAdapter;
    private List<Service> userList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_services, container, false);
        recyclerView = view.findViewById(R.id.servicelist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        userList = new ArrayList<>();
        userList.add(new Service("John Doe", "New York", "5 KM", 75, "Software Engineer", 5, "Hi community I am available at your service"));
        userList.add(new Service("Jane Smith", "Los Angeles", "10 KM", 85, "Graphic Designer", 8, "I offer high-quality design services"));
        userList.add(new Service("Mike Johnson", "Chicago", "2 KM", 60, "Plumber", 12, "Experienced plumber available for repairs"));
        userList.add(new Service("Emily Davis", "Houston", "8 KM", 90, "Electrician", 7, "Certified electrician ready to help"));
        userList.add(new Service("Chris Brown", "Phoenix", "3 KM", 70, "Carpenter", 10, "Expert carpenter for hire"));
        userList.add(new Service("Sarah Wilson", "Philadelphia", "4 KM", 65, "Chef", 6, "Professional chef available for events"));
        userList.add(new Service("David Lee", "San Antonio", "15 KM", 95, "Software Developer", 9, "Full-stack developer at your service"));
        userList.add(new Service("Laura Martinez", "San Diego", "6 KM", 80, "Interior Designer", 11, "Transform your space with my design"));
        userList.add(new Service("James White", "Dallas", "12 KM", 50, "Gardener", 5, "Skilled gardener for your garden needs"));
        userList.add(new Service("Linda Harris", "San Jose", "1 KM", 55, "Tutor", 3, "Experienced tutor in various subjects"));
        userList.add(new Service("Robert Clark", "Austin", "9 KM", 77, "Photographer", 4, "Professional photography services"));
        userList.add(new Service("Karen Lewis", "Jacksonville", "7 KM", 88, "Yoga Instructor", 6, "Certified yoga instructor available"));
        userList.add(new Service("Paul Walker", "San Francisco", "11 KM", 66, "Painter", 2, "Artistic painter for your projects"));
        userList.add(new Service("Nancy Hall", "Columbus", "13 KM", 82, "Nurse", 14, "Registered nurse for home care"));
        userList.add(new Service("Daniel Allen", "Fort Worth", "5 KM", 60, "Mechanic", 8, "Experienced mechanic ready to help"));
        userList.add(new Service("Barbara Young", "Indianapolis", "2 KM", 78, "Translator", 7, "Professional translation services"));
        userList.add(new Service("Matthew King", "Charlotte", "3 KM", 83, "Fitness Trainer", 10, "Personal fitness trainer for hire"));
        userList.add(new Service("Susan Scott", "Seattle", "4 KM", 72, "Event Planner", 12, "Event planning and coordination services"));
        userList.add(new Service("Steven Green", "Denver", "1 KM", 90, "Architect", 15, "Innovative architecture and design"));
        userList.add(new Service("Donna Adams", "Washington", "6 KM", 68, "Writer", 9, "Creative writing and editing services"));
        userList.add(new Service("Mark Baker", "Boston", "8 KM", 92, "Marketing Consultant", 11, "Strategic marketing consulting"));
        userList.add(new Service("Patricia Mitchell", "El Paso", "10 KM", 74, "Realtor", 5, "Professional real estate services"));
        userList.add(new Service("Thomas Gonzalez", "Nashville", "9 KM", 76, "Musician", 6, "Live music for your events"));

        serviceAdapter = new ServiceAdapter(getContext(), userList);
        recyclerView.setAdapter(serviceAdapter);
        return view;
    }

    }
