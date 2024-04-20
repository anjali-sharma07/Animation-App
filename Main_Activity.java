package com.example.animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt;
        Button btntranslate, btnalpha,btnrotate,btnscale;
        txt = findViewById(R.id.txt);
        btntranslate = findViewById(R.id.btntranslate);
        btnalpha = findViewById(R.id.btnalpha);
        btnrotate = findViewById(R.id.btnrotate);
        btnscale = findViewById(R.id.btnscale);

        btntranslate.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                  Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                  txt.startAnimation(move);
            }
        });
        btnalpha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Animation dim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txt.startAnimation(dim);
            }
        });

        btnrotate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Animation rotation =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txt.startAnimation(rotation);
            }
        });

        btnscale.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                txt.startAnimation(scale);
            }
        });
    }
}
