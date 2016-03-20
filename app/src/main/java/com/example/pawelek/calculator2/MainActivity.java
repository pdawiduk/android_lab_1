package com.example.pawelek.calculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    public void onResume(){
        super.onResume();
        Button basicButton = (Button) findViewById(R.id.basic) ;
        Button advancedButton = (Button) findViewById(R.id.advanced) ;
        Button aboutButton = (Button) findViewById(R.id.about) ;
        Button exitButton = (Button) findViewById(R.id.exit) ;

        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicIntent = new Intent(MainActivity.this, BasicActivity.class);
                startActivity(basicIntent);
            }
        });

        advancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedActivity.class);
                startActivity(intent);
            }
        });


    }

}
