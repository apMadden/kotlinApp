package com.apMadden.flowTestApp.view.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apMadden.flowTestApp.R
import com.apMadden.flowTestApp.databinding.ActivityMainBinding
import com.apMadden.flowTestApp.view.camera.CameraFragment

/**
 * Created by madde on 12/23/2017.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding.data = viewModel
    }
}
