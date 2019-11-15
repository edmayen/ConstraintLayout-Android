package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners()
    {
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                green_button, red_button, yelllow_button,
                blue_button, pink_button, white_button)

        for (item in clickableViews)
        {
            item.setOnClickListener{ makeColored(it) }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View)
    {
        when (view.id){
            // boxes using Color class for background
            R.id.constraint_layout -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // boxes using custom color for background
            R.id.white_button -> constraint_layout.setBackgroundColor(R.color.my_white)
            R.id.blue_button -> box_one_text.setBackgroundResource(R.color.my_blue)
            R.id.pink_button -> box_two_text.setBackgroundResource(R.color.my_pink)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yelllow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
