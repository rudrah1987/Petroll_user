package com.petroll.Navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.petroll.R
import com.petroll.utils.BaseActivity
import com.petroll.databinding.FragmentAuctionBinding
import com.petroll.databinding.FragmentSettingBinding

class SettingsFragment: Fragment() {

    lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(layoutInflater)
//        setUpData("ongoing")
//        setUpRecyclerView()
        setUpBackLayout()
//        setUpClickListener()
        return binding.root
    }

    private fun setUpBackLayout() {
        binding.back.tvBack.text = resources.getText(R.string.setting)
        binding.back.backLayout.setOnClickListener {
            (activity as BaseActivity).onHome()
        }
    }
}