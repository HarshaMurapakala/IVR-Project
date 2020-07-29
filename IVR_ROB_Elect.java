package com.example.ivr_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IVR_ROB_Elect extends AppCompatActivity {
    private Button b;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivr__rob__elect);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        b = (Button)findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity(){
        Intent intent = new Intent(this , IVR_Mobile_info.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this , IVR_robbery_cat.class);
        startActivity(intent);
    }

}
