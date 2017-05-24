package com.codeclan.example.topdogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopDogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dogs_list);

        TopDogs topDogs = new TopDogs();
        ArrayList<Dog> list = topDogs.getList();

        TopDogsAdapter dogsAdapter = new TopDogsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dogsAdapter);

    }
    public void getDog(View listItem) {
        Dog dog = (Dog) listItem.getTag();
        Log.d("Dog Breed", dog.getBreed());
    }


}
