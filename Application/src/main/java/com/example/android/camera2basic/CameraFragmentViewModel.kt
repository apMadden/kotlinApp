package com.example.android.camera2basic

import android.databinding.ObservableBoolean
import android.util.Log
import android.view.View

/**
 * Created by madde on 11/7/2017.
 */

class CameraFragmentViewModel(val activityCallback: ActivityCallback) : ButtonClickCallback {

    var isHidden = ObservableBoolean(true)

    init {
        Log.i(TAG, "ChoiceViewModel: constructor")
    }

    override fun buttonClicked(v: View) {
        Log.i(TAG, "buttonClicked: viewmodel")
        activityCallback.buttonClicked(v)
    }

    companion object {
        var TAG = "CameraFragmentViewModel"
    }
}