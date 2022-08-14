package com.example.soundwave.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.soundwave.R
import com.example.soundwave.databinding.FragmentSearchBinding
import com.example.soundwave.utils.viewBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private val binding by viewBinding(FragmentSearchBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        setImage()
    }

    private fun initListeners() {
        //hardcoded data
        binding.lottieAnimationView.setOnClickListener {
            it.isVisible = false
            binding.lottieAnimationView2.isVisible = true
            binding.ivProducer.isVisible = true
        }
    }

    private fun setImage() {
        Glide.with(this)
            .load("https://i.ytimg.com/vi/WBRSbnUlGIk/maxresdefault.jpg")
            .circleCrop()
            .into(binding.ivProducer)
    }
}