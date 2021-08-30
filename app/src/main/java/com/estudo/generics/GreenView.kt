package com.estudo.generics

import android.view.ViewGroup
import com.estudo.generics.model.User
import com.google.android.material.textview.MaterialTextView

class GreenView(viewGroup: ViewGroup) :
    BaseAdapter.BaseViewHolder<User>(R.layout.item_profile, viewGroup) {

    override fun bind(item: User) {
        itemView.findViewById<MaterialTextView>(R.id.userName).text = item.username
        itemView.findViewById<MaterialTextView>(R.id.email).text = item.email
    }
}