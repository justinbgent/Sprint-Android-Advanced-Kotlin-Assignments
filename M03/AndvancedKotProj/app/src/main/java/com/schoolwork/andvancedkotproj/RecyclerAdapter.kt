package com.schoolwork.andvancedkotproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Recycler(private var list: MutableList<Song>): RecyclerView.Adapter<Recycler.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtView: TextView = view.findViewById(R.id.txt_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.txtView.text = item.song
    }
}