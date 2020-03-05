package com.example.pace

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.transition.TransitionManager
import com.example.pace.Activity.EmailActivity
import com.example.pace.Activity.Fragments.BedroomFragment
import com.example.pace.Activity.Fragments.ExteriorFragment
import com.example.pace.Activity.NavigationActivity
import com.example.pace.Activity.RequestVisit
import com.example.pace.Adapter.ViewPagerAdapter
import com.example.pace.Adapter.ViewPagerListener
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_sale_home.*
import kotlinx.android.synthetic.main.fragment_exterior.*

class SaleHomeActivity : AppCompatActivity() {

    var counter: Int=0





    private lateinit var pagerAdapterView: ViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_home)





       val linearLayout=findViewById<LinearLayout>(R.id.linearlayout)


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

        val fab= findViewById<FloatingActionButton>(R.id.fab)





        email.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@SaleHomeActivity,EmailActivity::class.java)
            startActivity(intent)
        })




requestVisit.setOnClickListener(View.OnClickListener {

    val intent=Intent(this@SaleHomeActivity,RequestVisit::class.java)
    startActivity(intent)
})



       fab.setOnClickListener(View.OnClickListener {




               fab.setImageResource(R.drawable.cross)
               val inflater: LayoutInflater =
                   getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
               val view = inflater.inflate(R.layout.popup_layout, null)
               overlap.setBackgroundColor(resources.getColor(R.color.TRANSPARENT))




               val popupWindow = PopupWindow(
                   view, // Custom view to show in popup window
                   LinearLayout.LayoutParams.MATCH_PARENT, // Width of popup window
                   LinearLayout.LayoutParams.WRAP_CONTENT // Window height

               )

               popupWindow.elevation = 10.0F
           popupWindow.height=700
               popupWindow.animationStyle=R.style.popup_animation

           popupWindow.isTouchable=true
           popupWindow.dismiss()
           popupWindow.isOutsideTouchable=true






               popupWindow.setOnDismissListener(PopupWindow.OnDismissListener {
                   fab.setImageResource(R.drawable.phonechat)


                   overlap.setBackgroundColor(resources.getColor(R.color.transparentpop))

               })

               popupWindow.showAsDropDown(coordinator)



               //   val slideIn = Slide()
               // slideIn.slideEdge = Gravity.BOTTOM
               //  popupWindow.enterTransition = slideIn

               // Slide animation for popup window exit transition
               //   val slideOut = Slide()
               // slideOut.slideEdge = Gravity.END
               // popupWindow.exitTransition = slideOut


               TransitionManager.beginDelayedTransition(overlap)
               popupWindow.showAtLocation(
                   overlap, // Location to display popup window
                   Gravity.BOTTOM, // Exact position of layout to display popup
                   0, // X offset
                   0 // Y offset
               )




        })





        val imgheart= findViewById<ImageView>(R.id.imgheart)
        val imgsavedheart=findViewById<ImageView>(R.id.imgsavedheart)

        imgheart.setOnClickListener(View.OnClickListener {

            imgheart.visibility=View.INVISIBLE
            imgsavedheart.visibility=View.VISIBLE
        })

        imgsavedheart.setOnClickListener(View.OnClickListener {

            imgsavedheart.visibility=View.INVISIBLE
            imgheart.visibility=View.VISIBLE
        })






        pagerAdapterView = ViewPagerAdapter(supportFragmentManager)
        addPagerFragments()
        myViewPager1?.adapter = pagerAdapterView
       // myViewPager1?.setPageTransformer(true, this::zoomOutTransformation)
        myViewPager1?.addOnPageChangeListener(ViewPagerListener(this::onPageSelected))


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

            val intent= Intent(this@SaleHomeActivity,
                NavigationActivity::class.java)
            startActivity(intent)
        })



    }



    private fun onPageSelected(position: Int) {
        when (position) {
            0 -> {
                imgExterior.visibility=View.VISIBLE
                imgLayout.visibility=View.INVISIBLE
                imgBedroom.visibility=View.INVISIBLE
                imgBathroom.visibility=View.INVISIBLE
                imgLivingRoom.visibility=View.INVISIBLE
                imgLivingRoom11.visibility=View.INVISIBLE
                val fragment = ExteriorFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.saleContainer, fragment)
                transaction.commit()
            }
            1 -> {
                imgLayout.visibility=View.VISIBLE
                imgExterior.visibility=View.INVISIBLE
                imgBedroom.visibility=View.INVISIBLE
                imgBathroom.visibility=View.INVISIBLE
                imgLivingRoom.visibility=View.INVISIBLE
                imgLivingRoom11.visibility=View.INVISIBLE
                val fragment =LayoutFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.saleContainer, fragment)
                transaction.commit()
            }
            2 -> {
                imgBedroom.visibility=View.VISIBLE
                imgLayout.visibility=View.INVISIBLE
                imgExterior.visibility=View.INVISIBLE
                imgBathroom.visibility=View.INVISIBLE
                imgLivingRoom.visibility=View.INVISIBLE
                imgLivingRoom11.visibility=View.INVISIBLE
                val fragment = BedroomFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.saleContainer, fragment)
                transaction.commit()

            }
        }
    }



    private fun addPagerFragments() {
        pagerAdapterView.addFragments(ExteriorFragment())
        pagerAdapterView.addFragments(LayoutFragment())
        pagerAdapterView.addFragments(BedroomFragment())
    }
}
