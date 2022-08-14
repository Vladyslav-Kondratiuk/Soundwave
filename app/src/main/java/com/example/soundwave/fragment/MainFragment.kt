package com.example.soundwave.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import com.example.soundwave.R
import com.example.soundwave.adapter.ViewPagerAdapter
import com.example.soundwave.databinding.FragmentMainBinding
import com.example.soundwave.utils.viewBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initViews()
    }

    private fun initListeners() {

    }

    private fun initViews() {
        val adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.icon = AppCompatResources.getDrawable(
                requireContext(),
                if (position == 0) R.drawable.search
                else R.drawable.music
            )
        }.attach()
    }
}