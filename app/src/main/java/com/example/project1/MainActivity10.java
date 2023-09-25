//search
package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity10 extends AppCompatActivity {
    private ImageView searchImageView; // Corrected variable name
    private ImageView checkoutImageView;
    private ImageView greenteaImageView;
    private ImageView imageViewNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        searchImageView = findViewById(R.id.imageView1); // Corrected variable name
        checkoutImageView = findViewById(R.id.imageView4);
        greenteaImageView = findViewById(R.id.imageView5);

        imageViewNet = findViewById(R.id.imageViewNet);

        Glide.with(this)
                .load("https://shorturl.asia/2JCF8")
                .into(imageViewNet); //des name

        searchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity10.this, MainActivity.class);

                // Start MainActivity
                startActivity(intent);
            }
        });


        checkoutImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity4
                Intent intent = new Intent(MainActivity10.this, MainActivity4.class);

                // Start MainActivity4
                startActivity(intent);
            }
        });

        greenteaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity4
                Intent intent = new Intent(MainActivity10.this, MainActivity3.class);

                // Start MainActivity4
                startActivity(intent);
            }
        });
    }
}
