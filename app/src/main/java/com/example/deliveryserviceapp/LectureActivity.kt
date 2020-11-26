package com.example.deliveryserviceapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deliveryserviceapp.Fragment.FragmentAdapter
import com.example.deliveryserviceapp.databinding.ActivityLectureBinding

class LectureActivity : BaseActivity() {
    private val binding by binding<ActivityLectureBinding>(R.layout.activity_lecture)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        binding.listViewpager.adapter = fragmentAdapter
    }
}