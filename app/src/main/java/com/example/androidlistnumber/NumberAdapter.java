package com.example.androidlistnumber;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.UserViewHolder> {
    int[] arrNumber;

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.number_layout, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.countNum.setText(""+arrNumber[position]);
    }

    @Override
    public int getItemCount() {
        return arrNumber.length;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
            TextView countNum;

            public UserViewHolder(@NonNull View itemView) {
                super(itemView);
                countNum = itemView.findViewById(R.id.txtCount);
            }
    }
}

