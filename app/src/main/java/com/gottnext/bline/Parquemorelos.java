package com.gottnext.bline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Parquemorelos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parquemorelos);
    }

    public void takeTickets2(View view) {
        Intent intent = new Intent(this, TicketActivity2.class);
        startActivity(intent);
    }
}
