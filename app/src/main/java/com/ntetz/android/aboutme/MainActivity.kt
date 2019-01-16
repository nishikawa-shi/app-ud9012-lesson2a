package com.ntetz.android.aboutme

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ntetz.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val builder = MainBindingBuilder(binding, this)
        BindingDirector(builder).initialize()
    }
}
