package com.estudo.generics

import android.view.ViewGroup
import com.estudo.generics.model.Profile
import com.google.android.material.textview.MaterialTextView

class ProfileView(viewGroup: ViewGroup) :
    BaseAdapter.BaseViewHolder<Profile>(R.layout.item_user, viewGroup) {
    override fun bind(item: Profile) {
        itemView.findViewById<MaterialTextView>(R.id.userName).text = item.username
    }
}