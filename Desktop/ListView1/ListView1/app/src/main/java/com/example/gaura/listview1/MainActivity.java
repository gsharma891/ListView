package com.example.gaura.listview1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private static final String TAG = "MainActivity";

    private String[] lessions = new String[]{
            //"Relative Layout",
            //"Linear Layout",
            "List View"
    };

    //private ArrayList<String> planetList = new ArrayList<~>();
    ListView practiceListView;

    ArrayAdapter<String> listAdapter;

    protected void onStart(){
        super.onStart();
        Log.d(TAG,"MainActivity : onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        practiceListView = (ListView)findViewById(R.id.mainListView);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lessions);
        practiceListView.setAdapter(listAdapter);
        practiceListView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
        Log.d(TAG,"onitemClicked :"+position);
        switch (position){
            case 0:
                Intent intent = new Intent(this, CustomAdapterDemo.class);
                startActivity(intent);
                break;
        }
    }

}
