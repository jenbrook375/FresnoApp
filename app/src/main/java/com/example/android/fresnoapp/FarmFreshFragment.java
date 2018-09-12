package com.example.android.fresnoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// fragment that displays local produce vendors
public class FarmFreshFragment extends Fragment {
    public FarmFreshFragment() {
        // required empty public constuctor
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        // creates list of places
        places.add(new Place(R.drawable.clovis_fm, getString(R.string.clovis_farmer_mkt),
                getString(R.string.clovis_farmer_loc),
                getString(R.string.clovis_farmer_info)));// image by Jennifer Brookshire
        places.add(new Place(R.drawable.riverpark, getString(R.string.riverpark),
                getString(R.string.riverpark_loc),
                getString(R.string.riverpark_info)));// image from unsplash.com
        places.add(new Place(R.drawable.sunmaid, getString(R.string.sunmaid),
                getString(R.string.sunmaid_loc),
                getString(R.string.sunmaid_info)));// image from unsplash.com
        places.add(new Place(R.drawable.ck, getString(R.string.circleK),
                getString(R.string.circlek_loc),
                getString(R.string.circlek_info)));// image from unsplash.com
        places.add(new Place(R.drawable.simonianf, getString(R.string.simonian_farms),
                getString(R.string.simonian_loc),
                getString(R.string.simonian_info)));// image from unsplash.com
        places.add(new Place(R.drawable.sierra, getString(R.string.sierra_nut_house),
                getString(R.string.sierra_loc),
                getString(R.string.sierra_info)));// image from unsplash.com

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.farm_fresh);

        // Find the {@link ListView} object
        // Find the @id list in the place_list.xml file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}


