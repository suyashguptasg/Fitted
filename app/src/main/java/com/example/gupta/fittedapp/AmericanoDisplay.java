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


public class AmericanoDisplay extends AppCompatActivity implements View.OnClickListener {

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
        }
        else {
            position = 0;
        }
        jackets = getJackets();
        top = getTop();
        pants = getPants();
        shoes = getShoes();
        pictures = getPictures();

        ImageView picturesView = (ImageView)findViewById(R.id.pictureImage);
        Glide.with(this).load(pictures.get(position))
                .centerCrop().into(((ImageView)findViewById(R.id.pictureImage)));

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
                }
                else{
                    position = 0;
                }
                Intent intent = new Intent(getApplicationContext(), AmericanoDisplay.class);
                intent.putExtra("Position", position);
                startActivity(intent);
                break;
            case R.id.jacketsButton:
                Uri uri = Uri.parse(jackets.get(position)); // missing 'http://' will cause crashed
                Intent intent5 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent5);
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

    public ArrayList<String> getJackets(){
        ArrayList<String> jackets = new ArrayList<>();
        jackets.add("http://www.levi.com/US/en_US/mens-clothing-jackets/p/723340134");
        jackets.add("https://www.schottnyc.com/products/oiled-nubuck-leather-biker-jacket.htm?catID=5");
        jackets.add("http://www.orvis.com/p/classic-barn-coat/8r5r");
        jackets.add("https://www.schottnyc.com/products/navy-peacoat.htm?catID=44");
        jackets.add("http://www.levi.com/US/en_US/levi/p/723340206");
        return jackets;
    }

    public ArrayList<String> getTop(){
        ArrayList<String> top = new ArrayList<>();
        top.add("http://www.hm.com/us/product/69880?article=69880-C");
        top.add("https://www.jcrew.com/mens_category/Denim/shirtsandmore/PRDOVR~62202/62202.jsp");
        top.add("https://www.uniqlo.com/us/en/men-extra-fine-merino-v-neck-sweater-173211.html?dwvar_173211_color=COL66&cgid=men-sweaters");
        top.add("https://www.jcrew.com/p/mens_category/shirts/oxford/slim-american-pima-cotton-oxford-shirt-in-tattersall/G7407?color_name=blue-storm");
        top.add("https://www.uniqlo.com/us/en/men-flannel-checked-long-sleeve-shirt-401840.html?dwvar_401840_color=COL56");
        return top;
    }

    public ArrayList<String> getPants(){
        ArrayList<String> pants = new ArrayList<>();
        pants.add("https://www.jcrew.com/p/mens_category/pants/484/484-slimfit-pant-in-stretch-chino/E1589?color_name=white");
        pants.add("https://www.jcrew.com/mens_category/Denim/wallacebarnesstraight/PRDOVR~C9377/C9377.jsp");
        pants.add("https://www.uniqlo.com/us/en/men-stretch-selvedge-slim-fit-jeans-400130.html?dwvar_400130_color=COL69&cgid=men-jeans");
        pants.add("https://www.uniqlo.com/us/en/men-stretch-selvedge-slim-fit-jeans-400130.html?dwvar_400130_color=COL69&cgid=men-jeans");
        pants.add("https://www.jcrew.com/mens_category/Denim/wallacebarnesstraight/PRDOVR~C9377/C9377.jsp");
        return pants;
    }

    public ArrayList<String> getShoes(){
        ArrayList<String> shoes = new ArrayList<>();
        shoes.add("http://www.redwingheritage.com/us/USD/product/mens-footwear/6-inch-boots/6-copper-1907-01907");
        shoes.add("https://www.urbanoutfitters.com/shop/vans-sk8-hi-46-mte-dx-sneakerboot?category=SHOPBYBRAND&color=020");
        shoes.add("https://www.ghbass.com/product/proctor+buck.do?sortby=ourPicks&from=fn&selectedOption=205054");
        shoes.add("https://www.amazon.com/Thorogood-814-4200-Moc-Toe-Boot/dp/B002QQ8XRI");
        shoes.add("http://www.redwingheritage.com/us/USD/product/mens-footwear/6-inch-boots/iron-ranger-oxblood-mesa-08119");
        return shoes;
    }

    public ArrayList<String> getPictures() {
        ArrayList<String> pictures = new ArrayList<>();
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana1.jpg?alt=media&token=5b1bce2d-bdd5-470c-b233-615fc4d5ccce");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana2.jpg?alt=media&token=11c80e41-3de6-4671-8e91-1b8de2ce37c7");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana3.jpg?alt=media&token=50c71132-12fe-4130-81f5-2fd9e883fea9");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana4.jpg?alt=media&token=08a7b603-b67c-4e4d-84da-d8e7cc088512");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/americana5.jpg?alt=media&token=e1d0dbb9-e073-4a01-9c74-023c37afe163");
        return pictures;
    }
}