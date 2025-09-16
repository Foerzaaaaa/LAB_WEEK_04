package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val cafes = listOf(
        Pair("Starbucks", "Minuman kopi populer dari global brand."),
        Pair("Janji Jiwa", "Kopi kekinian dengan konsep grab-and-go."),
        Pair("Kopi Kenangan", "Kopi lokal dengan berbagai varian rasa.")
    )

    override fun getItemCount(): Int = cafes.size

    override fun createFragment(position: Int): Fragment {
        val (title, desc) = cafes[position]
        return CafeDetailFragment.newInstance(title, desc)
    }
}
