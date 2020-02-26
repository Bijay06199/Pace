package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.pace.R

class CodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_code)
        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")


        val txtFourDigit= findViewById<TextView>(R.id.txtFourDigit)
        val txtSent= findViewById<TextView>(R.id.txtSent)
        val txtEnterCode= findViewById<TextView>(R.id.txtEntercode)

        txtFourDigit.text="Enter 4 digit code"
        txtSent.text="The code was sent your mobile number"
        txtEnterCode.text="Please enter your code"

        val edtCode1=findViewById<EditText>(R.id.edtCode1)
        val edtCode2=findViewById<EditText>(R.id.edtCode2)
        val edtCode3=findViewById<EditText>(R.id.edtCode3)
        val edtCode4=findViewById<EditText>(R.id.edtCode4)


        txtFourDigit.typeface=typeface
        txtSent.typeface=typeface

        edtCode1.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                // TODO Auto-generated method stub
                if (edtCode1.length() === 1)
                //size as per your requirement
                {
                    edtCode2.requestFocus()
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int,
                                           count:Int, after:Int) {
                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s:Editable) {
                // TODO Auto-generated method stub
            }
        })



        edtCode2.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                // TODO Auto-generated method stub
                if (edtCode1.length() === 1)
                //size as per your requirement
                {
                    edtCode3.requestFocus()
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int,
                                           count:Int, after:Int) {
                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s:Editable) {
                // TODO Auto-generated method stub
            }
        })


        edtCode3.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                // TODO Auto-generated method stub
                if (edtCode1.length() === 1)
                //size as per your requirement
                {
                    edtCode4.requestFocus()
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int,
                                           count:Int, after:Int) {
                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s:Editable) {
                // TODO Auto-generated method stub
            }
        })





        val btnCode= findViewById<Button>(R.id.btnCode)

        btnCode.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@CodeActivity, ResetPasswordActivity::class.java)
            startActivity(intent)
        })


    }



}
