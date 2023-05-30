package com.vitaniapermatasari_202102334.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageurl = "https://balitoursclub.net/wp-content/uploads/2019/02/The-Legian-Bali-Hotel.jpg";
        Picasso.with(this).load(imageurl).into(_imageView1);
    }
}