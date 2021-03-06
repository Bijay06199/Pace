package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")

        btnLogin.text="Login"
        btnRegister.text="Register"

        btnLogin.typeface= typeface
        btnRegister.typeface=typeface

        val txtSkip= findViewById<TextView>(R.id.txtSkip)

       // val buttonLogin= findViewById<Button>(R.id.btnLogin)
      //  val buttonRegister= findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        })


        btnRegister.setOnClickListener(View.OnClickListener {

            val intent= Intent (this@MainActivity, Register_Activity::class.java)
            startActivity(intent)
        })


        txtSkip.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MainActivity,NavigationActivity::class.java)
            startActivity(intent)
        })


    }
}
