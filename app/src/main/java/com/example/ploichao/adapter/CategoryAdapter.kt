package com.example.ploichao.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ploichao.R

import com.example.ploichao.holder.CategoryListHolder
import com.example.ploichao.model.Category

class CategoryAdapter (private var coWork: List<Category>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun setItem(items: List<Category>) {
        coWork = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        CategoryListHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false))

    override fun getItemCount(): Int = coWork.size

    override fun getItemViewType(position: Int): Int = R.layout.item_theme_categor

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = (holder as CategoryListHolder).onBind(coWork[position])
}