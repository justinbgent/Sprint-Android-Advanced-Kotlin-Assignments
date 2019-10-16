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

    var edmList = mutableListOf<Song>(
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere"),
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere"),
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere")
    )

    var drumAndBaseList = mutableListOf<Song>(
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day"),
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day"),
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day")
    )

    var dubstepList = mutableListOf<Song>(
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool"),
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool"),
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.startRecyclerView(dubstepList)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_default, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.title){
            "EDM" -> recyclerView.startRecyclerView(edmList)
            "Dubstep" -> recyclerView.startRecyclerView(dubstepList)
            "Drum and Base" -> recyclerView.startRecyclerView(drumAndBaseList)
        }
        return super.onOptionsItemSelected(item)
    }
}
