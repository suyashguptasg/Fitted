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


public class StreetDisplay extends AppCompatActivity implements View.OnClickListener {

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
                Intent intent = new Intent(getApplicationContext(), StreetDisplay.class);
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
        jackets.add("https://www.uniqlo.com/us/en/men-ma-1-blouson-401742.html?dwvar_401742_color=COL69");
        jackets.add("http://shop.nordstrom.com/s/the-north-face-venture-2-waterproof-jacket/4621842");
        jackets.add("http://www.adidas.com/us/essentials-3-stripes-wind-jacket/CD8792.html");
        jackets.add(" ");
        jackets.add(" ");
        return jackets;
    }

    public ArrayList<String> getTop() {
        ArrayList<String> top = new ArrayList<>();
        top.add("https://www.uniqlo.com/us/en/men-long-sleeve-sweatshirt-400332.html?dwvar_400332_color=COL03#start=29&cgid=men-sweatshirts-and-sweatpants");
        top.add("http://shop.doverstreetmarket.com/us/comme-des-garcons/play/t-shirts/grey-play-t-shirt");
        top.add("https://www.uniqlo.com/us/en/men-supima-cotton-v-neck-short-sleeve-t-shirt-199145.html?dwvar_199145_color=COL54#start=6&cgid=men-t-shirts");
        top.add("http://www.ralphlauren.com/product/index.jsp?productId=84775876");
        top.add("https://www.uniqlo.com/us/en/men-long-sleeve-sweatshirt-400332.html?dwvar_400332_color=COL03#start=29&cgid=men-sweatshirts-and-sweatpants");
        return top;
    }

    public ArrayList<String> getPants() {
        ArrayList<String> pants = new ArrayList<>();
        pants.add("https://www.jcrew.com/p/mens_category/pants/484/484-slimfit-pant-in-stretch-chino/E1589?color_name=white");
        pants.add("https://www.uniqlo.com/us/en/men-selvedge-skinny-fit-jeans-172731.html?dwvar_172731_color=COL09");
        pants.add("https://www.uniqlo.com/us/en/men-stretch-selvedge-slim-fit-jeans-400130.html?dwvar_400130_color=COL69&cgid=men-jeans-selvedge-jeans");
        pants.add("https://www.uniqlo.com/us/en/men-slim-fit-damaged-jeans-191943.html?dwvar_191943_color=COL62&cgid=men-jeans");
        pants.add("https://www.uniqlo.com/us/en/men-selvedge-skinny-fit-jeans-172731.html?dwvar_172731_color=COL09");
        return pants;
    }

    public ArrayList<String> getShoes() {
        ArrayList<String> shoes = new ArrayList<>();
        shoes.add("http://www.adidas.com/us/stan-smith-shoes/M20324.html");
        shoes.add("http://www.newbalance.com/pd/574-new-balance/ML574-X.html?dwvar_ML574-X_color=Mercury%20Red_with_Silver%20Mink_and_White&existingColorSwatches=true#color=Mercury Red_with_Silver Mink_and_White");
        shoes.add("http://shop.nordstrom.com/s/comme-des-garcons-play-x-converse-chuck-taylor-low-top-sneaker-men/4049087?origin=category-personalizedsort&fashioncolor=WHITE%20CANVAS");
        shoes.add("https://store.nike.com/us/en_us/pd/converse-chuck-taylor-monochrome-high-top-unisex-shoe/pid-11214091/pgid-12218163");
        shoes.add("http://www.adidas.com/us/stan-smith-shoes/M20324.html");
        return shoes;
    }

    public ArrayList<String> getPictures() {
        ArrayList<String> pictures = new ArrayList<>();
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/street1.jpg?alt=media&token=f9a194aa-fe48-4c26-a767-11385222119e");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/street2.jpg?alt=media&token=a46e732e-2c6f-4fcd-a90a-29913581f274");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/street3.jpg?alt=media&token=917a1594-919b-4ebb-a2ae-508db0febee3");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/street4.jpg?alt=media&token=9aa54afc-47b0-4507-bd93-35b40effc824");
        pictures.add("https://firebasestorage.googleapis.com/v0/b/fittedapp-a424c.appspot.com/o/street5.jpg?alt=media&token=98a30bd2-7b7d-4c57-ac5e-e99521a5266c");
        return pictures;
    }
}