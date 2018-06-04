package com.example.bottomnavigation.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R


class ChallengesFragment : Fragment() {

    companion object {
        val TAG: String = ChallengesFragment::class.java.simpleName
        fun newInstance() = ChallengesFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_challenge)
        val view = inflater.inflate(R.layout.fragment_challenges, container, false)
        return view
    }

}