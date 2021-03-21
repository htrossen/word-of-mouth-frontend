package com.example.wordofmouthapp.ui.list

import android.view.View
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.wordofmouthapp.R
import com.example.wordofmouthapp.utils.KotlinEpoxyHolder

@EpoxyModelClass
abstract class Divider : EpoxyModelWithHolder<DividerViewHolder>() {
    override fun getDefaultLayout(): Int = R.layout.divider
}

class DividerViewHolder : KotlinEpoxyHolder() {
 val divider by bind<View>(R.id.divider)
}
