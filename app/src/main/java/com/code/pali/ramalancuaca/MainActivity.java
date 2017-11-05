package com.code.pali.ramalancuaca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_Minggu)
    TextView hariYngDiTampilkan;

    @BindView(R.id.ImageMatahari)
    ImageView gambarYangDitapilkan;

    @BindView(R.id.textHujan)
    TextView tapilaknCuaca;

    @BindView(R.id.text17C)
    TextView tampilanSuhu;

    //bending
    //@BindView(R.id.weather_List)
    //RecyclerView weatherList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        hariYngDiTampilkan.setText("Mari MInggu");
        tampilanSuhu.setText("18C");
        tampilanSuhu.setText("Dingin Sangat");
        gambarYangDitapilkan.setImageResource(R.mipmap.sun);

    }
}
