package com.example.flutterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cart extends AppCompatActivity {
    private Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button button10 = (Button) findViewById(R.id.out);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                openAcvtivity6();
            }
        });
    }
        public void openAcvtivity6(){
            Intent intent = new Intent(this, payment.class);
            startActivity(intent);
    }
}