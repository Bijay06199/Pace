package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.pace.*
import com.example.pace.Adapter.ViewPagerAdapter
import com.example.pace.Adapter.ViewPagerListener
import kotlinx.android.synthetic.main.activity_welcome_splash.*
import kotlinx.android.synthetic.main.activity_welcome_splash.view.*

class WelcomeSplash : AppCompatActivity() {

    var counter: Int=0

    val SELECTED_TAB_EXTRA_KEY:String = "selectedTabIndex"
    val HOME_TAB = 0
    val FAVORITES_TAB = 1
    val NEW_POSTS_TAB = 2


    companion object {
        private const val MIN_SCALE = 0.65f
        private const val MIN_ALPHA = 0.3f
    }
    private lateinit var pagerAdapterView: ViewPagerAdapter
  //  private val uiHelper = UiHelper()






    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)





        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_welcome_splash)



        pagerAdapterView = ViewPagerAdapter(supportFragmentManager)
        addPagerFragments()
        myViewPager?.adapter = pagerAdapterView
        myViewPager?.setPageTransformer(true, this::zoomOutTransformation)
        myViewPager?.addOnPageChangeListener(ViewPagerListener(this::onPageSelected))

      // getStartedButton.typeface = uiHelper.getTypeFace(TypeFaceEnum.BUTTON_TEXT, this)



        val btnSplashNext=findViewById<TextView>(R.id.btnSplashNext)

      //  btnSplashNext.setOnClickListener(View.OnClickListener {
         //  myViewPager.addOnPageChangeListener(ViewPagerListener(this::onPageSelected))




          //  val intent= Intent(this@WelcomeSplash, MainActivity::class.java)
          //  intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK
          //  startActivity(intent)
      //  })




            btnSplashNext.setOnClickListener(View.OnClickListener {




                counter++

          if(counter==1){

              val selected:Int=intent.getIntExtra(SELECTED_TAB_EXTRA_KEY,1 )
              myViewPager.setCurrentItem(selected)





          }

                else if(counter==2){

              val selected:Int=intent.getIntExtra(SELECTED_TAB_EXTRA_KEY,2)
              myViewPager.setCurrentItem(selected)



          }

                else if(counter==3){
                val intent= Intent(this@WelcomeSplash, MainActivity::class.java)
                intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)

          }

                else{

              counter=1

          }




            })

        btnSplashNext1.setOnClickListener(View.OnClickListener {



            counter++

            if(counter==1){


                val selected:Int=intent.getIntExtra(SELECTED_TAB_EXTRA_KEY,counter)
                myViewPager.setCurrentItem(selected)




            }

            else if(counter==2){

                val selected:Int=intent.getIntExtra(SELECTED_TAB_EXTRA_KEY,counter)
                myViewPager.setCurrentItem(selected)



            }

            else if(counter==3){
                val intent= Intent(this@WelcomeSplash, MainActivity::class.java)
                intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)

            }

            else{

                counter=1

            }










        })













    }



    private fun onPageSelected(position: Int) {
        when (position) {
            0 -> {
                firstDotImageView.setImageResource(R.drawable.selecteditem_dot)
                secondDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                thirdDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                counter=0
            }
            1 -> {
                firstDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                secondDotImageView.setImageResource(R.drawable.selecteditem_dot)
                thirdDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                counter=1
            }
            2 -> {

                firstDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                secondDotImageView.setImageResource(R.drawable.nonselecteditem_dot)
                thirdDotImageView.setImageResource(R.drawable.selecteditem_dot)
                counter=2


            }
        }
    }
    private fun addPagerFragments() {
        pagerAdapterView.addFragments(IntroFirstFragment())
        pagerAdapterView.addFragments(IntroSecondFragment())
        pagerAdapterView.addFragments(IntroThirdFragment())
    }
    private fun zoomOutTransformation(page: View, position: Float) {
        when {
            position < -1 ->
                page.alpha = 0f
            position <= 1 -> {
                page.scaleX = Math.max(MIN_SCALE, 1 - Math.abs(position))
                page.scaleY = Math.max(MIN_SCALE, 1 - Math.abs(position))
                page.alpha = Math.max(MIN_ALPHA, 1 - Math.abs(position))
            }
            else -> page.alpha = 0f
        }
    }




    }

