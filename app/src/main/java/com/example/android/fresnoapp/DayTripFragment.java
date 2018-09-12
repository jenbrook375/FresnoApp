package com.example.android.fresnoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// fragment that displays list of day trip places
public class DayTripFragment extends Fragment {

    public DayTripFragment() {
        // required empty public constructor
    }

    ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        // all images taken by Jennifer Brookshire unless otherwise noted//
        // creates a list of places
        places.add(new Place(R.drawable.yosemite1, getString(R.string.yosemite),
                getString(R.string.yosemite_loc),
                getString(R.string.yosemite_info)));
        places.add(new Place(R.drawable.kings_canyon1, getString(R.string.Kings_sequoia),
                getString(R.string.kings_loc),
                getString(R.string.kings_info)));
        places.add(new Place(R.drawable.huntington, getString(R.string.huntington),
                getString(R.string.hunt_loc),
                getString(R.string.hunt_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.shaver_2, getString(R.string.shaver),
                getString(R.string.shaver_loc),
                getString(R.string.shaver_info)));
        places.add(new Place(R.drawable.millerton1, getString(R.string.millerton),
                getString(R.string.millerton_loc),
                getString(R.string.millerton_info)));
        places.add(new Place(R.drawable.kings_river1, getString(R.string.kings_river),
                getString(R.string.kings_river_loc),
                getString(R.string.kings_river_info)));
        places.add(new Place(R.drawable.bass_lake1, getString(R.string.bass_lake),
                getString(R.string.bass_loc),
                getString(R.string.bass_info)));
        places.add(new Place(R.drawable.blossom_trail, getString(R.string.blossom_trail),
                getString(R.string.blossom_loc),
                getString(R.string.blossom_info)));
        places.add(new Place(R.drawable.boardwalk1, getString(R.string.santa_cruz),
                getString(R.string.santa_cruz_loc),
                getString(R.string.santa_cruz_info)));
        places.add(new Place(R.drawable.hearst_castle1, getString(R.string.hearst),
                getString(R.string.hearst_loc),
                getString(R.string.hearst_info)));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_trip);

        // Find the {@link ListView} object
        // Find the @id list in the place_list.xml file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
