package com.example.abdik.helloworld;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AppCompatActivity{





    private ImageButton sadButton;
    private ImageButton okButton;
    private ImageButton happyButton;
    private ImageButton furiousButton;
    private ImageButton panicButton;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        sadButton = (ImageButton) findViewById(R.id.sadButton);
        okButton = (ImageButton) findViewById(R.id.okButton);
        happyButton = (ImageButton) findViewById(R.id.happyButton);
        furiousButton = (ImageButton) findViewById(R.id.furiousButton);
        panicButton = (ImageButton) findViewById(R.id.panicButton);


      //mBtLaunchActivity3.setOnClickListener(this);

        okButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), okay.class);

                startActivity(intent);
                }


            });
        sadButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);

                startActivity(intent);
            }


        });
        happyButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), happyActivity.class);

                startActivity(intent);
            }


        });
        furiousButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), furious.class);

                startActivity(intent);
            }


        });
        panicButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), panic.class);

                startActivity(intent);
            }


        });




    }


}
