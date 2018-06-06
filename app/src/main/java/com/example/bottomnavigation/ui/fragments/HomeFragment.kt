package com.example.bottomnavigation.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R
import com.example.bottomnavigation.ui.item.ChallengeInProgressItem
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    companion object {
        val TAG: String = HomeFragment::class.java.simpleName
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_home)
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.recyclerViewChallengeInProgress.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        val itemAdapter = FastItemAdapter<ChallengeInProgressItem>()

        for (i in 0..2) {
            itemAdapter.add(ChallengeInProgressItem())
        }

        view.recyclerViewChallengeInProgress.adapter = itemAdapter

    }

}