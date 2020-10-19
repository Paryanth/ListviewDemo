package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryList = findViewById(R.id.list) ;
        String country[]  = getResources().getStringArray(R.array.country) ;
        ArrayAdapter<String> myAdapter =  new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,country);
        countryList.setAdapter(myAdapter);
        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = parent.getItemAtPosition(position).toString() ;
                Toast.makeText(MainActivity.this, "You have clicked :"+name, Toast.LENGTH_SHORT).show();
            }
        });
    }

}