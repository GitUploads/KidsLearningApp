package com.example.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var data = arrayOf("Alphabet","Fruits","Animal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tl = findViewById<TabLayout>(R.id.tabLayout)
        val pager = findViewById<ViewPager2>(R.id.viewPager2)
        pager.adapter = MyAdapter(supportFragmentManager,lifecycle)
        TabLayoutMediator(tl,pager){
            tab , position ->
                tab.text = data[position]
        }.attach()
    }

}