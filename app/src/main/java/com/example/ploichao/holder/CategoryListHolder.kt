package com.example.ploichao.holder
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.msi_gl62.karn.extension.load
import com.example.ploichao.model.Category
import kotlinx.android.synthetic.main.item_theme_categor.view.*

class CategoryListHolder (view: View) : RecyclerView.ViewHolder(view) {

    fun onBind(cate: Category) {

        itemView.apply {
            image.load(cate.image_url)
            categoryName.text = cate.name
        }


    }
}