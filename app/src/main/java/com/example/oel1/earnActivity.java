package com.example.oel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class earnActivity extends AppCompatActivity {
    Button btnLogin;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
radioGroup =findViewById(R.id.radiogroup);
textview =findViewById(R.id.text_view_selection);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                textview.setText("Your choice: " + radioButton.getText());

            }
        });
    }
    public void checkButton(View view){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        Toast.makeText(this,"Selected Radio Button: "+ radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
}