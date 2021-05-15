package com.example.lottieplayground;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends Activity {

    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottie = findViewById(R.id.lottie);
        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottie.playAnimation();
                Toast.makeText(MainActivity.this, "onClick", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
