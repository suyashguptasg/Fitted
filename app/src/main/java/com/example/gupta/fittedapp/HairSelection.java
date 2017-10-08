package com.example.gupta.fittedapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Gupta on 10/7/2017.
 */

public class HairSelection extends AppCompatActivity implements View.OnClickListener {
    ImageView shortHair, mediumHair, longHair;
    int selected;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair_type);
        ImageView shortHair = (ImageView)findViewById(R.id.face1);
        ImageView mediumHair = (ImageView)findViewById(R.id.face2);
        ImageView longHair = (ImageView)findViewById(R.id.face3);
        shortHair.setOnClickListener(this);
        mediumHair.setOnClickListener(this);
        longHair.setOnClickListener(this);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/short%20button.png?alt=media&token=f7b84140-9908-4bdb-a538-1332f7101094")
                .override(150, 216).centerCrop().into(((ImageView)findViewById(R.id.face1)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/medium%20button.png?alt=media&token=e39fca11-08aa-43fd-a924-e43b68d413a1")
                .override(174, 234).centerCrop().into(((ImageView)findViewById(R.id.face2)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/long%20button.png?alt=media&token=cc22acc2-b5c6-4026-8763-6238a481ba6f")
                .override(147, 222).centerCrop().into(((ImageView)findViewById(R.id.face3)));
        intent = new Intent(this, FaceSelector.class);

    }

   @Override
    public void onClick(View view) {
       switch (view.getId()) {
           case R.id.face2:
               selected = 2;
               startActivity(intent);
               break;
           case R.id.face1:
               selected = 1;
               startActivity(intent);
               break;
           case R.id.face3:
               selected = 3;
               startActivity(intent);
               break;
       }

    }
}
