package com.example.project1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private ImageView itemImageView;
    private ImageView cakeImageView;
    private ImageView matchaImageView;
    private ImageView searchImageView;
    private ImageView allImageView;
    private ImageView fastFoodImageView;
    private ImageView thaiFoodImageView;
    private ImageView coffeeImageView;
    private ImageView somtumImageView;
    private ImageView minicakeImageView;
    private ImageView pudthaiImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // อ้างอิงไปยังองค์ประกอบใน XML
        itemImageView = findViewById(R.id.imageView1);
        cakeImageView = findViewById(R.id.ImageView9);
        matchaImageView = findViewById(R.id.ImageView10);
        searchImageView = findViewById(R.id.ImageView3);
        allImageView = findViewById(R.id.ImageView4);
        fastFoodImageView = findViewById(R.id.ImageView5);
        thaiFoodImageView = findViewById(R.id.ImageView6);
        coffeeImageView = findViewById(R.id.ImageView7);
        somtumImageView = findViewById(R.id.imageView13);
        minicakeImageView = findViewById(R.id.imageView14);
        pudthaiImageView = findViewById(R.id.imageView15);

        // ตั้งค่าตัวจัดการคลิกสำหรับ ImageView แต่ละอัน
        searchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);

                // Start MainActivity
                startActivity(intent);
            }
        });

        itemImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity4
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);

                // Start MainActivity
                startActivity(intent);
            }
        });

        cakeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Start MainActivity2
                startActivity(intent);
            }
        });

        matchaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start MainActivity3
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                // Start MainActivity3
                startActivity(intent);
            }
        });



        allImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity6.class);

                // Start MainActivity1
                startActivity(intent);
            }
        });


        fastFoodImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity7.class);

                // Start MainActivity1
                startActivity(intent);
            }
        });

        thaiFoodImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity8.class);

                // Start MainActivity1
                startActivity(intent);
            }
        });

        coffeeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity9.class);

                // Start MainActivity1
                startActivity(intent);
            }
        });
       somtumImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);

                // Start MainActivity
                startActivity(intent);
            }
        });

        minicakeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);

                // Start MainActivity
                startActivity(intent);
            }
        });
        pudthaiImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);

                // Start MainActivity
                startActivity(intent);
            }
        });
    }
}
