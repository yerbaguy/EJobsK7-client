package com.ebartmedia.ejobsk7.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ebartmedia.ejobsk7.R
import com.ebartmedia.ejobsk7.model.Animals
import kotlinx.android.synthetic.main.animal_list_item.view.*
import org.w3c.dom.Text

//class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
class AnimalAdapter(dataModel : ArrayList<Animals>, context:Context) : RecyclerView.Adapter<ViewHolder>() {


    var mContext = context

//    class AnimalAdapter(val items : ArrayList<String>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_list_item, parent, false)

        return ViewHolder(view)
    }

    var dataModel:ArrayList<Animals> = dataModel

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var item = dataModel[position]

        var name = item.animalss

      //  holder?.tvAnimalType?.text = items.get(position)

        holder.tvAnimalType.text = name

        holder.setOnClickListener(object: CustomItemClickListener{
            override fun onCustomItemClickListener(view: View, pos: Int) {


                Toast.makeText(mContext, "Name:" + name, Toast.LENGTH_SHORT).show()
            }


        } )
       // holder!!.tvAnimalType.text =
    }





    // Gets the number of animals in the list
    override fun getItemCount(): Int {

        return dataModel.size
      //  return items.size
    }




}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

    val tv_animal_type:TextView

    init {

        tv_animal_type = itemView.findViewById<TextView>(R.id.tv_animal_type)
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        this.customItemClickListener!!.onCustomItemClickListener(v!!, adapterPosition)
    }

    var customItemClickListener:CustomItemClickListener?=null




    // Holds the TextView that will add each animal to
    val tvAnimalType = view.tv_animal_type

    fun setOnClickListener(itemClickListener: CustomItemClickListener) {

        this.customItemClickListener = itemClickListener
    }
}
