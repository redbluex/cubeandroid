package com.example.rob.kostka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void zmien(View view)
    {
        ImageView imgage = (ImageView)findViewById(R.id.imageView7);

        Random licz = new Random();
        int y = licz.nextInt(6);
        if(y==0) {
            imgage.setImageResource(R.drawable.jeden);
        }
        if(y==1){
            imgage.setImageResource(R.drawable.dwa);
        }
        if(y==2){
            imgage.setImageResource(R.drawable.trzy);
        }
        if(y==3) {
            imgage.setImageResource(R.drawable.cztery);
        }
        if(y==4){
            imgage.setImageResource(R.drawable.piec);
        }
        if(y==5){
            imgage.setImageResource(R.drawable.szesc);
        }
        String liczbay = Integer.toString(y+1);

        TextView tekst = (TextView)findViewById(R.id.textView2);
        tekst.setText(liczbay);


    }
}
