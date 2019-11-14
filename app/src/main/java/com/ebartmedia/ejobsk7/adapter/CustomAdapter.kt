package com.ebartmedia.ejobsk7.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ebartmedia.ejobsk7.R
import com.ebartmedia.ejobsk7.model.Categories
import kotlinx.android.synthetic.main.list_layout.view.*

class CustomAdapter(val catList:ArrayList<Categories>, val context:Context):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {

        Log.d("catList","catList" + catList)

        return catList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val categories:Categories = catList[position]
        holder?.catt.text = categories.catName

        holder!!.catt.text = "catname:" + categories.catName

        holder.setOnClickListener(object: CustomItemClickListener{
            override fun onCustomItemClickListener(view: View, pos: Int) {

                Toast.makeText(context, "Catname:" + categories.catName, Toast.LENGTH_SHORT).show()

            }
        } )

    }


    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {

            this.customItemClickListener!!.onCustomItemClickListener(v!!, adapterPosition)
        }

        val catt:TextView

        var customItemClickListener:CustomItemClickListener?=null

        init {

            catt = itemView.findViewById<TextView>(R.id.catName)

        }

        fun setOnClickListener(itemClickListener: CustomItemClickListener) {

            this.customItemClickListener = itemClickListener
        }

    }
}