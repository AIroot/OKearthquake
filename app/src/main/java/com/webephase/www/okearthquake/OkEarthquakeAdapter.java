package com.webephase.www.okearthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * As {@link OkEarthquakeAdapter} knows how to create a list item layout for each earthquake
 * in the data source {a list of {@link OkEarthquake} objects}.
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */


public class OkEarthquakeAdapter extends ArrayAdapter<OkEarthquake> {
    /**
     * Constructs a new {@link OkEarthquakeAdapter}.
     *
     * @param context     of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public OkEarthquakeAdapter(Context context, List<OkEarthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Return a list item view the diplays information about the earthquake at the given position
     * in the list of eartquakes.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_items, parent, false
            );
        }
        // Find the earthquake at the given position in the list of earthquakes
        OkEarthquake currentEarthquake = getItem(position);


        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.Magnitude);
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.Location);
        // Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getmLocation());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getmDate());

        // Return the list item view that is now showing the appropriate date
        return listItemView;
    }
}

