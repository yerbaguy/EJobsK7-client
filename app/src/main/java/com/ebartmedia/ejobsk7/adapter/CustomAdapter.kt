package com.ebartmedia.ejobsk7.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ebartmedia.ejobsk7.R
import com.ebartmedia.ejobsk7.model.Categories
import kotlinx.android.synthetic.main.list_layout.view.*

class CustomAdapter(val catList:ArrayList<Categories>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {

        Log.d("catList","catList" + catList)

        return catList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val categories:Categories = catList[position]
        holder?.catt.text = categories.catName

    }


    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val catt = itemView.findViewById<TextView>(R.id.catName)


    }
}