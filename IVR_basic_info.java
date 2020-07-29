package com.example.ivr_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IVR_basic_info extends AppCompatActivity {
    private Button b;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivr_basic_info);
        b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(this , ivr_basic_discription.class);
        startActivity(intent);
    }


}
