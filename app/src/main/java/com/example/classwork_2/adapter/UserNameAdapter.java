package com.example.classwork_2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.classwork_2.databinding.ListHolderBinding;
import com.example.classwork_2.models.Sport;

import java.util.ArrayList;
import java.util.List;

public class UserNameAdapter extends RecyclerView.Adapter<UserNameAdapter.UserNameHolder> {

    ArrayList<Sport> list;

    public UserNameAdapter(ArrayList<Sport> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserNameAdapter.UserNameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserNameHolder(ListHolderBinding
                .inflate(LayoutInflater.from(parent
                        .getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserNameAdapter.UserNameHolder holder, int position) {
       holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserNameHolder extends RecyclerView.ViewHolder {
        private ListHolderBinding binding;
        public UserNameHolder(@NonNull  ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Sport s) {
            binding.tvValue.setText(s.getBoxs());


        }
    }
}
