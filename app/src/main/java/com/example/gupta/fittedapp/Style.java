package com.example.gupta.fittedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Style extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.styles);

        ImageView classic = (ImageView)findViewById(R.id.classic);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/classic%20button.png?alt=media&token=bdf480a2-9cb0-401f-8e5f-9be14c6b5078")
                .override(1044,318).centerCrop().into(((ImageView)findViewById(R.id.classic)));
        classic.setOnClickListener(this);

        ImageView street = (ImageView)findViewById(R.id.street);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/streetwear%20button.png?alt=media&token=ae1ec310-1109-45bc-8c73-7b9c66e63164")
                .override(1044,318).centerCrop().into(((ImageView)findViewById(R.id.street)));
        street.setOnClickListener(this);

        ImageView amer = (ImageView)findViewById(R.id.amer);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana%20button.png?alt=media&token=7a23d531-a08d-4614-9662-1f1b1ad56e5f")
                .override(1044,318).centerCrop().into(((ImageView)findViewById(R.id.amer)));
        amer.setOnClickListener(this);

        ImageView cock = (ImageView)findViewById(R.id.cock);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/cocktail%20button.png?alt=media&token=fbab5d44-917f-4d58-8ca4-6833df6dd8c2")
                .override(1044,318).centerCrop().into(((ImageView)findViewById(R.id.cock)));
        cock.setOnClickListener(this);

        ImageView ivy = (ImageView)findViewById(R.id.ivy);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy%20button.png?alt=media&token=970c8c7e-c571-468d-b16c-e4b0b9fc4000")
                .override(1044,318).centerCrop().into(((ImageView)findViewById(R.id.ivy)));
        ivy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.classic:
                break;
            case R.id.street:
                Intent intent2 = new Intent(getApplicationContext(), StreetDisplay.class);
                startActivity(intent2);
                break;
            case R.id.amer:
                Intent intent = new Intent(getApplicationContext(), AmericanoInfo.class);
                startActivity(intent);
                break;
            case R.id.cock:
                break;
            case R.id.ivy:
                Intent intent3 = new Intent(getApplicationContext(), IvyDisplay.class);
                startActivity(intent3);
                break;
        }

    }
}
