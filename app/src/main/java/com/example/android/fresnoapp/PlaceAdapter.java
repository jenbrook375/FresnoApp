package com.example.android.fresnoapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    // resource id for background color for fragments
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param places          is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the background color for each fragment
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        // Get place object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the image in the list_view.xml with the id image_item
        ImageView itemImage = (ImageView) listItemView.findViewById(R.id.image_item);

        // Check if an image is provided for this word or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            itemImage.setImageResource(currentPlace.getItemImage());
            // Make sure the view is visible
            itemImage.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            itemImage.setVisibility(View.GONE);
        }

        // Find the textView in the list_view.xml with the id title_textView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentPlace.getTitle());

        //Find the textView in the list_view.xml with the id location_text_view
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        // Get the location of the current place and set it on the location_text_view
        locationTextView.setText(currentPlace.getLocation());

        //Find the textView in the list_view.xml with the id info_text_view
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text_view);

        // Get the info of the current place and set it on the info_text_view
        infoTextView.setText(currentPlace.getplaceInfo());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
