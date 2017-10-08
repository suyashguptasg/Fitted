package com.example.gupta.fittedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class AmericanoInfo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.americano_info);
        ImageView beginButton = (ImageView)findViewById(R.id.imageView14);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/begin_button.png?alt=media&token=a6f43cca-b672-4c9a-b9ca-373ce1ff7fde")
                .override(340,108).centerCrop().into(((ImageView)findViewById(R.id.imageView14)));
        beginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, AmericanoDisplay.class);
        startActivity(intent);

    }

}