package com.example.gupta.fittedapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



/**
 * Created by Gupta on 10/7/2017.
 */

public class ColorPickers extends AppCompatActivity implements View.OnClickListener {
    int skinColor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_pickers);



        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin10.png?alt=media&token=7d2e930e-855f-4124-867d-1269e2485e0f")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView2)));
        imageView2.setOnClickListener(this);

        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin5.png?alt=media&token=e5a07484-3097-4537-b209-a30a5728b357")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView3)));
        imageView3.setOnClickListener(this);

        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin6.png?alt=media&token=9871b7fc-88c9-4c47-8c9e-d199a3766045")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView4)));
        imageView4.setOnClickListener(this);

        ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin8.png?alt=media&token=1a3b5ba6-1709-40c0-b248-bcc92f26008b")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView5)));
        imageView5.setOnClickListener(this);

        ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin4.png?alt=media&token=19dffb09-e174-4b08-8573-03c5f2a5cfc6")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView6)));
        imageView6.setOnClickListener(this);

        ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin3.png?alt=media&token=119ea002-19af-44c1-ab78-307e627d4dc1")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView7)));
        imageView7.setOnClickListener(this);

        ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin2.png?alt=media&token=50846b8f-b4d7-4399-9ef7-6def7b55fa6a")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView8)));
        imageView8.setOnClickListener(this);

        ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin1.png?alt=media&token=77ccb58f-d996-4765-a4f1-83e0154dd733")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView9)));
        imageView9.setOnClickListener(this);

        ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin12.png?alt=media&token=2be486de-dde9-42f2-99ff-c8a6ffdd99a6")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView10)));
        imageView10.setOnClickListener(this);

        ImageView imageView11 = (ImageView)findViewById(R.id.imageView11);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin11.png?alt=media&token=f20b9b6e-32dc-4c24-89bf-509f127a8b1f")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView11)));
        imageView11.setOnClickListener(this);

        ImageView imageView12 = (ImageView)findViewById(R.id.imageView12);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin10.png?alt=media&token=7d2e930e-855f-4124-867d-1269e2485e0f")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView12)));
        imageView12.setOnClickListener(this);

        ImageView imageView13 = (ImageView)findViewById(R.id.imageView13);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/skin9.png?alt=media&token=37f19c23-f812-4d50-8b6a-2a4cf3d9ef55")
                .override(147,144).centerCrop().into(((ImageView)findViewById(R.id.imageView13)));
        imageView13.setOnClickListener(this);








    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, HairSelection.class);
        startActivity(intent);

    }



}

