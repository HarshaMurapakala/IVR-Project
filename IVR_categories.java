package com.example.ivr_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IVR_categories extends AppCompatActivity {
    private Button b;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivr_categories);
        b = (Button)findViewById(R.id.button8);
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
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this,IVR_Robbery_dis.class);
        startActivity(intent);
    }

    public void onButtonClick(){

    }
}
