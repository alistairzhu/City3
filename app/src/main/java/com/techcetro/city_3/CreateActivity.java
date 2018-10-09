package com.techcetro.city_3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView bt1 = (TextView) findViewById(R.id.textView);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                bt1.setText("This is create!!!");




            }
        });

    }
}
