package com.techcetro.city_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                bt1.setText("Automatically created a listener!!!");

              //  Intent create = new Intent(MainActivity.this, CreateActivity.class);
               // startActivity(create);
            }
        });

    }
}
