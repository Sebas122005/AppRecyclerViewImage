package com.example.app.poo.java.apprecyclerviewimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.app.poo.java.apprecyclerviewimage.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Android> lista= new ArrayList<>();
        lista.add(new Android(lista.size()+1,R.drawable.image1,"queke", "v1"));
        lista.add(new Android(lista.size()+1,R.drawable.image2,"empanada", "v2"));
        lista.add(new Android(lista.size()+1,R.drawable.image3,"android", "v3"));
        lista.add(new Android(lista.size()+1,R.drawable.image4,"android", "v4"));
        lista.add(new Android(lista.size()+1,R.drawable.image6,"cup cake", "v5"));

        binding.rvandroid.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        AndroidAdapter adapter = new AndroidAdapter(lista);
        binding.rvandroid.setAdapter(adapter);

    }
}


