package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.pace.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register_.*
import kotlinx.android.synthetic.main.activity_register_.edtConfirm11


class Register_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_)

        var show=true


        val txtLogin= findViewById<TextView>(R.id.txtLogin)


        val checkMale= findViewById<CheckBox>(R.id.checkMale)
        val checkFemale=findViewById<CheckBox>(R.id.checkFemale)
        val checkOther= findViewById<CheckBox>(R.id.checkOther)

        val txtMale= findViewById<TextView>(R.id.txtMale)
        val txtFemale= findViewById<TextView>(R.id.txtFemale)
        val txtOther= findViewById<TextView>(R.id.txtOther)

        val imageeye=findViewById<LinearLayout>(R.id.imageeye)
        val imageeye1=findViewById<LinearLayout>(R.id.imageeye1)

        val hide=findViewById<ImageView>(R.id.imgEyeoff)
        val hide1=findViewById<ImageView>(R.id.imgEyeoff1)




               imageeye1.setOnClickListener(View.OnClickListener {

            if(show) {
                hide1.setImageResource(R.drawable.eye)

                edtConfirm11.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirm11.setSelection(edtConfirm11.text!!.length)

                show=false
            }else{

                hide1.setImageResource(R.drawable.hide)

                edtConfirm11.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirm11.setSelection(edtConfirm11.text!!.length)
                show=true
            }

        })


        imageeye.setOnClickListener(View.OnClickListener {

            if(show) {
                hide.setImageResource(R.drawable.eye)

                edtConfirm12.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirm12.setSelection(edtConfirm12.text!!.length)

                show=false
            }else{

                hide.setImageResource(R.drawable.hide)

                edtConfirm12.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT)
                edtConfirm12.setSelection(edtConfirm12.text!!.length)
                show=true
            }

        })




        checkMale.setOnClickListener(View.OnClickListener {

    if(checkMale.isChecked){

        checkFemale.isChecked=false
        checkOther.isChecked=false
    }
})


        txtMale.setOnClickListener(View.OnClickListener {

                checkMale.isChecked=true

                checkFemale.isChecked=false
                checkOther.isChecked=false

        })





        checkFemale.setOnClickListener(View.OnClickListener {

            if(checkFemale.isChecked){

                checkMale.isChecked=false
                checkOther.isChecked=false
            }
        })


        txtFemale.setOnClickListener(View.OnClickListener {


                checkFemale.isChecked=true
                checkMale.isChecked=false
                checkOther.isChecked=false

        })

        checkOther.setOnClickListener(View.OnClickListener {

            if(checkOther.isChecked){

                checkFemale.isChecked=false
                checkMale.isChecked=false
            }
        })


        txtOther.setOnClickListener(View.OnClickListener {


                checkOther.isChecked=true
                checkFemale.isChecked=false
                checkMale.isChecked=false

        })




        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")

        val edtPassword=findViewById<TextInputLayout>(R.id.edtPassword)
        edtPassword.setTypeface(typeface)

        val edtPassword1=findViewById<TextInputLayout>(R.id.edtPassword1)
        edtPassword1.setTypeface(typeface)

        val edtFull=findViewById<TextInputLayout>(R.id.edtFull)
        edtFull.setTypeface(typeface)

        val edtEmail=findViewById<TextInputLayout>(R.id.edtEmail)
        edtEmail.setTypeface(typeface)


        txtCreate.text=getString(R.string.createaccount)
       // txtFull.text="Full Name"
       // txtEmail.text="Email"
        txtGender.text=getString(R.string.gender)
      //  txtPassword.text="Password"
      //  txtConfirm.text="Confirm Password"
        txtAgree.text=getString(R.string.agreewithterms)
        btnRegister.text=getString(R.string.register)
        txtAlready.text=getString(R.string.alreadyhaveanaccount)
        txtLogin.text=getString(R.string.login)
        txtMale.text=getString(R.string.male)
        txtFemale.text=getString(R.string.female)
        txtOther.text=getString(R.string.other)

        txtCreate.typeface=typeface
       // txtFull.typeface=typeface
       // txtEmail.typeface=typeface
        txtGender.typeface=typeface
      //  txtPassword.typeface=typeface
      //  txtConfirm.typeface=typeface
        txtAgree.typeface=typeface
        btnRegister.typeface=typeface
        txtAlready.typeface=typeface
        txtLogin.typeface=typeface
        txtMale.typeface=typeface
        txtFemale.typeface=typeface
        txtOther.typeface=typeface


        btnRegister.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Register_Activity,
                NavigationActivity::class.java)
            startActivity(intent)
            finish()
        })

        txtLogin.setOnClickListener(View.OnClickListener {

            val intent = Intent (this@Register_Activity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        })







    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}
