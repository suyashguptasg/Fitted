package com.example.gupta.fittedapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by Gupta on 10/7/2017.
 */

public class Begin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begin);
        ImageView beginButton = (ImageView)findViewById(R.id.imageView);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/begin_button.png?alt=media&token=a6f43cca-b672-4c9a-b9ca-373ce1ff7fde")
                .override(340,108).centerCrop().into(((ImageView)findViewById(R.id.imageView)));
        beginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ColorPickers.class);
        startActivity(intent);

    }
}

