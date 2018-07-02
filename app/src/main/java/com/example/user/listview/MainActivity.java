package com.example.user.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    String [] names = new String [] { "Windows","Linux", "Apple","MacOS","Samsung","Iphone","Google Play","App Store"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  // Находим список по идентификатору
        ListView List= (ListView) findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,
                android.R.layout.simple_list_item_1, names);

        // Присваиваем адаптер списку
        List.setAdapter(adapter);

    }
}
