//oder cake
package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private ImageView backImageView;
    private ImageView my1ImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        my1ImageView = findViewById(R.id.imageView3);
        backImageView = findViewById(R.id.imageView1);

        my1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);

                // Start MainActivity
                startActivity(intent);
            }
        });

        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);

                // Start MainActivity2
                startActivity(intent);
            }
        });

        // Add any additional code you want to run when this activity is created
    }
}
