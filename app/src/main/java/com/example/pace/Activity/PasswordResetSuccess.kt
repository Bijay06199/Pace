package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.pace.R

class PasswordResetSuccess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset_success)

        val btnLoginSuccess= findViewById<Button>(R.id.btnLoginSuccess)

        val backbutton= findViewById<ImageView>(R.id.backbutton)

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val txtReset= findViewById<TextView>(R.id.txtReset)
        val txtSuccess= findViewById<TextView>(R.id.txtSuccess)
        val txtCode= findViewById<TextView>(R.id.txtCode)
        val txtEnter= findViewById<TextView>(R.id.txtEnter)


        txtReset.text="Password reset"
        txtSuccess.text="successful"
        txtCode.text="The code was sent to your mobile number, Please"
        txtEnter.text="enter code"

        txtReset.typeface=typeface
        txtSuccess.typeface=typeface
        txtCode.typeface=typeface
        txtEnter.typeface=typeface




        btnLoginSuccess.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@PasswordResetSuccess, LoginActivity::class.java)
            startActivity(intent)
        })


        backbutton.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@PasswordResetSuccess,
                ResetPasswordActivity::class.java)
            startActivity(intent)
        })



    }
}
