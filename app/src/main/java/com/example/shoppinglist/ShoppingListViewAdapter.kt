package com.example.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_list_item.view.*

class ShoppingListViewAdapter(private val shoppingList: List<String>) : RecyclerView.Adapter<ShoppingListViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val textView: TextView = itemView.text_view

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = shoppingList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = shoppingList[position]

        holder.textView.text = currentItem
    }

}