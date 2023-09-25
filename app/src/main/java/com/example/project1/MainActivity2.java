//about cake page
package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    private ImageView checkImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Find the ImageView with the ID imageView5
        checkImageView = findViewById(R.id.imageView9);

        // Set an OnClickListener for the checkImageView
        checkImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity4
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);

                // Start MainActivity4
                startActivity(intent);
            }
        });
    }
}
