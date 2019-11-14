package com.ebartmedia.ejobsk7

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ebartmedia.ejobsk7.adapter.AnimalAdapter
import com.ebartmedia.ejobsk7.adapter.CustomAdapter
import com.ebartmedia.ejobsk7.model.Categories
import com.ebartmedia.ejobsk7.ui.another.AnotherFragment
import com.ebartmedia.ejobsk7.ui.categories.CategoriesFragment
import com.ebartmedia.ejobsk7.ui.categoriess.CategoriessFragment
import com.ebartmedia.ejobsk7.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

//class MainActivity : AppCompatActivity() {
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, CategoriesFragment.OnFragmentInteractionListener, AnotherFragment.OnFragmentInteractionListener {

    // val categoriesFragment = CategoriesFragment

    lateinit var categoriesFragment: CategoriesFragment
    lateinit var categoriessFragment: CategoriessFragment
    lateinit var anotherFragment: AnotherFragment

    val animals: ArrayList<String> = ArrayList()

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var appBarConfiguration: AppBarConfiguration

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

          addAnimals()

          recyclerView.layoutManager = LinearLayoutManager(this)




           // val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) //here

      //  recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)



      //  recyclerView.adapter = AnimalAdapter(animals, this) //here

      //  val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView

       // recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
      //  recyclerView.layoutManager = LinearLayoutManager(this.applicationContext)

//        val categories = ArrayList<Categories>() //here
//
//        categories.add(Categories("ssssss"))
//        categories.add(Categories("fasdfasdf"))
//        categories.add(Categories("ddddddd"))
//        categories.add(Categories("asdfasdfas"))
//        categories.add(Categories("aaaaaa"))
//        categories.add(Categories("sdfsdfsdf"))

//        for (i in 0..categories.size - 1) {
//
//            categories.add(Categories(catName = [i].toString()))
//        }

//        val adapter = CustomAdapter(categories) //here
//
//        recyclerView.adapter = adapter //here

        init()
    }

    fun addAnimals() {


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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
      //  val navController = findNavController(R.id.nav_host_fragment)
        val navController = findNavController(R.id.relativeLayout)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    fun displayScreen(id:Int) {

        val fragment = when(id)  {

            R.id.categories -> {

                CategoriesFragment()
//              val categoriesFragment: CategoriesFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    //  .replace(R.id.nav_host_fragment, fragment)
//                    .replace(R.id.relativeLayout, categoriesFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }

            R.id.anotherFragment -> {

                AnotherFragment()
            }

            else -> {

                HomeFragment()
            }
        }

        supportFragmentManager
            .beginTransaction()
          //  .replace(R.id.nav_host_fragment, fragment)
            .replace(R.id.frame_layout, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

    }




    private fun init() {

        var toggle = ActionBarDrawerToggle(Activity(), drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item:MenuItem):Boolean {


//        displayScreen(item.itemId)
//
//        drawer_layout.closeDrawer(GravityCompat.START)


        when (item.itemId) {

            R.id.categories -> {

                categoriessFragment = CategoriessFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, categoriessFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }

            R.id.anotherFragment -> {

                anotherFragment = AnotherFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, anotherFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)



        return true

    }
}
