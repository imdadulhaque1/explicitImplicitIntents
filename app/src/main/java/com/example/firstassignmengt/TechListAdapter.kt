package com.example.firstassignmengt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TechListAdapter(private val techList: List<TechList>) : RecyclerView.Adapter<TechListAdapter.TechListViewHolder>() {

    inner class TechListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val techName: TextView = view.findViewById(R.id.tech_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tech_list, parent, false)
        return TechListViewHolder(view)
    }

    override fun onBindViewHolder(holder: TechListViewHolder, position: Int) {
        holder.techName.text = techList[position].name
    }

    override fun getItemCount(): Int {
        return techList.size
    }
}
