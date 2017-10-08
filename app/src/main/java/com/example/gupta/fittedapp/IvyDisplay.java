package com.example.gupta.fittedapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class IvyDisplay extends AppCompatActivity implements View.OnClickListener {

    public static int position;
    ArrayList<String> jackets = new ArrayList<>();
    ArrayList<String> top = new ArrayList<>();
    ArrayList<String> pants = new ArrayList<>();
    ArrayList<String> shoes = new ArrayList<>();
    ArrayList<String> pictures = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.americano_display);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if (bd != null) {
            position = (int) bd.get("Position");
        } else {
            position = 0;
        }
        jackets = getJackets();
        top = getTop();
        pants = getPants();
        shoes = getShoes();
        pictures = getPictures();

        ImageView picturesView = (ImageView) findViewById(R.id.pictureImage);
        Glide.with(this).load(pictures.get(position))
                .centerCrop().into(((ImageView) findViewById(R.id.pictureImage)));

        ImageView jacketsButton = (ImageView)findViewById(R.id.jacketsButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/jacket%20button.png?alt=media&token=1ba0f852-9acc-406e-9d84-de052b85e9d6")
                .override(587,94).into(((ImageView)findViewById(R.id.jacketsButton)));
        jacketsButton.setOnClickListener(this);

        ImageView shirtsButton = (ImageView)findViewById(R.id.shirtsButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/shirt%20button.png?alt=media&token=43d8df64-f2fe-4003-9093-b4f230da44bd")
                .override(587,94).into(((ImageView)findViewById(R.id.shirtsButton)));
        shirtsButton.setOnClickListener(this);

        ImageView pantsButton = (ImageView)findViewById(R.id.pantsButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/pants%20button.png?alt=media&token=fb12b320-1f99-4162-afe5-c7047120f651")
                .override(587,94).into(((ImageView)findViewById(R.id.pantsButton)));
        pantsButton.setOnClickListener(this);

        ImageView shoesButton = (ImageView)findViewById(R.id.shoesButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/shoes%20button.png?alt=media&token=a0d1afc0-7e92-484a-b614-47cdb3853169")
                .override(587,94).into(((ImageView)findViewById(R.id.shoesButton)));
        shoesButton.setOnClickListener(this);

        ImageView nextButton = (ImageView)findViewById(R.id.nextButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/next%20button.png?alt=media&token=71810a93-9232-48fb-b4a7-e49f179da50a")
                .override(734,117).into(((ImageView)findViewById(R.id.nextButton)));
        nextButton.setOnClickListener(this);

        ImageView backButton = (ImageView)findViewById(R.id.backButton);
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/exit%20button.png?alt=media&token=9f907301-d215-4faf-9671-4a3530da5fb3")
                .override(734,117).into(((ImageView)findViewById(R.id.backButton)));
        backButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextButton:
                if (position < 4) {
                    position += 1;
                } else {
                    position = 0;
                }
                Intent intent = new Intent(getApplicationContext(), IvyDisplay.class);
                intent.putExtra("Position", position);
                startActivity(intent);
                break;
            case R.id.jacketsButton:
                if (jackets.get(position) != " ") {
                    Uri uri = Uri.parse(jackets.get(position)); // missing 'http://' will cause crashed
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent5);
                }
                break;
            case R.id.shirtsButton:
                Uri uri2 = Uri.parse(top.get(position)); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            case R.id.pantsButton:
                Uri uri3 = Uri.parse(pants.get(position)); // missing 'http://' will cause crashed
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent3);
                break;
            case R.id.shoesButton:
                Uri uri4 = Uri.parse(shoes.get(position)); // missing 'http://' will cause crashed
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                startActivity(intent4);
                break;
            case R.id.backButton:
                Intent intentBack = new Intent(getApplicationContext(), Style.class);
                startActivity(intentBack);
        }


    }

    public ArrayList<String> getJackets() {
        ArrayList<String> jackets = new ArrayList<>();
        jackets.add("https://www.uniqlo.com/us/en/men-long-sleeve-sweatshirt-400332.html?dwvar_400332_color=COL03#start=29&cgid=men-sweatshirts-and-sweatpants");
        jackets.add("http://www.brooksbrothers.com/Donegal-Crewneck-Sweater/MS00829,default,pd.html?dwvar_MS00829_Color=BLUE&contentpos=16&cgid=0224");
        jackets.add("https://www.jcrew.com/p/mens_category/sportcoatsandvests/wool/ludlow-blazer-in-herringbone-english-tweed/C8778?color_name=woodland-green");
        jackets.add("http://www.brooksbrothers.com/Donegal-Crewneck-Sweater/MS00829,default,pd.html?dwvar_MS00829_Color=GREEN&contentpos=16&cgid=0224");
        jackets.add("https://www.llbean.com/llb/shop/115663?page=mountain-classic-anorak");
        return jackets;
    }

    public ArrayList<String> getTop() {
        ArrayList<String> top = new ArrayList<>();
        top.add("https://www.uniqlo.com/us/en/men-oxford-slim-fit-long-sleeve-shirt-164168.html?dwvar_164168_color=COL63&cgid=men-casual-shirts");
        top.add("https://www.uniqlo.com/us/en/men-flannel-checked-long-sleeve-shirt-401841.html?dwvar_401841_color=COL35&cgid=men-casual-shirts");
        top.add("https://www.jcrew.com/p/mens_category/shirts/denimchambray/slim-indigo-japanese-chambray-shirt/03066?color_name=indigo");
        top.add("https://www.uniqlo.com/us/en/men-oxford-slim-fit-long-sleeve-shirt-164168.html?dwvar_164168_color=COL63&cgid=men-casual-shirts");
        top.add("http://www.ralphlauren.com/product/index.jsp?productId=134848826");
        return top;
    }

    public ArrayList<String> getPants() {
        ArrayList<String> pants = new ArrayList<>();
        pants.add("https://www.jcrew.com/mens_category/Denim/wallacebarnesstraight/PRDOVR~C9377/C9377.jsp");
        pants.add("https://www.jcrew.com/p/mens_category/pants/484/484-slimfit-pant-in-corduroy/G7128");
        pants.add("https://www.jcrew.com/mens_category/Denim/wallacebarnesslim/PRDOVR~F7948/F7948.jsp");
        pants.add("http://www.dockers.com/US/en_US/dockers/p/399000000");
        pants.add("http://www.patagonia.com/product/mens-clean-color-shorts/57885.html?dwvar_57885_color=CTSB&cgid=mens-shorts");
        return pants;
    }

    public ArrayList<String> getShoes() {
        ArrayList<String> shoes = new ArrayList<>();
        shoes.add("https://www.bexley.com/Bexley/en/p/dress_shoes/enfieldiigommecountry?coloris=chocolat_patine");
        shoes.add("http://www.allenedmonds.com/shoes/mens-shoes/oxford-derby-shoes/mcallister-wingtip-oxford/SF6215.html");
        shoes.add("http://www.allenedmonds.com/shoes/mens-shoes/oxford-derby-shoes/mcallister-wingtip-oxford/SF6215.html");
        shoes.add("http://www.sebago.com/US/en/spinnaker-leather/19392M.html?dwvar_19392M_color=B720377");
        shoes.add("http://www.sebago.com/US/en/docksides-leather/19163M.html?dwvar_19163M_color=B720373#cgid=docksides&start=1");
        return shoes;
    }

    public ArrayList<String> getPictures() {
        ArrayList<String> pictures = new ArrayList<>();
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy1.jpg?alt=media&token=b2f5c4c6-5c05-4174-9305-c4d1c95cda8b");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy2.jpg?alt=media&token=49960d6f-0597-4868-9769-28d534d5e730");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy3.jpg?alt=media&token=2290ae01-979a-4746-92e8-2d29be75000f");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy4.jpg?alt=media&token=42c47b72-7245-44ff-b71a-3ae1f3cf33b0");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/ivy5.jpg?alt=media&token=05642d38-1a19-4cf8-832a-da5a542bb919");
        return pictures;
    }
}