package com.ilaydaliceli.odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.ilaydaliceli.odev2.databinding.ActivityMainBinding
import com.ilaydaliceli.odev2.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {


    private lateinit var binding : FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentHomePageBinding.inflate(inflater, container, false)

        binding.buttonNext.setOnClickListener{
            Navigation.findNavController(requireView()).navigate(R.id.action_homePageFragment_to_firstPageFragment)
            Snackbar.make(it, "butona basınız", Snackbar.LENGTH_SHORT).show()
        }



        return binding.root
    }


}