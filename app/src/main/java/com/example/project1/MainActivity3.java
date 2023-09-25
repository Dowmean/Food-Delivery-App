//matcha page
package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    private ImageView page3ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        page3ImageView = findViewById(R.id.imageView2);

        // Set an OnClickListener for the checkImageView
        page3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity4
                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);

                // Start MainActivity4
                startActivity(intent);
            }
        });
    }
}
