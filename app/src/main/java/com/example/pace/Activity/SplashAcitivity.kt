package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.example.pace.R

class SplashAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_acitivity)





        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_acitivity)

        //4second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@SplashAcitivity, WelcomeActivity::class.java))
            //finish this activity
            finish()
        },1000)

    }
}
