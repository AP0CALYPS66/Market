package com.example.market;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.market.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Вернитесь, ничего не сохраниллось!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        binding.main.setBackgroundColor(Color.parseColor("#ED7014"));
        binding.buy.setBackgroundColor(Color.GREEN);
        binding.clear.setBackgroundColor(Color.RED);
        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.cb1.setChecked(false);
                binding.cb2.setChecked(false);
                binding.cb3.setChecked(false);
                binding.cb4.setChecked(false);
                binding.cb5.setChecked(false);
                binding.cb6.setChecked(false);
                binding.r1.setChecked(false);
                binding.r2.setChecked(false);
                binding.r3.setChecked(false);
                binding.ET.getText().clear();
            }
        });
        binding.buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Временно не доступно", Toast.LENGTH_SHORT).show();
            }
        });
    }
}