package com.vaibhav.android.viewbinding;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.vaibhav.android.viewbinding.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityPresenter presenter = new MainActivityPresenter(this, getApplicationContext());

        TemperatureData data = new TemperatureData("Pune", "30");

        binding.setPresenter(presenter);

        binding.setTemperature(data);

    }

    @Override
    public void showData(TemperatureData data) {
        Toast.makeText(this, data.getCelsius() + " :: " + data.getLocation(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void startSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
