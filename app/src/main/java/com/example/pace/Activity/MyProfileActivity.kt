package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.pace.R

class MyProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)


        val imgBackProfile =findViewById<ImageView>(R.id.imgBackProfile)

        val txtEdit=findViewById<TextView>(R.id.txtEdit)

        val txtVerifynow=findViewById<TextView>(R.id.txtVerifynow)



        txtVerifynow.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@MyProfileActivity,VerifyNowActivity::class.java)
            startActivity(intent)
            finish()
        })



        imgBackProfile.setOnClickListener(View.OnClickListener {

            finish()
        })



        txtEdit.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MyProfileActivity,EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
