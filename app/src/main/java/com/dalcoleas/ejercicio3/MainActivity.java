package com.dalcoleas.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn, btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        btn1= findViewById(R.id.btn2);
        btn2 = findViewById(R.id.btn3);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int viewId = v.getId();

        int [] red = {R.color.red,R.color.red1,R.color.red2,R.color.red3,R.color.red4,R.color.red5};
        int [] green = {R.color.green,R.color.green1,R.color.green2,R.color.green3,R.color.green4,R.color.green5};
        int [] blue = {R.color.blue,R.color.blue1,R.color.blue2,R.color.blue3,R.color.blue4,R.color.blue5};

        switch(viewId) {

            case R.id.btn1:
                btn.setBackgroundColor(getResources().getColor(red[new Random().nextInt(6)]));

            case R.id.btn2:
                btn1.setBackgroundColor(getResources().getColor(green[new Random().nextInt(6)]));

            case R.id.btn3:
                btn2.setBackgroundColor(getResources().getColor(blue[new Random().nextInt(6)]));
        }

    }
}
