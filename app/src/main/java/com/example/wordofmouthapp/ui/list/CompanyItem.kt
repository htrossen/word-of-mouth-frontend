package com.example.wordofmouthapp.ui.list

import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.bumptech.glide.Glide
import com.example.wordofmouthapp.R
import com.example.wordofmouthapp.models.Company
import com.example.wordofmouthapp.utils.KotlinEpoxyHolder

@EpoxyModelClass
abstract class CompanyItem : EpoxyModelWithHolder<CompanyItemViewHolder>() {

    @EpoxyAttribute
    lateinit var company: Company

    @EpoxyAttribute
    lateinit var actionHandler: CompanyListActionHandler

    override fun getDefaultLayout(): Int = R.layout.company_item

    override fun bind(holder: CompanyItemViewHolder) {
        super.bind(holder)

        Glide.with(holder.image.context)
            .asBitmap()
            .load(company.imageUrl)
            .placeholder(R.drawable.placeholder_image)
            .into(holder.image)

        holder.name.text = company.name
        holder.category.text = company.category

        holder.container.setOnClickListener {
            actionHandler(CompanyListAction.ItemClicked(company.id))
        }
    }
}

class CompanyItemViewHolder : KotlinEpoxyHolder() {
    val container by bind<LinearLayout>(R.id.company_container)
    val image by bind<ImageView>(R.id.company_image)
    val name by bind<AppCompatTextView>(R.id.company_name)
    val category by bind<AppCompatTextView>(R.id.company_category)

}