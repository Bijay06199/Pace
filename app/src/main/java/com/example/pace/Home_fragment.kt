package com.example.pace


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.viewpager.widget.ViewPager
import com.example.pace.Activity.SaleHome_Activity
import com.example.pace.Adapter.ViewPagerAdapter
import com.example.pace.Adapter.ViewPagerListener
import kotlinx.android.synthetic.main.activity_welcome_splash.*
import kotlinx.android.synthetic.main.fragment_home.*
//import kotlinx.android.synthetic.main.fragment_home.myViewPager

/**
 * A simple [Fragment] subclass.
 */
class Home_fragment : Fragment() {

   //var lstSlides:MutableList<Slide> =ArrayList()
   //var sliderPage: ViewPager?=null

    private lateinit var pagerAdapterView: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_home, container, false)



        val imgheart= v.findViewById<ImageView>(R.id.imgheart)
        val imgsavedheart= v.findViewById<ImageView>(R.id.imgsavedheart)
        val imgheart1= v.findViewById<ImageView>(R.id.imgheart1)
        val imgsavedheart1= v.findViewById<ImageView>(R.id.imgsavedheart1)
        val imgheart2= v.findViewById<ImageView>(R.id.imgheart2)
        val imgsavedheart2= v.findViewById<ImageView>(R.id.imgsavedheart2)
        val imgheart3= v.findViewById<ImageView>(R.id.imgheart3)
        val imgsavedheart3= v.findViewById<ImageView>(R.id.imgsavedheart3)
        val imgheart4= v.findViewById<ImageView>(R.id.imgheart4)
        val imgsavedheart4= v.findViewById<ImageView>(R.id.imgsavedheart4)
        val imgheart5= v.findViewById<ImageView>(R.id.imgheart5)
        val imgsavedheart5= v.findViewById<ImageView>(R.id.imgsavedheart5)
        val imgheart6= v.findViewById<ImageView>(R.id.imgheart6)
        val imgsavedheart6= v.findViewById<ImageView>(R.id.imgsavedheart6)
        val imgheart7= v.findViewById<ImageView>(R.id.imgheart7)
        val imgsavedheart7= v.findViewById<ImageView>(R.id.imgsavedheart7)
        val imgheart8= v.findViewById<ImageView>(R.id.imgheart8)
        val imgsavedheart8= v.findViewById<ImageView>(R.id.imgsavedheart8)
        val imgheart9= v.findViewById<ImageView>(R.id.imgheart9)
        val imgsavedheart9= v.findViewById<ImageView>(R.id.imgsavedheart9)
        val imgheart11= v.findViewById<ImageView>(R.id.imgheart11)
        val imgsavedheart22= v.findViewById<ImageView>(R.id.imgsavedheart22)
        val imgheart22= v.findViewById<ImageView>(R.id.imgheart22)
        val imgsavedheart11= v.findViewById<ImageView>(R.id.imgsavedheart11)
        val imgheart0= v.findViewById<ImageView>(R.id.imgheart0)
        val imgsavedheart0= v.findViewById<ImageView>(R.id.imgsavedheart0)


        imgheart.setOnClickListener(View.OnClickListener {
            imgsavedheart.visibility=View.VISIBLE
            imgheart.visibility=View.INVISIBLE
        })

        imgsavedheart.setOnClickListener(View.OnClickListener {
            imgheart.visibility=View.VISIBLE
            imgsavedheart.visibility=View.INVISIBLE
        })


        imgheart0.setOnClickListener(View.OnClickListener {
            imgsavedheart0.visibility=View.VISIBLE
            imgheart0.visibility=View.INVISIBLE
        })

        imgsavedheart0.setOnClickListener(View.OnClickListener {
            imgheart0.visibility=View.VISIBLE
            imgsavedheart0.visibility=View.INVISIBLE
        })


        imgheart1.setOnClickListener(View.OnClickListener {
            imgsavedheart1.visibility=View.VISIBLE
            imgheart1.visibility=View.INVISIBLE
        })

        imgsavedheart1.setOnClickListener(View.OnClickListener {
            imgheart1.visibility=View.VISIBLE
            imgsavedheart1.visibility=View.INVISIBLE
        })


        imgheart22.setOnClickListener(View.OnClickListener {
            imgsavedheart22.visibility=View.VISIBLE
            imgheart22.visibility=View.INVISIBLE
        })

        imgsavedheart22.setOnClickListener(View.OnClickListener {
            imgheart22.visibility=View.VISIBLE
            imgsavedheart22.visibility=View.INVISIBLE
        })

        imgheart11.setOnClickListener(View.OnClickListener {
            imgsavedheart11.visibility=View.VISIBLE
            imgheart11.visibility=View.INVISIBLE
        })

        imgsavedheart11.setOnClickListener(View.OnClickListener {
            imgheart11.visibility=View.VISIBLE
            imgsavedheart11.visibility=View.INVISIBLE
        })

        imgheart2.setOnClickListener(View.OnClickListener {
            imgsavedheart2.visibility=View.VISIBLE
            imgheart2.visibility=View.INVISIBLE
        })

        imgsavedheart2.setOnClickListener(View.OnClickListener {
            imgheart2.visibility=View.VISIBLE
            imgsavedheart2.visibility=View.INVISIBLE
        })


        imgheart3.setOnClickListener(View.OnClickListener {
            imgsavedheart3.visibility=View.VISIBLE
            imgheart3.visibility=View.INVISIBLE
        })

        imgsavedheart3.setOnClickListener(View.OnClickListener {
            imgheart3.visibility=View.VISIBLE
            imgsavedheart3.visibility=View.INVISIBLE
        })


        imgheart4.setOnClickListener(View.OnClickListener {
            imgsavedheart4.visibility=View.VISIBLE
            imgheart.visibility=View.INVISIBLE
        })

        imgsavedheart4.setOnClickListener(View.OnClickListener {
            imgheart4.visibility=View.VISIBLE
            imgsavedheart4.visibility=View.INVISIBLE
        })


        imgheart5.setOnClickListener(View.OnClickListener {
            imgsavedheart5.visibility=View.VISIBLE
            imgheart5.visibility=View.INVISIBLE
        })

        imgsavedheart5.setOnClickListener(View.OnClickListener {
            imgheart5.visibility=View.VISIBLE
            imgsavedheart5.visibility=View.INVISIBLE
        })


        imgheart6.setOnClickListener(View.OnClickListener {
            imgsavedheart6.visibility=View.VISIBLE
            imgheart6.visibility=View.INVISIBLE
        })

        imgsavedheart6.setOnClickListener(View.OnClickListener {
            imgheart6.visibility=View.VISIBLE
            imgsavedheart6.visibility=View.INVISIBLE
        })


        imgheart7.setOnClickListener(View.OnClickListener {
            imgsavedheart7.visibility=View.VISIBLE
            imgheart7.visibility=View.INVISIBLE
        })

        imgsavedheart7.setOnClickListener(View.OnClickListener {
            imgheart7.visibility=View.VISIBLE
            imgsavedheart7.visibility=View.INVISIBLE
        })


        imgheart8.setOnClickListener(View.OnClickListener {
            imgsavedheart8.visibility=View.VISIBLE
            imgheart8.visibility=View.INVISIBLE
        })

        imgsavedheart8.setOnClickListener(View.OnClickListener {
            imgheart8.visibility=View.VISIBLE
            imgsavedheart8.visibility=View.INVISIBLE
        })

        imgheart9.setOnClickListener(View.OnClickListener {
            imgsavedheart9.visibility=View.VISIBLE
            imgheart9.visibility=View.INVISIBLE
        })

        imgsavedheart9.setOnClickListener(View.OnClickListener {
            imgheart9.visibility=View.VISIBLE
            imgsavedheart9.visibility=View.INVISIBLE
        })



       val   saleHome= v.findViewById(R.id.saleHome)as RelativeLayout
        val rentHome= v.findViewById<RelativeLayout>(R.id.rentHome)

        saleHome.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@Home_fragment.context,SaleHome_Activity::class.java)
            startActivity(intent)


        })


        rentHome.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Home_fragment.context,RentHome_Activity::class.java)
            startActivity(intent)


        })






        return  v
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pagerAdapterView = ViewPagerAdapter(childFragmentManager)
        addPagerFragments()
        myViewPager1?.adapter = pagerAdapterView
        myViewPager1?.addOnPageChangeListener(ViewPagerListener(this::onPageSelected))
    }

    private fun onPageSelected(position: Int) {
        when (position) {
            0 -> {
                firstDotImageView1.setImageResource(R.drawable.selecteditemhome_dot)
                secondDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
                thirdDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
            }
            1 -> {
                firstDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
                secondDotImageView1.setImageResource(R.drawable.selecteditemhome_dot)
                thirdDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
            }
            2 -> {
                // val position=2
                firstDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
                secondDotImageView1.setImageResource(R.drawable.nonselecteditemhome_dot)
                thirdDotImageView1.setImageResource(R.drawable.selecteditemhome_dot)
                // val intent= Intent(this@WelcomeSplash, LoginActivity::class.java)
                //intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK
                // startActivity(intent)

            }
        }
    }
    private fun addPagerFragments() {
        pagerAdapterView.addFragments(HomeFirstFragment())
        pagerAdapterView.addFragments(HomeSecondFragment())
        pagerAdapterView.addFragments(HomeThirdFragment())
    }


}
