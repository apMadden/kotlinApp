package com.apMadden.flowTestApp.view

import android.arch.lifecycle.ViewModel
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView



/**
 * Created by madde on 12/23/2017.
 */
open class BaseViewModel : ViewModel() {
    lateinit var focusChangeListener: FocusChangeListener
    private var actionListener: EditTextActionListener? = null

    interface FocusChangeListener {
        fun setFocus(layoutId: Int)
    }

    interface EditTextActionListener {
        fun lastFieldAction(layoutId: Int)
    }

    fun editTextAction(textView: TextView, actionId: Int, keyEvent: KeyEvent): Boolean {
        if (actionId == EditorInfo.IME_ACTION_GO) {
            if (actionListener != null) {
                actionListener!!.lastFieldAction(textView.id)
                return true
            }
        }
        return false
    }
}