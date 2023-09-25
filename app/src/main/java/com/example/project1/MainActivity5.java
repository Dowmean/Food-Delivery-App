//order matcha
package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {
    private ImageView backImageView;
    private ImageView checktwoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        checktwoImageView = findViewById(R.id.imageView3);
        backImageView = findViewById(R.id.imageView1);

        checktwoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);

                // Start MainActivity
                startActivity(intent);
            }
        });

        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);

                // Start MainActivity5
                startActivity(intent);
            }
        });
    }
}