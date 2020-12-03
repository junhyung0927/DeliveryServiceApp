package com.example.deliveryserviceapp.Fragment

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.deliveryserviceapp.Fragment.adapter.FirstFragAdapter
import com.example.deliveryserviceapp.R
import com.example.deliveryserviceapp.databinding.FragmentFirstBinding
import com.example.deliveryserviceapp.model.ContentListModel

class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fragment_first, null, false)

        val list_array = arrayListOf<ContentListModel>(
            ContentListModel("a", "notitle", 1, "none"),
            ContentListModel("b", "notitle", 2, "none"),
            ContentListModel("c", "notitle", 3, "none"),
            ContentListModel("d", "notitle", 4, "none"),
            ContentListModel("d", "notitle", 5, "none"),
            ContentListModel("f", "notitle", 6, "none"),
            ContentListModel("g", "notitle", 7, "none")
        )

        val list_adapter = FirstFragAdapter(requireContext(), list_array)
        binding.listviewFirstFragment.adapter = list_adapter

        return binding.root
    }

}