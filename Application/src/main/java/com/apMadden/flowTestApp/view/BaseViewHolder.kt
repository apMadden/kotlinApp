package com.apMadden.flowTestApp.view

import com.apMadden.flowTestApp.BR
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.apMadden.flowTestApp.view.main.MainActivityViewModel


/**
 * Created by madde on 12/23/2017.
 */

/**
 * Created by andrew.madden on 9/26/16.
 */
open class BaseViewHolder : RecyclerView.ViewHolder {
    var viewType: Int = 0
    lateinit private var objData: Any
    lateinit var viewModel: MainActivityViewModel
    var binding: ViewDataBinding

    constructor(binding: ViewDataBinding) : super(binding.root) {
        this.binding = binding
    }

    constructor(binding: ViewDataBinding, viewType: Int) : super(binding.root) {
        this.viewType = viewType
        this.binding = binding
    }

    constructor(binding: ViewDataBinding, viewType: Int, viewModel: MainActivityViewModel) : super(binding.root) {
        this.viewType = viewType
        this.binding = binding
        this.viewModel = viewModel
    }

    fun bindTo(obj: Any) {
        this.objData = obj
        binding.setVariable(BR.data, obj)
        binding.executePendingBindings()
    }
}