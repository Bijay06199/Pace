package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import com.example.pace.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_register_.*


class Register_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_)


        val txtLogin= findViewById<TextView>(R.id.txtLogin)


        val checkMale= findViewById<CheckBox>(R.id.checkMale)
        val checkFemale=findViewById<CheckBox>(R.id.checkFemale)
        val checkOther= findViewById<CheckBox>(R.id.checkOther)

        val txtMale= findViewById<TextView>(R.id.txtMale)
        val txtFemale= findViewById<TextView>(R.id.txtFemale)
        val txtOther= findViewById<TextView>(R.id.txtOther)


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

        val edtConfirm=findViewById<TextInputLayout>(R.id.edtConfirm)
        edtConfirm.setTypeface(typeface)

        val edtConfirm1=findViewById<TextInputLayout>(R.id.edtConfirm1)
        edtConfirm1.setTypeface(typeface)

        val edtFull=findViewById<TextInputLayout>(R.id.edtFull)
        edtFull.setTypeface(typeface)

        val edtEmail=findViewById<TextInputLayout>(R.id.edtEmail)
        edtEmail.setTypeface(typeface)


        txtCreate.text="Create Account"
       // txtFull.text="Full Name"
       // txtEmail.text="Email"
        txtGender.text="Gender"
      //  txtPassword.text="Password"
      //  txtConfirm.text="Confirm Password"
        txtAgree.text="I agree with Terms of service and Privacy policy"
        btnRegister.text="Register"
        txtAlready.text="Already have an account?"
        txtLogin.text="Login"
        txtMale.text="Male"
        txtFemale.text="Female"
        txtOther.text="Other"

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
        })

        txtLogin.setOnClickListener(View.OnClickListener {

            val intent = Intent (this@Register_Activity, LoginActivity::class.java)
            startActivity(intent)
        })







    }


}
