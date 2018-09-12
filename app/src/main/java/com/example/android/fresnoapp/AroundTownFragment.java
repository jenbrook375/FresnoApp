package com.example.android.fresnoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


// fragment that displays list of things to do around town
public class AroundTownFragment extends Fragment {
    public AroundTownFragment() {
        // required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        // all images taken by Jennifer Brookshire unless otherwise noted//
        // creates a list of places
        places.add(new Place(R.drawable.lionsfresnozoo, getString(R.string.chaffee_zoo),
                getString(R.string.zoo_loc),
                getString(R.string.zoo_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.fair,
                getString(R.string.fair),
                getString(R.string.fairground_loc),
                getString(R.string.fair_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.chukchansi1, getString(R.string.grizzlies),
                getString(R.string.chukchansi_loc),
                getString(R.string.grizzlies_info)));
        places.add(new Place(R.drawable.museum_clovis__california, getString(R.string.old_town_clovis),
                getString(R.string.old_town_loc),
                getString(R.string.old_town_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.xmas1, getString(R.string.xmas),
                getString(R.string.xmas_loc),
                getString(R.string.xmas_info)));
        places.add(new Place(R.drawable.arte, getString(R.string.arte_america),
                getString(R.string.arte_loc),
                getString(R.string.arte_info)));//image from unsplash.com
        places.add(new Place(R.drawable.art, getString(R.string.art_museum),
                getString(R.string.museum_loc),
                getString(R.string.museum_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.woodward_park_nima1, getString(R.string.woodward_park),
                getString(R.string.woodward_loc),
                getString(R.string.woodward_info)));//image from commoms.wikimedia.org//
        places.add(new Place(R.drawable.shinzen1, getString(R.string.shinzen),
                getString(R.string.shinzen_loc),
                getString(R.string.shinzen_info)));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.around_town);

        // Find the {@link ListView} object
        // Find the @id list in the place_list.xml file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

