package com.example.flutterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class payment extends AppCompatActivity {
    private Button button11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button button11 = (Button) findViewById(R.id.pay);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity7();
            }
        });
    }
        public void openAcvtivity7(){
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
    }
}