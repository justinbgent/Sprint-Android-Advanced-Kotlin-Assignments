package com.schoolwork.andvancedkotproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val recyclerView by lazy {
        findViewById<RecyclerView>(R.id.recycler_view)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.startRecyclerView(Lists.dubstep)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_default, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.title){
            "EDM" -> recyclerView.startRecyclerView(Lists.edm)
            "Dubstep" -> recyclerView.startRecyclerView(Lists.dubstep)
            "Drum and Base" -> recyclerView.startRecyclerView(Lists.drumAndBase)
        }
        return super.onOptionsItemSelected(item)
    }
}
