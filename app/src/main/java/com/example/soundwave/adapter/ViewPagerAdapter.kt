package com.example.soundwave.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.soundwave.fragment.MainFragment
import com.example.soundwave.fragment.MusicFragment
import com.example.soundwave.fragment.SearchFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return SearchFragment()
            1 -> return MusicFragment()
        }
        return MainFragment()
    }
}