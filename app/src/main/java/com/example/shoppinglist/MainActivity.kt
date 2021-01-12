package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)

        shopping_recycler.adapter = ShoppingListViewAdapter(exampleList)
        shopping_recycler.layoutManager = LinearLayoutManager(this)
        shopping_recycler.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<String> {
        val list = ArrayList<String>()

        for(i in 0 until size)
            list += "Item $i"

        return list
    }
}