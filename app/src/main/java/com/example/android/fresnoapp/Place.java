package com.example.android.fresnoapp;


// {@link Place} represents a place in or around Fresno that the user wants to learn about*/
public class Place {

    /**
     * Image resource ID for the place
     */
    private int mPlaceImage = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    // Name of the place
    private String mPlaceTitle;

    // Location of the place
    private String mPlaceLocation;

    // Basic info about the place
    private String mPlaceInfo;

    /**
     * Create a new Place object.
     *
     * @param placeImage    is the image that is associated with each place
     * @param placeTitle    is the name if the place
     * @param placeLocation is the physical location of each place
     * @param placeInfo     contains information about that place
     */
    public Place(int placeImage, String placeTitle, String placeLocation, String placeInfo) {
        mPlaceImage = placeImage;
        mPlaceTitle = placeTitle;
        mPlaceLocation = placeLocation;
        mPlaceInfo = placeInfo;
    }

    /**
     * Alternate constructor for fragments with no images
     *
     * @param placeTitle    is the name if the place
     * @param placeLocation is the physical location of each place
     * @param placeInfo     contains information about that place
     */
    public Place(String placeTitle, String placeLocation, String placeInfo) {
        mPlaceTitle = placeTitle;
        mPlaceLocation = placeLocation;
        mPlaceInfo = placeInfo;
    }

    //Get the image for each place
    public int getItemImage() {
        return mPlaceImage;
    }

    //Returns whether or not there is an image for this place.
    public boolean hasImage() {
        return mPlaceImage != NO_IMAGE_PROVIDED;
    }

    // Get the title of each place
    public String getTitle() {
        return mPlaceTitle;
    }

    // Get the physical location of this place.
    public String getLocation() {
        return mPlaceLocation;
    }

    // Get the information about this place
    public String getplaceInfo() {
        return mPlaceInfo;
    }
}

