package com.dia2lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.linearLayoutVertical);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    public void pressbutton(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void pressbuttonframe(View view){
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
    public void pressbuttonlist(View view){
        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }
    public void pressbuttongrid(View view){
        Intent intent = new Intent(MainActivity.this, Main7Activity.class);
        startActivity(intent);
    }
}
