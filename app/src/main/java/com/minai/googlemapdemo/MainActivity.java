package com.minai.googlemapdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SupportMapFragment mapFragment;
    private GoogleMap googleMap;
    private Switch locationSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we cast the Google map fragment into the supportmapfragment
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fgm_googlemaps_id);
        mapFragment.getMapA



    }
}