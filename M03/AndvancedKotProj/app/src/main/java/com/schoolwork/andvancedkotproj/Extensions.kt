package com.schoolwork.andvancedkotproj

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.startRecyclerView(songList: MutableList<Song>){
    this.setHasFixedSize(true)
    this.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
    this.adapter = Recycler(songList)
}