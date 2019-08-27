package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button askbutton;
    ImageView BallImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askbutton=findViewById(R.id.ask_button);
        BallImage=findViewById(R.id.image_eightball);
        final int[] decisions={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random Nrandom=new Random();
                int number=Nrandom.nextInt(5);
                Log.d("magic","Random Number is " +number);
                BallImage.setImageResource(decisions[number]);

            }
        });
    }
}

