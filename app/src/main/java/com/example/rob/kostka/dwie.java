package com.example.rob.kostka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class dwie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwie);
    }

    public void losowe(ImageView x, TextView z)
    {
        Random licz = new Random();
        int y = licz.nextInt(6);
        if(y==0) {
            x.setImageResource(R.drawable.jedenmin);
        }
        if(y==1){
            x.setImageResource(R.drawable.dwamin);
        }
        if(y==2){
            x.setImageResource(R.drawable.trzymin);
        }
        if(y==3) {
            x.setImageResource(R.drawable.czterymin);
        }
        if(y==4){
            x.setImageResource(R.drawable.piecmin);
        }
        if(y==5){
            x.setImageResource(R.drawable.szescmin);
        }
        String abc = Integer.toString(y+1);
        z.setText(abc);

    }



    public void RzucKostki(View view)
    {
        ImageView img1 = (ImageView)findViewById(R.id.imageView);
        ImageView img2 = (ImageView)findViewById(R.id.imageView2);
        TextView txt1 = (TextView)findViewById(R.id.textView4);
        TextView txt2 = (TextView)findViewById(R.id.textView6);
        losowe(img1, txt1);
        losowe(img2, txt2);
    }
}
