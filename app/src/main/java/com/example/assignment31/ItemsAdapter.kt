package com.example.assignment31

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]
        holder.match.text = itemsViewModel.match
        holder.team1.text = itemsViewModel.team1
        holder.team2.text = itemsViewModel.team2
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val match: TextView = itemView.findViewById(R.id.idMatch)
        val team1: TextView = itemView.findViewById(R.id.team1)
        val team2: TextView = itemView.findViewById(R.id.team2)
    }
}