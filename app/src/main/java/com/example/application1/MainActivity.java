package com.example.application1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button signin,register;
    public TextView textView,textView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_main );

        textView = findViewById( R.id.textview21 );
        textView1 = findViewById( R.id.textview22 );
        register = findViewById( R.id.button21 );
        signin = findViewById( R.id.button22 );

        signin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Activity_signin();
            }
        } );
        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_register();
            }
        } );


    }

    public void Activity_register() {
        Intent i = new Intent(MainActivity.this,Register.class);
        startActivity( i );
    }

    private void Activity_signin() {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity( intent );
    }
}