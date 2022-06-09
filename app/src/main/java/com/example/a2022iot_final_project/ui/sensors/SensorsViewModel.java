package com.example.a2022iot_final_project.ui.sensors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SensorsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public SensorsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Shit!!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
