package com.example.deliveryserviceapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.deliveryserviceapp.Fragment.adapter.FragmentAdapter
import com.example.deliveryserviceapp.databinding.ActivityLectureBinding
import com.example.deliveryserviceapp.databinding.CustomTabBinding
import com.google.android.material.tabs.TabLayout

class LectureActivity : BaseActivity() {
    private val binding by binding<ActivityLectureBinding>(R.layout.activity_lecture)
    private lateinit var tabBinding: CustomTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)

        binding.listViewpager.adapter = fragmentAdapter

        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("AI")))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("CSS")))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("HTML")))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("ID")))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("JPG")))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(createTabView("JS")))

        binding.listViewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

        binding.tabLayout.addOnTabSelectedListener( object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.listViewpager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun createTabView(tabName : String) : View {
        tabBinding = DataBindingUtil.inflate(LayoutInflater.from(baseContext), R.layout.custom_tab, null, false)
        tabBinding.customTab.text = tabName
        return tabBinding.root
    }
}