package com.example.deliveryserviceapp.Fragment.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.deliveryserviceapp.BaseActivity
import com.example.deliveryserviceapp.R
import com.example.deliveryserviceapp.databinding.ListviewItemBinding
import com.example.deliveryserviceapp.model.ContentListModel

class FirstFragAdapter(val context: Context, val list: ArrayList<ContentListModel>): BaseAdapter(){
    private lateinit var binding: ListviewItemBinding

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder: ViewHolder

        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.listview_item, null, false)
            holder = ViewHolder()

            holder.view_image1 = binding.lvImageArea
            holder.view_text1 = binding.lvTitleText
            holder.view_text2 = binding.lvBodyText
            holder.view_text3 = binding.lvEpilogueText

            binding.root.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            binding.root.tag = convertView
        }

        val item = list[position]
        holder.view_text1?.text = item.title

        return binding.root
    }

    private class ViewHolder {
        var view_image1 : ImageView?  = null
        var view_text1 : TextView? = null
        var view_text2 : TextView? = null
        var view_text3 : TextView? = null
    }
}