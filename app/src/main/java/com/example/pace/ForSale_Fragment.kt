package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class ForSale_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_sale, container, false)

        val saleSaved = v.findViewById<View>(R.id.saleSaved) as TextView

        saleSaved.setOnClickListener(View.OnClickListener {

            val fragment = ForSaleSaved_Fragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        })


        return v
    }


}
