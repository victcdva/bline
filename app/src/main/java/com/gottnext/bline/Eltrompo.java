package com.gottnext.bline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eltrompo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eltrompo);
    }

    public void takeTickets(View view) {
        Intent intent = new Intent(this, TicketActivity.class);
        startActivity(intent);
    }
}
