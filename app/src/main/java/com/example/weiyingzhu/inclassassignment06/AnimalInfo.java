package com.example.weiyingzhu.inclassassignment06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AnimalInfo extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);

        Intent myIntent = getIntent();

        Animal a = (Animal) myIntent.getSerializableExtra(Keys.ANIMAL_KEY);

        ((TextView) findViewById(R.id.text)).setText(a.toString());
    }


}
