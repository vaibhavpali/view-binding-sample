package com.vaibhav.android.viewbinding;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);

        List<TemperatureData> temperatureDataList = Arrays.asList(new TemperatureData("Pune", "30"), new TemperatureData("Jaipur", "35"));

        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(temperatureDataList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(myBaseAdapter);
    }
}
