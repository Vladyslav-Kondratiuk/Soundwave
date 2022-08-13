package com.example.soundwave.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.soundwave.R

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        navigateToMainFragment()
    }

    private fun navigateToMainFragment() {
        findNavController().navigate(R.id.navigate_to_main_fragment)
    }
}