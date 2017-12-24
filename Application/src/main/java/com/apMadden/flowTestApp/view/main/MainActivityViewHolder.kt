package com.apMadden.flowTestApp.view.main

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.ViewGroup
import android.view.LayoutInflater
import com.apMadden.flowTestApp.view.BaseViewHolder



/**
 * Created by madde on 12/23/2017.
 */
class MainActivityViewHolder(binding: ViewDataBinding, viewType: Int) : BaseViewHolder(binding, viewType) {
    companion object {
        fun create(inflater: LayoutInflater, parent: ViewGroup, viewType: Int): MainActivityViewHolder {
            val mBinding = DataBindingUtil.inflate<ViewDataBinding>(inflater, viewType, parent, false)
            return MainActivityViewHolder(mBinding, viewType)
        }
    }
}