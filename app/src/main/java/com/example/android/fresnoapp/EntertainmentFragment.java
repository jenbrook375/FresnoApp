package com.example.android.fresnoapp;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

// fragment that displays list of night life entertainment
public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
        // required empty public constructor
    }

    ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        // creates list of places
        places.add(new Place(getString(R.string.strummers),
                getString(R.string.strummers_loc),
                getString(R.string.strummmers_info)));
        places.add(new Place(getString(R.string.fulton_55),
                getString(R.string.fulton_loc),
                getString(R.string.fulton_info)));
        places.add(new Place(getString(R.string.saroyan_theatre),
                getString(R.string.saroyan_loc),
                getString(R.string.saroyan_info)));
        places.add(new Place(getString(R.string.savemart_center),
                getString(R.string.savemart_loc),
                getString(R.string.savemart_info)));
        places.add(new Place(getString(R.string.warnors),
                getString(R.string.warnors_loc),
                getString(R.string.warnors_info)));
        places.add(new Place(getString(R.string.tower_theatre),
                getString(R.string.tower_loc),
                getString(R.string.tower_info)));
        places.add(new Place(getString(R.string.fresno_phil),
                getString(R.string.fresno_phil_loc),
                getString(R.string.fresno_phil_info)));
        places.add(new Place(getString(R.string.selland_arena),
                getString(R.string.selland_loc),
                getString(R.string.selland_info)));
        places.add(new Place(getString(R.string.roger_rocka),
                getString(R.string.roger_loc),
                getString(R.string.roger_info)));
        places.add(new Place(getString(R.string.jimbos),
                getString(R.string.jimbos_loc),
                getString(R.string.jimbos_info)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.entertainment);

        // Find the {@link ListView} object
        // Find the @id list in the place_list.xml file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}

