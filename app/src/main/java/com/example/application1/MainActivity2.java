package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public Button register_button,backbutton,signinbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        register_button = findViewById( R.id.registerbutton );
        backbutton = findViewById( R.id.backwards );
        signinbutton = findViewById( R.id.signinbutton );

        backbutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        } );

        register_button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerbutton1();
            }
        } );






    }

    private void backActivity() {
        Intent intent2 =new Intent(MainActivity2.this,MainActivity.class);
        startActivity( intent2 );
    }

    private void registerbutton1() {
        Intent intent1 = new Intent(MainActivity2.this,Register.class);
        startActivity( intent1 );

    }
}