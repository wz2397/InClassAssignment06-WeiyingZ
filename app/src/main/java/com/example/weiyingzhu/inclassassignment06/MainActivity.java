package com.example.weiyingzhu.inclassassignment06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        Intent mrIntent = new Intent(this, AnimalInfo.class);

        String name = ((EditText) findViewById(R.id.animal)).getText().toString();
        int legNumber = Integer.parseInt(((EditText) findViewById(R.id.leg)).getText().toString());
        boolean fur = ((CheckBox) findViewById(R.id.hasFur)).isChecked();
        String what = ((EditText) findViewById(R.id.information)).getText().toString();

        Animal animals = new Animal(legNumber, name, fur, what);


        mrIntent.putExtra(Keys.ANIMAL_KEY, animals);
        startActivity(mrIntent);

    }
}
