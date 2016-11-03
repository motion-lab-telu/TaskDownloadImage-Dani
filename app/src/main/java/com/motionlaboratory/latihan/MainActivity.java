package com.motionlaboratory.latihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button imageClick, moveClick;
    String imageUrl = "https://lh4.googleusercontent.com/-MsmE8bHqpnM/AAAAAAAAAAI/AAAAAAAAAY8/hQlhn1F7AnE/photo.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image_view);
        imageClick =  (Button) findViewById(R.id.image_click);
        moveClick = (Button) findViewById(R.id.moving_button);

        imageClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this).load(imageUrl).into(imageView);
                Toast.makeText(MainActivity.this, "Aku adalah aku", Toast.LENGTH_SHORT).show();
            }
        });

        moveClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                intent.putExtra("url", imageUrl);
                startActivity(intent);

            }
        });


    }
}
