package com.example.ploichao
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ploichao.adapter.CategoryAdapter
import com.example.ploichao.model.Category
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() ,MainContact.View {

    private lateinit var presenter: MainContact.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.callListFoodApi()
    }

    override fun onCallSuccess(categoryData: List<Category>?) {
        val cateData: CategoryAdapter by lazy { CategoryAdapter(listOf()) }
        listCategory?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        listCategory?.isNestedScrollingEnabled = false
        listCategory?.adapter = cateData
        categoryData?.let { cateData.setItem(it) }


        val cateData2: CategoryAdapter by lazy { CategoryAdapter(listOf()) }
        listCategory2?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        listCategory2?.isNestedScrollingEnabled = false
        listCategory2?.adapter = cateData2
        categoryData?.let { cateData.setItem(it) }
    }


}
