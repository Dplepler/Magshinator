package com.example.fuckinator.choicescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fuckinator.R
import com.example.fuckinator.databinding.FragmentChoiceScreenBinding

class ChoiceScreen : Fragment() {

    private lateinit var binding: FragmentChoiceScreenBinding

    private lateinit var viewModel: ChoiceViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_choice_screen, container, false)

        viewModel = ViewModelProvider(this).get(ChoiceViewModel::class.java)

        return binding.root
    }
}