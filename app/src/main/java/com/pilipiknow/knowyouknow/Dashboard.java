package com.pilipiknow.knowyouknow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    ImageView imgClick,imgClick2,imgClick3,imgClick4,imgClick5,imgClick6;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashoard);

        imgClick = (ImageView) findViewById(R.id.imageView1);
        imgClick2 = (ImageView) findViewById(R.id.imageView2);
        imgClick3 = (ImageView) findViewById(R.id.imageView3);
        imgClick4 = (ImageView) findViewById(R.id.imageView4);
        imgClick5= (ImageView) findViewById(R.id.imageView5);
        imgClick6 = (ImageView) findViewById(R.id.imageView6);
        logout = (Button) findViewById(R.id.button105) ;



        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, MainActivity.class);
                startActivity(create);


            }

        });
        imgClick2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, Presidents.class);
                startActivity(create);


            }

        });
        imgClick3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, Tribes.class);
                startActivity(create);


            }

        });
        imgClick4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, Places.class);
                startActivity(create);


            }

        });
        imgClick5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, Foods.class);
                startActivity(create);


            }

        });
        imgClick6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Dashboard.this, Festivals.class);
                startActivity(create);


            }

        });

        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Launcheractivity.class);
                startActivity(intent);



            }

        });
    }
}
