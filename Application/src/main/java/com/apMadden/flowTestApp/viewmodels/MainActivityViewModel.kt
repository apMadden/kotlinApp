package com.apMadden.flowTestApp.viewmodels

import android.databinding.ObservableBoolean
import android.util.Log
import android.view.View
import com.apMadden.flowTestApp.utils.ActivityCallback
import com.apMadden.flowTestApp.utils.ButtonClickCallback
import com.apMadden.flowTestApp.view.BaseViewModel

/**
 * Created by madde on 12/28/2017.
 */

/**
 * Created by madde on 12/23/2017.
 */

class MainActivityViewModel(val activityCallback: ActivityCallback) : ButtonClickCallback, BaseViewModel() {

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