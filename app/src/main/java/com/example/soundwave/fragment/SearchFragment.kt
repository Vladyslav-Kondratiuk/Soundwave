package com.example.soundwave.fragment

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.soundwave.R
import com.example.soundwave.databinding.FragmentSearchBinding
import com.example.soundwave.utils.viewBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private val binding by viewBinding(FragmentSearchBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animateText("Listening for music")
        initListeners()
    }

    private fun initListeners() {
        binding.lottieAnimationView.setOnClickListener {
            it.isVisible = false
            binding.lottieAnimationView2.isVisible = true
        }
    }


    //TODO remove this code
    private var mText: CharSequence = ""
    private var mIndex = 0
    private val mHandler: Handler = Handler()
    private val characterAdder: Runnable = object : Runnable {
        override fun run() {
            binding.tvTitle.text = mText.subSequence(0, mIndex++)
            if (mIndex <= mText.length) {
                mHandler.postDelayed(this, 40)
            }
        }
    }

    private fun animateText(text: CharSequence) {
        mText = text
        mIndex = 0
        binding.tvTitle.text = ""
        mHandler.removeCallbacks(characterAdder)
        mHandler.postDelayed(characterAdder, 40)
    }
}