package com.example.pace.Activity.Fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.pace.Activity.Chat1_Activity
import com.example.pace.R
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class Chat_fragment : Fragment() {




    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =inflater.inflate(R.layout.fragment_chat,container,false)


        val chat1= v.findViewById<LinearLayout>(R.id.chat1)



        chat1.setOnClickListener(View.OnClickListener {


            val intent = Intent (this@Chat_fragment.context, Chat1_Activity::class.java)
            startActivity(intent)
            clearFindViewByIdCache()

        })


















        return v





    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }




}
