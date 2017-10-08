package com.example.gupta.fittedapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by Gupta on 10/7/2017.
 */

public class Measurements extends AppCompatActivity {
    int height, chest, waist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.measures);
        ImageView imageView15 = (ImageView)findViewById(R.id.imageView15);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/finish%20button.png?alt=media&token=cc5e3ab4-1246-4dbf-b786-dc6996ccfe55")
                .override(340,108).centerCrop().into(((ImageView)findViewById(R.id.imageView15)));
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Style.class);
                startActivity(intent);
            }
        });
    }

}

