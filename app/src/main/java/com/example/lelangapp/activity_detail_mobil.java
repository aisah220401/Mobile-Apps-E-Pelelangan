package com.example.lelangapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

public class activity_detail_mobil extends AppCompatActivity {
    Button btn_sewa;
    TextView  GetNama, GetHarga;
    ImageView GetGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mobil);
        getSupportActionBar().setTitle("Detail Mobil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_sewa=findViewById(R.id.btn_sewa);
        GetGambar = findViewById(R.id.getgambar);
        GetNama = findViewById(R.id.getnama);
        GetHarga = findViewById(R.id.getharga);
        showData();
        btn_sewa.setOnClickListener(v -> {
            Intent ina=new Intent(getApplicationContext(),ActivitySewa.class);
            startActivity(ina);
        });
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama){
            case "Avanza":
                GetNama.setText("Avanza");
                GetGambar.setImageResource(R.drawable.avanza);
                GetHarga.setText("Rp.320.000");
                break;
            case "Ertiga":
                GetNama.setText("Ertiga");
                GetGambar.setImageResource(R.drawable.ertiga);
                GetHarga.setText("Rp.300.000");
                break;
            case "Xpander":
                GetNama.setText("Xpander");
                GetGambar.setImageResource(R.drawable.xpander);
                GetHarga.setText("Rp.500.000");
                break;
            case "APV":
                GetNama.setText("APV");
                GetGambar.setImageResource(R.drawable.apv);
                GetHarga.setText("Rp.420.000");
                break;
            case "Elf":
                GetNama.setText("Elf");
                GetGambar.setImageResource(R.drawable.elf);
                GetHarga.setText("Rp.670.000");
                break;
            case "innova":
                GetNama.setText("innova");
                GetGambar.setImageResource(R.drawable.innova);
                GetHarga.setText("Rp.320.000");
                break;
            case "Pregio":
                GetNama.setText("Pregio");
                GetGambar.setImageResource(R.drawable.xpander);
                GetHarga.setText("Rp.330.000");
                break;
        }
    }
}