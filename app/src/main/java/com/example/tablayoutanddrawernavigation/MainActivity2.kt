package com.example.tablayoutanddrawernavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayoutanddrawernavigation.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityMain.setNavigationOnClickListener {
            binding.activityMain2.openDrawer(binding.navigationView)
        }

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            binding.activityMain2.closeDrawer(binding.navigationView)
            true
        }
    }

}