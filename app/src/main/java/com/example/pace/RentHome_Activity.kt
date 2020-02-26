package com.example.pace

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.pace.Activity.Fragments.BedroomFragment
import com.example.pace.Activity.Fragments.ExteriorFragment

class RentHome_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_home)


        val typeface= Typeface.createFromAsset(assets,"Quicksand_Light.otf")
        val requestVisit = findViewById<TextView>(R.id.requestVisit)
        val email= findViewById<TextView>(R.id.email)
        val txtRoute=findViewById<TextView>(R.id.txtRoute)
        val txtExterior= findViewById<TextView>(R.id.txtExterior)
        val txtLogout= findViewById<TextView>(R.id.txtLogout)
        val txtBedroom = findViewById<TextView>(R.id.txtBedroom)
        val txtBathroom= findViewById<TextView>(R.id.txtBathroom)


        requestVisit.text="Request Visit"
        email.text="Email"
        txtRoute.text="Route Directions"

        requestVisit.typeface=typeface
        email.typeface=typeface
        txtRoute.typeface=typeface


        if(savedInstanceState==null){

            val fragment= ExteriorFragment()
            val transaction= supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer,fragment)
            transaction.commit()
        }




        txtExterior.setOnClickListener(View.OnClickListener {
            val fragment = ExteriorFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()
        })


        txtLogout.setOnClickListener(View.OnClickListener {
            val fragment =LayoutFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()
        })


        txtBedroom.setOnClickListener(View.OnClickListener {
            val fragment = BedroomFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()
        })

    }
}
