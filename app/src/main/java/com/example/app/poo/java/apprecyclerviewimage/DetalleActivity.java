package com.example.app.poo.java.apprecyclerviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app.poo.java.apprecyclerviewimage.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    ActivityDetalleBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().hasExtra("android")){
            Android objAndroid= getIntent().getParcelableExtra("android");
            binding.ivDetalle.setImageResource(objAndroid.getImagen());
            binding.tvNombreAndroidDetalle.setText(objAndroid.getNombre());
            binding.tvVersionAndroidDetalle.setText(objAndroid.getVersion());
        }
    }
}