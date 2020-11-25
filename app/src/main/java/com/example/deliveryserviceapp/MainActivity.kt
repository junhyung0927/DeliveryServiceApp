package com.example.deliveryserviceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager : ViewPager
    internal lateinit var gridview: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = arrayOf(
            R.drawable.ai,
            R.drawable.css,
            R.drawable.html,
            R.drawable.id,
            R.drawable.jpg,
            R.drawable.js,
            R.drawable.mp4,
            R.drawable.pdf,
            R.drawable.png,
            R.drawable.psd,
            R.drawable.tiff,
        )

        val text = arrayOf(
            "ai",
            "css",
            "html",
            "id",
            "jpg",
            "js",
            "mp4",
            "pdf",
            "png",
            "psd",
            "tiff",
        )

        val gridViewAdapter = GridViewAdapter(this, img, text)
        gridview = findViewById(R.id.gridview) as GridView
        gridview.adapter = gridViewAdapter

        viewpager = findViewById(R.id.viewpager) as ViewPager
        val adapter = ViewPagerAdpater(this)
        viewpager.adapter = adapter
    }
}