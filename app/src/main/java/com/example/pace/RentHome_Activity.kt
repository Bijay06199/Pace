package com.example.pace

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.pace.Activity.Fragments.BedroomFragment
import com.example.pace.Activity.Fragments.ExteriorFragment
import com.example.pace.Activity.NavigationActivity
import kotlinx.android.synthetic.main.activity_sale_home.*

class RentHome_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_home)


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



        // pagerAdapterView = ViewPagerAdapter(supportFragmentManager)





        requestVisit.text="Request Visit"
        email.text="Email"
        txtRoute.text="Route Directions"
        txtExterior.text="Exterior"
        txtLayout.text="Layout"
        txtBathroom.text="Bathroom"
        txtLivingroom.text="Livingroom"
        txtLivingroom11.text="Livingroom11"

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





        if(savedInstanceState==null){

            val fragment= ExteriorFragment()
            val transaction= supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer,fragment)
            transaction.commit()
            imgExterior.visibility=View.VISIBLE
            imgLayout.visibility=View.INVISIBLE
            imgBedroom.visibility=View.INVISIBLE
            imgBathroom.visibility=View.INVISIBLE
            imgLivingRoom.visibility=View.INVISIBLE
            imgLivingRoom11.visibility=View.INVISIBLE

        }




        txtExterior.setOnClickListener(View.OnClickListener {
            val fragment = ExteriorFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()

            imgExterior.visibility=View.VISIBLE
            imgLayout.visibility=View.INVISIBLE
            imgBedroom.visibility=View.INVISIBLE
            imgBathroom.visibility=View.INVISIBLE
            imgLivingRoom.visibility=View.INVISIBLE
            imgLivingRoom11.visibility=View.INVISIBLE
        })


        txtLayout.setOnClickListener(View.OnClickListener {
            val fragment =LayoutFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()

            imgLayout.visibility=View.VISIBLE
            imgExterior.visibility=View.INVISIBLE
            imgBedroom.visibility=View.INVISIBLE
            imgBathroom.visibility=View.INVISIBLE
            imgLivingRoom.visibility=View.INVISIBLE
            imgLivingRoom11.visibility=View.INVISIBLE
        })


        txtBedroom.setOnClickListener(View.OnClickListener {
            val fragment = BedroomFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.saleContainer, fragment)
            transaction.commit()
            imgBedroom.visibility=View.VISIBLE
            imgLayout.visibility=View.INVISIBLE
            imgExterior.visibility=View.INVISIBLE
            imgBathroom.visibility=View.INVISIBLE
            imgLivingRoom.visibility=View.INVISIBLE
            imgLivingRoom11.visibility=View.INVISIBLE
        })



        imgBack.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@RentHome_Activity, NavigationActivity::class.java)
            startActivity(intent)
        })



    }
}
