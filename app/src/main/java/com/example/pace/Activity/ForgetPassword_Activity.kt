package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
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
        val backarrow= findViewById<LinearLayout>(R.id.backarrow)

        btnNext.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ForgetPassword_Activity,
                CodeActivity::class.java)
            startActivity(intent)
            finish()
        })


        backarrow.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ForgetPassword_Activity, LoginActivity::class.java)
            startActivity(intent)

        })


        txtForget.text=getString(R.string.forgotpassword)
        txtEnter.text=getString(R.string.pleaseenter)
        txtVerification.text=getString(R.string.sendyou)
        btnNext.text=getString(R.string.next)



        txtForget.typeface=typeface
        txtEnter.typeface=typeface
        txtVerification.typeface=typeface
        btnNext.typeface=typeface




    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
