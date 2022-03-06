package com.example.classwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.classwork_2.adapter.UserNameAdapter;
import com.example.classwork_2.databinding.ActivityMainBinding;
import com.example.classwork_2.models.SetName;
import com.example.classwork_2.models.Sport;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final SetName setName = new SetName();
    private UserNameAdapter userNameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initiliazition();
        getData();
    }

    private void initiliazition() {
        userNameAdapter = new UserNameAdapter(setName.getData());
        binding.recycler.setAdapter(userNameAdapter);
    }

    private void getData() {
    }
}