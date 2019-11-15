package com.pilipiknow.knowyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Launcheractivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcheractivity);


        login = (Button) findViewById(R.id.btn_login12) ;


        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent create = new Intent(Launcheractivity.this, LoginActivity.class);
                startActivity(create);



            }

        });
    }
}
