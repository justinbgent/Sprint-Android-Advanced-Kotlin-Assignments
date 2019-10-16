package com.schoolwork.andvancedkotproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        EDM("Atmosphere")
    )

    var drumAndBaseList = mutableListOf<Song>(
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
        Dubstep("It's Cool")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.startRecyclerView(dubstepList)
    }
}
