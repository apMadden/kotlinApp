package com.apMadden.flowTestApp.viewmodels

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.util.Log
import android.view.View
import com.apMadden.flowTestApp.utils.ActivityCallback
import com.apMadden.flowTestApp.utils.ButtonClickCallback

/**
 * Created by madde on 11/7/2017.
 */

class CameraFragmentViewModel(val activityCallback: ActivityCallback) : ButtonClickCallback, ViewModel() {

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