package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.pace.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.btnLogin

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val edtEmail=findViewById<TextInputLayout>(R.id.edtEmail)
        edtEmail.setTypeface(typeface)

        val edtPassword= findViewById<TextInputLayout>(R.id.edtPassword)
        edtPassword.setTypeface(typeface)

        val txtRegister= findViewById<TextView>(R.id.txtRegister)
        // finish()




        btnLogin.text="Login"
        txtHi.text="Hi there,"
      //  txtEmail.text="Email"
        txtForgotPassword.text="Forgot Password?"
        txtOrLogin.text ="Or Login with social media"
        txtDont.text="Don't have an account?"
        txtRegister.text="Register"


        btnLogin.typeface= typeface
        txtHi.typeface=typeface
       // txtEmail.typeface= typeface
       txtForgotPassword.typeface=typeface
        txtOrLogin.typeface=typeface
        txtDont.typeface= typeface
        txtRegister.typeface=typeface


        txtForgotPassword.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@LoginActivity,
                ForgetPassword_Activity::class.java)
            startActivity(intent)

        })

        txtRegister.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@LoginActivity, Register_Activity::class.java)
            startActivity(intent)
        })



        btnLogin.setOnClickListener(View.OnClickListener {
            val intent =Intent(this@LoginActivity, NavigationActivity::class.java)
            startActivity(intent)
        })
    }


    override fun finish() {
        super.finish()
    }

}
