package com.gottnext.bline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TheHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_home);

        ListView listViewPlaces = findViewById(R.id.listRecentPlaces);
        ListAdapter inflater = new ListAdapter(TheHomeActivity.this, Place.getAll());
        listViewPlaces.setAdapter(inflater);
    }
}
