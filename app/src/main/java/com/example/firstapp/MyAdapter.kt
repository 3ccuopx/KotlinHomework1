package com.example.firstapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyViewHolder>() {
    // items - хранит в себе список целых чисел
    private var items = ArrayList<Int>()

    // При создании списка парсим xml-элемент списка в тип View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )
    }

    // возвращает кол-во элементов в списке
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

//    fun setItems(list: List<Int>)
//    {
//        items.clear()
//        items.addAll(list)
//        notifyDataSetChanged()
//    }

    fun addItems(item: Int){
        items.add(item)
        notifyDataSetChanged()
    }
}