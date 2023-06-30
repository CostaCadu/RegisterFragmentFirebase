package com.example.registerfragment.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.registerfragment.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth


import com.example.registerfragment.databinding.FragmentRegisterBinding
import com.google.android.material.snackbar.Snackbar

class FragmentRegister : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var auth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }
}
