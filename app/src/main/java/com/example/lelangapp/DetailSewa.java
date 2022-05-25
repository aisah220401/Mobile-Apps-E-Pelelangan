package com.example.lelangapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSewa extends AppCompatActivity  {

    TextView getktp,getmerk,getnama,getalamat,getnomor,getlama,gettanggal,gettotal;
    ImageView getgambar;
    Button btexit;
    int iLama, iHarga,dTotal;
    String Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sewa);
        getSupportActionBar().setTitle("Keterangan Detail Sewa");

        getktp =findViewById(R.id.getktp);
        getmerk = findViewById(R.id.getmerk);
        getnama = findViewById(R.id.getnama);
        getalamat = findViewById(R.id.getalamat);
        getnomor = findViewById(R.id.getnomor);
        getlama = findViewById(R.id.getlama);
        gettanggal = findViewById(R.id.gettanggal);
        gettotal = findViewById(R.id.getharga);
        getgambar = findViewById(R.id.getgambar);
        btexit=findViewById(R.id.btexit);
        showData();

    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        String merk = getIntent().getExtras().getString("Merk");
        String ktp=getIntent().getExtras().getString("KTP");
        String nama=getIntent().getExtras().getString("Nama");
        String alamat=getIntent().getExtras().getString("Alamat");
        String nohp=getIntent().getExtras().getString("Nohp");
        String lama=getIntent().getExtras().getString("lama");
        String tanggal=getIntent().getExtras().getString("Tanggal");

        switch (merk) {
            case "Avanza":
                iHarga = 280000;
                break;
            case "Ertiga":
                iHarga = 300000;
                break;
            case "Xpander":
                iHarga = 500000;
                break;
            case "APV":
                iHarga = 420000;
                break;
            case "Elf":
                iHarga = 670000;
                break;
            case "innova":
                iHarga = 320000;
                break;
            case "Pregio":
                iHarga = 330000;
                break;
        }

        iLama=Integer.parseInt(lama);
        dTotal=iHarga*iLama;
        Total=String.valueOf(dTotal);

        switch (merk){
            case "Avanza":
                getgambar.setImageResource(R.drawable.avanza);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "Ertiga":
                getgambar.setImageResource(R.drawable.ertiga);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "Xpander":
                getgambar.setImageResource(R.drawable.xpander);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "APV":
                getgambar.setImageResource(R.drawable.apv);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "Elf":
                getgambar.setImageResource(R.drawable.elf);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "innova":
                getgambar.setImageResource(R.drawable.innova);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
            case "Pregio":
                getgambar.setImageResource(R.drawable.pregio);
                getmerk.setText(merk);
                getnama.setText(nama);
                getalamat.setText(alamat);
                getnomor.setText(nohp);
                getlama.setText(lama);
                gettanggal.setText(tanggal);
                gettotal.setText(Total);
                getktp.setText(ktp);
                break;
        }
        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailSewa.this);
                builder.setCancelable(false);
                builder.setMessage("kamu ingin keluar dari bukti bookong ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
                builder.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}