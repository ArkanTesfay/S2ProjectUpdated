package com.example.arkantesfaymekonen.s2project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class LoadingActivtiy extends AppCompatActivity {

    Button earth;
    Button sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_activtiy);
        earth=(Button)findViewById(R.id.earth);
        sun=(Button)findViewById(R.id.sun);


        earth.animate().rotation(10);
        Thread thread=new Thread() {
            @Override
            public void run() {
                try{
                    sleep(5000);
                    Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(i);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
