package com.example.lesson3ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i;
    Button clear;
    Button btn;
    Random rnd;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        rnd=(Random) new Random();
        btn=(Button) findViewById(R.id.btn);
        tv=(TextView) findViewById(R.id.textView);
        clear=(Button) findViewById(R.id.clear);

    }

    public void clear(View view) {
        tv.setText("Number not found!");
    }

    public void set(View view) {
        i=rnd.nextInt(1000);
        tv.setText("number ="+String.valueOf(i));
    }
}
