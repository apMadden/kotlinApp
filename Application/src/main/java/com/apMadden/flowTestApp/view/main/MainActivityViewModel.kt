package com.apMadden.flowTestApp.view.main

import com.apMadden.flowTestApp.view.BaseViewModel
import com.apMadden.flowTestApp.viewmodels.UserFlowCardViewModel

/**
 * Created by madde on 12/23/2017.
 */
open class MainActivityViewModel : BaseViewModel() {
    lateinit var cardViewModels: List<UserFlowCardViewModel>
    lateinit var nameText: String
    init {

    }

}