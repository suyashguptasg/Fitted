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

public class FaceSelector extends AppCompatActivity implements View.OnClickListener {
    ImageView face1, face2, face3, face4, face5, face6;
    int selected;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face_type);
        ImageView face1 = (ImageView)findViewById(R.id.face1);
        face1.setOnClickListener(this);
        ImageView face2 = (ImageView)findViewById(R.id.face2);
        face2.setOnClickListener(this);
        ImageView face3 = (ImageView)findViewById(R.id.face3);
        face3.setOnClickListener(this);
        ImageView face4 = (ImageView)findViewById(R.id.face4);
        face4.setOnClickListener(this);
        ImageView face5 = (ImageView)findViewById(R.id.face5);
        face5.setOnClickListener(this);
        ImageView face6 = (ImageView)findViewById(R.id.face6);
        face6.setOnClickListener(this);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/oblong%20button.png?alt=media&token=6f08e0fd-a2ca-423a-ab67-011d6ccbc6dd")
                .override(45,93).into(((ImageView)findViewById(R.id.face1)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/oval%20button.png?alt=media&token=ecc63371-2034-4e5e-b341-f25fa106de94")
                .override(46,95).into(((ImageView)findViewById(R.id.face2)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/diamond%20button.png?alt=media&token=e67694ec-7c9e-4eb9-b3c0-a05e0935f17d")
                .override(58,93).into(((ImageView)findViewById(R.id.face3)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/round%20button.png?alt=media&token=5449962d-6090-4625-8b5a-77af92d12267")
                .override(50,91).into(((ImageView)findViewById(R.id.face4)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/square%20button.png?alt=media&token=ff9bd205-2452-4218-91eb-7de01a59d123")
                .override(53,94).into(((ImageView)findViewById(R.id.face5)));
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/triangle%20button.png?alt=media&token=a4759b95-5c86-45b3-b291-014287c5edc3")
                .override(50,94).into(((ImageView)findViewById(R.id.face6)));

        intent = new Intent(this, Measurements.class);
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
            case R.id.face4:
                selected = 4;
                startActivity(intent);
                break;
            case R.id.face5:
                selected = 5;
                startActivity(intent);
                break;
            case R.id.face6:
                selected = 6;
                startActivity(intent);
                break;
            case R.id.face3:
                selected = 3;
                startActivity(intent);
                break;
        }

    }
}
