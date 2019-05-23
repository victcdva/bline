package com.gottnext.bline;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final LatLng parquemorelos = new LatLng(32.4993276, -116.9385335);
    private static final LatLng parisina = new LatLng(32.4976333, -116.9346984);
    private static final LatLng cecut = new LatLng(32.5303342, -117.0257139);

    private Marker mParqueMorelos;
    private Marker mParisina;
    private Marker mCecut;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if(status == ConnectionResult.SUCCESS) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setMyLocationButtonEnabled(true);


        LatLng museoDelTrompo = new LatLng(32.4951492, -116.9407001);
        mMap.addMarker(new MarkerOptions().position(museoDelTrompo).title("Museo del Trompo"));
        float zoomlevel = 16;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museoDelTrompo,zoomlevel));

        mParqueMorelos = mMap.addMarker(new MarkerOptions().position(parquemorelos).title("Parque Morelos"));
        mParqueMorelos.setTag(0);

        mParisina = mMap.addMarker(new MarkerOptions().position(parisina).title("Parisina"));
        mParisina.setTag(0);

        mCecut = mMap.addMarker(new MarkerOptions().position(cecut).title("Brisbane"));
        mCecut.setTag(0);
    }
}
