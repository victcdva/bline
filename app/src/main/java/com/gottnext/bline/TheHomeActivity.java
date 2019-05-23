package com.gottnext.bline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class TheHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_home);

        ListView listViewPlaces = findViewById(R.id.listRecentPlaces);
        ListAdapter inflater = new ListAdapter(TheHomeActivity.this, Place.getAll());
        listViewPlaces.setAdapter(inflater);

        listViewPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(TheHomeActivity.this, Eltrompo.class);
                        break;
                    case 1:
                        intent = new Intent(TheHomeActivity.this, Parquemorelos.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}
