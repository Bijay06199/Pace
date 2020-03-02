package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * A simple [Fragment] subclass.
 */
class ForSaleSaved_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v= inflater.inflate(R.layout.fragment_for_sale_saved_, container, false)


        val imgheart=v.findViewById<ImageView>(R.id.imgheart)
        val imgsavedheart=v.findViewById<ImageView>(R.id.imgsavedheart)

        val imgheart1=v.findViewById<ImageView>(R.id.imgheart1)
        val imgsavedheart1=v.findViewById<ImageView>(R.id.imgsavedheart1)
        val imgheart2=v.findViewById<ImageView>(R.id.imgheart2)
        val imgsavedheart2=v.findViewById<ImageView>(R.id.imgsavedheart2)
        val imgheart3=v.findViewById<ImageView>(R.id.imgheart3)
        val imgsavedheart3=v.findViewById<ImageView>(R.id.imgsavedheart3)


        imgheart.setOnClickListener(View.OnClickListener {
            imgsavedheart.visibility=View.VISIBLE
            imgheart.visibility=View.INVISIBLE
        })

        imgsavedheart.setOnClickListener(View.OnClickListener {
            imgheart.visibility=View.VISIBLE
            imgsavedheart.visibility=View.INVISIBLE
        })


        imgheart1.setOnClickListener(View.OnClickListener {
            imgsavedheart1.visibility=View.VISIBLE
            imgheart1.visibility=View.INVISIBLE
        })

        imgsavedheart1.setOnClickListener(View.OnClickListener {
            imgheart1.visibility=View.VISIBLE
            imgsavedheart1.visibility=View.INVISIBLE
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

        return v
    }


}
