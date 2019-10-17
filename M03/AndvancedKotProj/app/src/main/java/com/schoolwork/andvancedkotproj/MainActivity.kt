package com.schoolwork.andvancedkotproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private val recyclerView by lazy {
        findViewById<RecyclerView>(R.id.recycler_view)
    }

    private lateinit var adapter: Recycler
    private lateinit var songs: MutableList<Song>

    private var listType: Song by Delegates.observable(Dubstep("")) { _, _: Song, new: Song ->
        Lists.clearAndReplace(songs, new)
        adapter.notifyDataSetChanged()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        songs = mutableListOf()
        songs.addAll(Lists.edm)
        adapter =  Recycler(songs)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_default, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "EDM" -> listType = EDM("EDM")
            "Dubstep" -> listType = Dubstep("Dubstep")
            "Drum and Base" -> listType = DrumAndBase("Drum and Base")
        }
        return super.onOptionsItemSelected(item)
    }
}
