package com.example.soundwave.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.example.soundwave.R
import com.example.soundwave.databinding.FragmentSearchBinding
import com.example.soundwave.utils.viewBinding
import com.example.soundwave.viewmodel.SharedViewModel

class SearchFragment : Fragment(R.layout.fragment_search) {

    private val binding by viewBinding(FragmentSearchBinding::bind)

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        //hardcoded data
        binding.lottieAnimationView.setOnClickListener {
            it.isVisible = false
            binding.lottieAnimationView2.isVisible = true
            binding.ivProducer.isVisible = true
            setImage()
            sharedViewModel.setTitle("Suicide Boy$: Runnin Thru the 7th with My Woadies")
            binding.tvDescription.isVisible = true
            binding.btnDetails.isVisible = true
            sharedViewModel.setTitleShrink(true)
        }
        binding.btnDetails.setOnClickListener {
            sharedViewModel.setTitleShrink(false)
            sharedViewModel.setTitle("Listening for music")
            binding.lottieAnimationView.isVisible = true
            binding.lottieAnimationView2.isVisible = false
            binding.ivProducer.isVisible = false
            binding.tvDescription.isVisible = false
            binding.btnDetails.isVisible = false
        }
    }

    private fun setImage() {
        Glide
            .with(this)
            .load(R.drawable.test)
            .circleCrop()
            .into(binding.ivProducer)
    }
}