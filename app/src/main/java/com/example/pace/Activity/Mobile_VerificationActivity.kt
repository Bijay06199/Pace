package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.pace.R

class Mobile_VerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile__verification)

        val imageBackMobile=findViewById<ImageView>(R.id.imgBackMobile)

        imageBackMobile.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@Mobile_VerificationActivity,VerifyNowActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
