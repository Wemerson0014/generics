package com.estudo.generics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

class BaseAdapter : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)

        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.content.text = position.toString()
    }

    override fun getItemCount(): Int {
        return 100
    }

    class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val content: MaterialTextView = itemView.findViewById(R.id.userName)
    }
}