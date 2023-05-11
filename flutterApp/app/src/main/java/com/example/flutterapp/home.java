package com.example.flutterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class home extends AppCompatActivity {
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button5 = (Button) findViewById(R.id.p5b);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity8();
            }
        });
        Button button6 = (Button) findViewById(R.id.p2b);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity8();
            }
        });
        Button button7 = (Button) findViewById(R.id.p3b);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity8();
            }
        });
        Button button8 = (Button) findViewById(R.id.p4b);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity8 ();
            }
        });
        Button button9 = (Button) findViewById(R.id.p5b);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity8();
            }
        });
        Button button11 = (Button) findViewById(R.id.p6b);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity5();
            }
        });

    }

        public void openAcvtivity5(){
            Intent intent = new Intent(this, cart.class);
            startActivity(intent);
    }
    public void openAcvtivity8(){

    }

}