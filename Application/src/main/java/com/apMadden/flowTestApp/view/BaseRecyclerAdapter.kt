package com.apMadden.flowTestApp.view

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by madde on 12/23/2017.
 */
open class BaseRecyclerAdapter(private val list: List<Any>,
                               private val variable: Int? = null) : RecyclerView.Adapter<BaseViewHolder>() {
    private var recyclerView: RecyclerView? = null
    private var inflater: LayoutInflater? = null

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): BaseViewHolder {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, viewType, view, false)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bindTo(BaseViewModel())
    }
    override fun getItemCount() = list.size
}