package com.example.customviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gradientImage.setUrlImage("https://img1.etsystatic.com/002/0/6449624/il_fullxfull.382134677_so6e.jpg",R.drawable.weather,
            R.drawable.weather, ImageView.ScaleType.CENTER_CROP)
    }
}
