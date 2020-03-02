package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.pace.Activity.Fragments.AllFragment
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class Saved_fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_saved, container, false)

        val all = v.findViewById<View>(R.id.all) as TextView
        val forRent = v.findViewById<View>(R.id.forRent) as TextView
        val forSale = v.findViewById<View>(R.id.forSale) as TextView
        val savedSearches = v.findViewById<View>(R.id.savedSearches) as TextView


        val allLayoutUnderline= v.findViewById<LinearLayout>(R.id.allLayoutUnderline)
        val forRentLayoutUnderline= v.findViewById<LinearLayout>(R.id.forRentLayoutUnderline)
        val forSaleLayoutUnderline=v.findViewById<LinearLayout>(R.id.forSaleLayoutUnderline)
        val forSavedSearchLayoutUnderline=v.findViewById<LinearLayout>(R.id.forSavedSearchLayoutUnderline)
        val underline= v.findViewById<LinearLayout>(R.id.Underline)


        if (savedInstanceState == null) {
            val fragment = AllFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            clearFindViewByIdCache()


            all.setTextColor(resources.getColor(R.color.colorAccent))
            forRent.setTextColor(resources.getColor(R.color.saved))
            forSale.setTextColor(resources.getColor(R.color.saved))
            savedSearches.setTextColor(resources.getColor(R.color.saved))

            allLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            forSaleLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forRentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSavedSearchLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))




        }


        all.setOnClickListener {
            val fragment = AllFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            clearFindViewByIdCache()
            all.setTextColor(resources.getColor(R.color.colorAccent))
            forRent.setTextColor(resources.getColor(R.color.saved))
            forSale.setTextColor(resources.getColor(R.color.saved))
            savedSearches.setTextColor(resources.getColor(R.color.saved))



            allLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            forSaleLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forRentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSavedSearchLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))





        }

        forRent.setOnClickListener {
            val fragment = ForRent_Fragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            clearFindViewByIdCache()
            all.setTextColor(resources.getColor(R.color.saved))
            forRent.setTextColor(resources.getColor(R.color.colorAccent))
            forSale.setTextColor(resources.getColor(R.color.saved))
            savedSearches.setTextColor(resources.getColor(R.color.saved))

            allLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSaleLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forRentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            forSavedSearchLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))


        }


        forSale.setOnClickListener {
            val fragment = ForSale_Fragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            clearFindViewByIdCache()
            all.setTextColor(resources.getColor(R.color.saved))
            forRent.setTextColor(resources.getColor(R.color.saved))
            forSale.setTextColor(resources.getColor(R.color.colorAccent))
            savedSearches.setTextColor(resources.getColor(R.color.saved))

            allLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSaleLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            forRentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSavedSearchLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))


        }



        savedSearches.setOnClickListener {
            val fragment = SavedSearch_Fragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            clearFindViewByIdCache()
            all.setTextColor(resources.getColor(R.color.saved))
            forRent.setTextColor(resources.getColor(R.color.saved))
            forSale.setTextColor(resources.getColor(R.color.saved))
            savedSearches.setTextColor(resources.getColor(R.color.colorAccent))

            allLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSaleLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forRentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            forSavedSearchLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))


        }


        return v


    }
}
