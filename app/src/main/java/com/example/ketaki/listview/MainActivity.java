package com.example.ketaki.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> dataset = new ArrayList<>();
        dataset.add("India");
        dataset.add("China");
        dataset.add("Sri Lanka");
        dataset.add("japan");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataset);
        ((ListView) findViewById(R.id.listView)).setAdapter(adapter);

        ((ListView) findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter<String> adapterLocal = (ArrayAdapter<String>) parent.getAdapter();
                String con = adapterLocal.getItem(position);
                ((EditText) findViewById(R.id.text1)).setText(con);

            }
        });









