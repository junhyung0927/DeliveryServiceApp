package com.example.deliveryserviceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.viewpager.widget.ViewPager
import com.example.deliveryserviceapp.databinding.ActivityMainBinding
import com.example.deliveryserviceapp.databinding.ViewpagerActivityBinding

class MainActivity : BaseActivity() {

    internal lateinit var gridview: GridView

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)

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

        binding.gridview.adapter = gridViewAdapter

        binding.gridview.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(Intent(this, LectureActivity::class.java))
        }

        val adapter = ViewPagerAdpater(this)
        binding.viewpager.adapter = adapter
    }
}