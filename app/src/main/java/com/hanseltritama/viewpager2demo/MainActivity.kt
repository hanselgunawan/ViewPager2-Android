package com.hanseltritama.viewpager2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_page.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private val titleList = mutableListOf<String>()
    private val descriptionList = mutableListOf<String>()
    private val imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        my_view_pager.adapter = ViewPagerAdapter(titleList, descriptionList, imagesList)
        my_view_pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.circle_indicator)
        indicator.setViewPager(my_view_pager)

        btn_fake_swipe.setOnClickListener {
            my_view_pager.apply {
                beginFakeDrag()
                fakeDragBy(-200f)
                endFakeDrag()
            }
        }
    }

    private fun addToList(title: String, description: String, image: Int) {
        titleList.add(title)
        descriptionList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i in 1..5) {
            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }
    }
}
