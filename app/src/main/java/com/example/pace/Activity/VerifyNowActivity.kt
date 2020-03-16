package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.pace.R

class VerifyNowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_now)

        val imageVerification=findViewById<ImageView>(R.id.imgBackVerification)
        val txtVerified=findViewById<TextView>(R.id.txtVerified)
        val txtPhoneVerification=findViewById<TextView>(R.id.txtMobileVerification)
        val txtEmailVerification=findViewById<TextView>(R.id.txtEmailVerification)

        txtEmailVerification.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@VerifyNowActivity,EmailVerificatinActivity::class.java)
            startActivity(intent)
            finish()
        })

        txtPhoneVerification.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@VerifyNowActivity,Mobile_VerificationActivity::class.java)
            startActivity(intent)
            finish()
        })

        imageVerification.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@VerifyNowActivity,MyProfileActivity::class.java)
            startActivity(intent)
            finish()
        })

        txtVerified.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@VerifyNowActivity,IDVerificationActivity::class.java)
            startActivity(intent)
            finish()
        })

    }

}
