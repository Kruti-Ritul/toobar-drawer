package com.example.tablayoutanddrawernavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayoutanddrawernavigation.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.textView.text = tab?.contentDescription
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                Handle tab unselect
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
//                  Handle tab reselect
            }

        })
    }
}