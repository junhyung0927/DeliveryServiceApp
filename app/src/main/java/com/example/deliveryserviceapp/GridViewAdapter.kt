package com.example.deliveryserviceapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import androidx.databinding.DataBindingUtil
import com.example.deliveryserviceapp.databinding.GridviewItemBinding


class GridViewAdapter (val context: Context, val img_list: Array<Int>, val text_list:Array<String>) : BaseAdapter() {
    private lateinit var binding: GridviewItemBinding

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.gridview_item, parent, false)

        binding.gridviewText.text = text_list[position]
        binding.gridviewImg.setImageResource(img_list[position])

        return binding.root
    }

    override fun getCount(): Int {
        return img_list.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

}