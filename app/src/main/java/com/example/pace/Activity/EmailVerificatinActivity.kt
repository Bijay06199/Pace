package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.pace.R

class EmailVerificatinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verificatin)

        val imageBackEmail=findViewById<ImageView>(R.id.imgBackEmail)

        imageBackEmail.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@EmailVerificatinActivity,VerifyNowActivity::class.java)
            startActivity(intent)
            finish()
        })


    }
}
