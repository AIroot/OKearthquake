package com.webephase.www.okearthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OkEarthQuakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_earth_quake);

        // Create a list of earthquake locations.
        ArrayList<OkEarthquake> earthquakes = QueryUtilsJSON.extractEarthquakes();

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new adapter that take the list of earthquakes as input
        OkEarthquakeAdapter adapter = new OkEarthquakeAdapter(this, earthquakes);
        // Set the adapter on the ListView
        // So the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);

    }
}
