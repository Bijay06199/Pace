package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.example.pace.R
import kotlinx.android.synthetic.main.forgot_password.*

class ForgetPassword_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")

        val txtYour= findViewById<EditText>(R.id.txtYour)
        txtYour.setTypeface(typeface)

        val btnNext= findViewById<Button>(R.id.btnNext)
        val backbutton= findViewById<ImageButton>(R.id.backbutton)

        btnNext.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ForgetPassword_Activity,
                CodeActivity::class.java)
            startActivity(intent)
        })


        backbutton.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ForgetPassword_Activity, LoginActivity::class.java)
            startActivity(intent)
        })


        txtForget.text="Forgot Passsword"
        txtEnter.text="Please enter your email address so we can"
        txtVerification.text="send you a verification code"
        btnNext.text="Next"



        txtForget.typeface=typeface
        txtEnter.typeface=typeface
        txtVerification.typeface=typeface
        btnNext.typeface=typeface




    }
}
