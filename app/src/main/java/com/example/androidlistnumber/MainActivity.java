package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNumber = findViewById(R.id.recyclerUser);
        recyclerViewNumber.setLayoutManager(new LinearLayoutManager(this));

        int[] arrNumber = new int[100];
        for (int i = 0; i < arrNumber.length; i ++){
            arrNumber[i] = i;
        }

        NumberAdapter numberAdapter = new NumberAdapter();
        numberAdapter.arrNumber = arrNumber;

        recyclerViewNumber.setAdapter(numberAdapter);

    }
}
