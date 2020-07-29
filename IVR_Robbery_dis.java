package com.example.ivr_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IVR_Robbery_dis extends AppCompatActivity {
    private Button b;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivr__robbery_dis);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this , IVR_categories.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, IVR_robbery_cat.class);
        startActivity(intent);
    }
    public void onButtonClick(View v){

    }
}

