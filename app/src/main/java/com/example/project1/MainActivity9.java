//coffee
package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity9 extends AppCompatActivity {
    private ImageView coffeenImageView; // You might want to change the variable name to 'allImageView'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        coffeenImageView = findViewById(R.id.imageView1); // You might want to change the variable name to 'coffeenImageView'

        coffeenImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity
                Intent intent = new Intent(MainActivity9.this, MainActivity.class);

                // Start MainActivity
                startActivity(intent);
            }
        });
    }
}
