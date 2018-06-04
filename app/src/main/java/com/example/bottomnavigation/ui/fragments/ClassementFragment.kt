package com.example.bottomnavigation.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R


class ClassementFragment : Fragment() {

    companion object {
        val TAG: String = ClassementFragment::class.java.simpleName
        fun newInstance() = ClassementFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_classement)
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        return view
    }

}