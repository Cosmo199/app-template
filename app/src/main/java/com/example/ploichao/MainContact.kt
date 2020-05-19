package com.example.ploichao

import com.example.ploichao.model.Category

interface MainContact {
    interface Presenter {
        fun callListFoodApi(key: String? = null)
    }
    interface View {
        fun onCallSuccess(categoryData: List<Category>?)
    }

}
