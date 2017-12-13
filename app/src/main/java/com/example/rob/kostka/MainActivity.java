package com.example.rob.kostka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void siedem(View view)
    {
        Intent b = new Intent(MainActivity.this, Main7Activity.class);
        startActivity(b);
    }

    public void dwa(View view)
    {
        Intent b = new Intent(MainActivity.this, dwie.class);
        startActivity(b);
    }
}
