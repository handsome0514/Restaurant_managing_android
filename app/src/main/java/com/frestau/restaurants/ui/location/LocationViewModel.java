package com.frestau.restaurants.ui.location;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationViewModel extends ViewModel {

    private MutableLiveData<String> mText;




    public LocationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Please find your location.");

    }

    public LiveData<String> getText() {
        return mText;
    }

}