package com.ebartmedia.ejobsk7.ui.categoriess


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ebartmedia.ejobsk7.R
import com.ebartmedia.ejobsk7.adapter.AnimalAdapter
import com.ebartmedia.ejobsk7.model.Animals
import com.ebartmedia.ejobsk7.model.Categories
import kotlinx.android.synthetic.main.fragment_categories.*
import kotlinx.android.synthetic.main.list_layout.*

/**
 * A simple [Fragment] subclass.
 */
class CategoriessFragment : Fragment() {


   // val animals: ArrayList<String> = ArrayList()

    val dataModel: ArrayList<Animals> = ArrayList()

   // val appContext = context!!.applicationContext
    val context = getActivity()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

        // val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) //here


      //   recyclerView: RecyclerView






    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categoriess, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        getCategories()
     //   showCategories(dataModel)
        showCategories(dataModel)

    }

    private fun getCategories() {


        var name_animals = arrayOf("lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf","lkasjdf","lkajdf")

        for ( i in 0..name_animals.size -1) {

            dataModel.add(Animals(name_animals[i]))
        }


//        animals.add("dog")
//        animals.add("cat")
//        animals.add("owl")
//        animals.add("cheetah")
//        animals.add("raccoon")
//        animals.add("bird")
//        animals.add("snake")
//        animals.add("lizard")
//        animals.add("hamster")
//        animals.add("bear")
//        animals.add("lion")
//        animals.add("tiger")
//        animals.add("horse")
//        animals.add("frog")
//        animals.add("fish")
//        animals.add("shark")
//        animals.add("turtle")
//        animals.add("elephant")
//        animals.add("cow")
//        animals.add("beaver")
//        animals.add("bison")
//        animals.add("porcupine")
//        animals.add("rat")
//        animals.add("mouse")
//        animals.add("goose")
//        animals.add("deer")
//        animals.add("fox")
//        animals.add("moose")
//        animals.add("buffalo")
//        animals.add("monkey")
//        animals.add("penguin")
//        animals.add("parrot")



    }

  //  private fun showCategories(animals:ArrayList<String>) {
        private fun showCategories(dataModel:ArrayList<Animals>) {

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = AnimalAdapter(dataModel, getContext()!!.applicationContext)


    }

}
