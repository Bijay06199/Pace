package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.pace.R

class ResetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val btnReset= findViewById<Button>(R.id.btnReset)

        val backbutton= findViewById<LinearLayout>(R.id.backbutton)


        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val txtResetPassword= findViewById<TextView>(R.id.txtResetPassword)
        val txtNewPassword= findViewById<TextView>(R.id.txtNewPassword)
        val txtConfirmPassword= findViewById<TextView>(R.id.txtConfirmPassword)
        val edtNewPassword= findViewById<EditText>(R.id.edtNewPassword)
        val edtConfirmPassword= findViewById<EditText>(R.id.edtConfirmPassword)


        txtResetPassword.text="Reset Password"
        txtNewPassword.text="New Password"
        txtConfirmPassword.text="Confirm Password"
        edtConfirmPassword.typeface=typeface
        edtNewPassword.typeface=typeface

        txtResetPassword.typeface=typeface
        txtNewPassword.typeface=typeface
        txtConfirmPassword.typeface=typeface


        btnReset.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ResetPasswordActivity, PasswordResetSuccess::class.java)
            startActivity(intent)
        })


        backbutton.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ResetPasswordActivity,
               CodeActivity ::class.java)
            startActivity(intent)
        })

    }
}
