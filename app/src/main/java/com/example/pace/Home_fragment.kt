package com.example.pace


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.LinearLayout
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






       val   saleHome= v.findViewById(R.id.saleHome)as LinearLayout
        val rentHome= v.findViewById<LinearLayout>(R.id.rentHome)

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
