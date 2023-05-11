package com.example.flutterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginPage extends AppCompatActivity {
    private Button button4;
    private TextView button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        button3 = (TextView) findViewById(R.id.signup);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAvtivity3();
            }});

        button4 =(Button) findViewById(R.id.login);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAvtivity4();
            }
        });
    }
        public void openAvtivity3(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);}
    public void openAvtivity4(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);}

}