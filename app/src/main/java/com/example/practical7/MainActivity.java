package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton brushes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brushes = findViewById(R.id.brushes);
        View foundation = findViewById(R.id.foundation);

        brushes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2 .class);
                intent.putExtra("id", R.id.brushes);

                startActivity(intent);
            }
        });

        foundation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2 .class);
                intent.putExtra("id", R.id.foundation);

                startActivity(intent);
            }
        });

    }
}