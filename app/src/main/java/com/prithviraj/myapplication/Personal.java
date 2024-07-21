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


public class Personal extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.userlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<User> userList = new ArrayList<>();

        userList.add(new User("John Doe", "New York", "Developer", 10));
        userList.add(new User("Jane Smith", "Los Angeles", "Designer", 15));
        userList.add(new User("Alice Johnson", "Chicago", "Architect", 12));
        userList.add(new User("Bob Brown", "Houston", "Engineer", 8));
        userList.add(new User("Charlie Davis", "Phoenix", "Manager", 20));
        userList.add(new User("Dana Evans", "Philadelphia", "Analyst", 5));
        userList.add(new User("Evan Foster", "San Antonio", "Consultant", 18));
        userList.add(new User("Fiona Green", "San Diego", "Teacher", 11));
        userList.add(new User("George Harris", "Dallas", "Doctor", 16));
        userList.add(new User("Hannah Wilson", "San Jose", "Nurse", 9));
        userList.add(new User("Ivan Jackson", "Austin", "Lawyer", 14));
        userList.add(new User("Jackie Lewis", "Jacksonville", "Accountant", 7));
        userList.add(new User("Kenny Martinez", "Fort Worth", "Technician", 13));
        userList.add(new User("Laura Nelson", "Columbus", "Artist", 6));
        userList.add(new User("Mike Ortiz", "Charlotte", "Chef", 17));
        userList.add(new User("Nina Perez", "San Francisco", "Photographer", 19));
        userList.add(new User("Oscar Roberts", "Indianapolis", "Pilot", 4));
        userList.add(new User("Paula Sanchez", "Seattle", "Scientist", 2));
        userList.add(new User("Quincy Thompson", "Denver", "Writer", 3));
        userList.add(new User("Rachel Underwood", "Washington", "Entrepreneur", 1));

        UserAdapter userAdapter = new UserAdapter(getContext(), userList);
        recyclerView.setAdapter(userAdapter);
        return view;
    }
}