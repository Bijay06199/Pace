package com.example.pace.Activity

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.pace.*
import com.example.pace.Activity.Fragments.BedroomFragment
import com.example.pace.Activity.Fragments.ExteriorFragment

class SaleHome_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_home)


        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")
        val requestVisit = findViewById<TextView>(R.id.requestVisit)
        val email= findViewById<TextView>(R.id.email)
        val txtRoute=findViewById<TextView>(R.id.txtRoute)
        val txtExterior= findViewById<TextView>(R.id.txtExterior)
        val txtLayout= findViewById<TextView>(R.id.txtLayout)
        val txtBedroom = findViewById<TextView>(R.id.txtBedroom)
        val txtBathroom= findViewById<TextView>(R.id.txtBathroom)
        val txtLivingroom=findViewById<TextView>(R.id.txtLivingRoom)
        val txtLivingroom11=findViewById<TextView>(R.id.txtLivingRoom11)
        val txtLivingroom22=findViewById<TextView>(R.id.txtLivingRoom22)
        val txtLivingroom33=findViewById<TextView>(R.id.txtLivingRoom33)
        val txtLivingroom44=findViewById<TextView>(R.id.txtLivingRoom44)
        val txtLivingroom55=findViewById<TextView>(R.id.txtLivingRoom55)



        requestVisit.text="Request Visit"
        email.text="Email"
        txtRoute.text="Route Directions"
        txtExterior.text="Exterior"
        txtLayout.text="Layout"
        txtBathroom.text="Bathroom"
        txtLivingroom.text="Livingroom"
        txtLivingroom11.text="Livingroom11"
        txtLivingroom22.text="Livingroom22"
        txtLivingroom33.text="Livingroom33"
        txtLivingroom44.text="Livingroom44"
        txtLivingroom55.text="Livingroom55"
        txtBedroom.text="Bedroom"

        requestVisit.typeface=typeface
        email.typeface=typeface
        txtRoute.typeface=typeface
        txtExterior.typeface=typeface
        txtLayout.typeface=typeface
        txtBedroom.typeface=typeface
        txtBathroom.typeface=typeface
        txtLivingroom.typeface=typeface
        txtLivingroom11.typeface=typeface
        txtLivingroom22.typeface=typeface
        txtLivingroom33.typeface=typeface
        txtLivingroom44.typeface=typeface
        txtLivingroom55.typeface=typeface




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


        txtLayout.setOnClickListener(View.OnClickListener {
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
