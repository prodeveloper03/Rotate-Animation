package com.codingwithme.rotateanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imagerotate:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       imagerotate = findViewById<ImageView>(R.id.imageView)

        rotateAnimation()


    }

    private fun rotateAnimation() {

        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate_animation)

        imagerotate.animation = rotate


    }


}