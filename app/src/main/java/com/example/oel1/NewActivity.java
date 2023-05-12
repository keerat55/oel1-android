package com.example.oel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    Button btnplan;
    Button btnearn;
    Button btntrack;
    Button btncost;
    Button btnlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        btnplan=(Button) findViewById(R.id.buttonplan);
        btnearn=(Button) findViewById(R.id.buttonearn);
        btntrack=(Button) findViewById(R.id.buttontrack);
        btncost=(Button) findViewById(R.id.buttoncost);
        btnlink=(Button) findViewById(R.id.buttonlink);
        btnplan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(),planActivity.class);
                startActivity(intent);
            }
    });
        btnearn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(),earnActivity.class);
                startActivity(intent);
            }
        });
        btntrack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(),trackActivity.class);
                startActivity(intent);
            }
        });
        btncost.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(),costActivity.class);
                startActivity(intent);
            }
        });
        btnlink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(),linkActivity.class);
                startActivity(intent);
            }
        });
}}