package com.gottnext.bline;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private ArrayList<Place> data;
    private Activity activity;
    private static LayoutInflater inflater;

    @Override
    public int getCount() { return this.data.size(); }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) view = inflater.inflate(R.layout.item_list, null);
        ImageView imageIcon = view.findViewById(R.id.imageViewLogo);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvDescription = view.findViewById(R.id.tvDescription);

        Place p = this.data.get(position);

        int r = view.getResources().getIdentifier(p.getImage(), "drawable", this.activity.getPackageName());
        imageIcon.setImageResource(r);
        tvTitle.setText(p.getTitle());
        tvDescription.setText(p.getDescription());
        return view;
    }

    public ListAdapter(Activity activity, ArrayList<Place> data) {
        this.activity =  activity;
        this.data = data;
        inflater = (LayoutInflater)this.activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
