package com.apMadden.flowTestApp.view.main

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apMadden.flowTestApp.R
import com.apMadden.flowTestApp.view.BaseRecyclerAdapter
import com.apMadden.flowTestApp.view.BaseViewHolder
import com.apMadden.flowTestApp.viewmodels.UserFlowCardViewModel

/**
 * Created by madde on 12/23/2017.
 */
class MainActivityRecyclerAdapter : RecyclerView.Adapter<MainActivityViewHolder>() {
    private var userFlows: List<UserFlowCardViewModel>? = arrayListOf()

    override fun getItemViewType(position: Int): Int {
        return R.layout.card_user_flow
    }

    override fun getItemCount(): Int {
        return userFlows!!.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MainActivityViewHolder {
        return MainActivityViewHolder.create(LayoutInflater.from(viewGroup.context), viewGroup, viewType)
    }

    override fun onBindViewHolder(holder: MainActivityViewHolder, position: Int) {
        holder.bindTo(MainActivityViewModel())
    }

}