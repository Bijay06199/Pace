package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.pace.R

class PasswordResetSuccess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset_success)

        val btnLoginSuccess= findViewById<Button>(R.id.btnLoginSuccess)

        val backbutton= findViewById<LinearLayout>(R.id.backbutton)


        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val txtReset= findViewById<TextView>(R.id.txtReset)
        val txtSuccess= findViewById<TextView>(R.id.txtSuccess)
        val txtCode= findViewById<TextView>(R.id.txtCode)
        val txtEnter= findViewById<TextView>(R.id.txtEnter)


        txtReset.text=getString(R.string.password_reset)
        txtSuccess.text=getString(R.string.successful)
        txtCode.text=getString(R.string.successfullysent)


        txtReset.typeface=typeface
        txtSuccess.typeface=typeface
        txtCode.typeface=typeface
        txtEnter.typeface=typeface




        btnLoginSuccess.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@PasswordResetSuccess, LoginActivity::class.java)
            startActivity(intent)
            finish()
        })


        backbutton.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@PasswordResetSuccess,
                ResetPasswordActivity::class.java)
            startActivity(intent)
        })





    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
