package com.gottnext.bline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView imageView2 = v.findViewById(R.id.serviceprovider);
        imageView2.setOnClickListener(this);

        ImageView imageView = v.findViewById(R.id.visitasrecientes);
        imageView.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.serviceprovider:
                Intent intent = new Intent(getActivity(), TheHomeActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.visitasrecientes:
                Intent intent2 = new Intent(getActivity(), RecentPlacesActivity.class);
                getActivity().startActivity(intent2);
                break;
        }
    }
}
