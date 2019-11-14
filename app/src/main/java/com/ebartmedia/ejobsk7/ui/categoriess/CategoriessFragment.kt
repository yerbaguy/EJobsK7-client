package com.ebartmedia.ejobsk7.ui.categoriess


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ebartmedia.ejobsk7.R
import com.ebartmedia.ejobsk7.adapter.AnimalAdapter
import com.ebartmedia.ejobsk7.model.Categories
import kotlinx.android.synthetic.main.fragment_categories.*

/**
 * A simple [Fragment] subclass.
 */
class CategoriessFragment : Fragment() {


    val animals: ArrayList<String> = ArrayList()

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
        showCategories(animals)

    }

    private fun getCategories() {


        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")



    }

    private fun showCategories(animals:ArrayList<String>) {

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = AnimalAdapter(animals)


    }

}
