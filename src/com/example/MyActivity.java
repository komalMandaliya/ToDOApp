package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyActivity extends Activity
{

    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapters;
    ListView lvItems;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lvItems =(ListView)findViewById(R.id.lvItems);


    }
}
