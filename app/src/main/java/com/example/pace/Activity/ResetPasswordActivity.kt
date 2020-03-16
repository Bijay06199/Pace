package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.*
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_reset_password.*

class ResetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        var show=true

        val btnReset= findViewById<Button>(R.id.btnReset)

        val backbutton= findViewById<LinearLayout>(R.id.backbutton)

val imageeyee=findViewById<LinearLayout>(R.id.imageeyee)
        val imageeyee1=findViewById<LinearLayout>(R.id.imageeyee1)

        val eyeOff=findViewById<ImageView>(R.id.imgEyeoff)
        val eyeOff1=findViewById<ImageView>(R.id.imgEyeoff1)








        imageeyee.setOnClickListener(View.OnClickListener {

            if(show) {
                eyeOff.setImageResource(R.drawable.eye_on)

                edtNewPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtNewPassword.setSelection(edtNewPassword.text.length)

                show=false
            }else{

                eyeOff.setImageResource(R.drawable.eye_off)

                edtNewPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtNewPassword.setSelection(edtNewPassword.text.length)
                show=true
            }

        })




        imageeyee1.setOnClickListener(View.OnClickListener {

            if(show) {
                eyeOff1.setImageResource(R.drawable.eye_on)

                edtConfirmPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirmPassword.setSelection(edtConfirmPassword.text.length)

                show=false
            }else{

                eyeOff1.setImageResource(R.drawable.eye_off)

                edtConfirmPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirmPassword.setSelection(edtConfirmPassword.text.length)
                show=true
            }
        })






        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val txtResetPassword= findViewById<TextView>(R.id.txtResetPassword)
        val txtNewPassword= findViewById<TextView>(R.id.txtNewPassword)
        val txtConfirmPassword= findViewById<TextView>(R.id.txtConfirmPassword)
        val edtNewPassword= findViewById<EditText>(R.id.edtNewPassword)
        val edtConfirmPassword= findViewById<EditText>(R.id.edtConfirmPassword)


        txtResetPassword.text=getString(R.string.reset_password)
        txtNewPassword.text=getString(R.string.enternew_password)
        txtConfirmPassword.text=getString(R.string.confirm_password)

        edtConfirmPassword.typeface=typeface
        edtNewPassword.typeface=typeface

        txtResetPassword.typeface=typeface
        txtNewPassword.typeface=typeface
        txtConfirmPassword.typeface=typeface


        btnReset.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ResetPasswordActivity, PasswordResetSuccess::class.java)
            startActivity(intent)
            finish()
        })


        backbutton.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@ResetPasswordActivity,
               CodeActivity ::class.java)
            startActivity(intent)
        })

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
