package com.example.fuckinator.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fuckinator.R
import com.example.fuckinator.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {


    private lateinit var binding: FragmentTitleBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title, container, false)

        binding.PlayButton.setOnClickListener { it.findNavController().navigate(R.id.action_titleFragment_to_choiceScreen) }

        return binding.root
    }
}