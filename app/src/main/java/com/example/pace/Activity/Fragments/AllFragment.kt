package com.example.pace.Activity.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.pace.R

/**
 * A simple [Fragment] subclass.
 */
class AllFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_all, container, false)

        val allSaved = v.findViewById<View>(R.id.allSaved) as TextView




        allSaved.setOnClickListener(View.OnClickListener {

            val fragment = AllSaved_Fragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        })



        return v
    }

    


}
