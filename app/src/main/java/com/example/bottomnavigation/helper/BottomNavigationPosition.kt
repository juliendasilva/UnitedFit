package com.example.bottomnavigation.helper

import android.support.v4.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.ui.fragments.ChallengesFragment
import com.example.bottomnavigation.ui.fragments.HomeFragment
import com.example.bottomnavigation.ui.fragments.ClassementFragment
import com.example.bottomnavigation.ui.fragments.ProfileFragment

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    HOME(0, R.id.home),
    DASHBOARD(1, R.id.dashboard),
    NOTIFICATIONS(2, R.id.settings),
    PROFILE(3, R.id.profile);
}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.HOME.id -> BottomNavigationPosition.HOME
    BottomNavigationPosition.DASHBOARD.id -> BottomNavigationPosition.DASHBOARD
    BottomNavigationPosition.NOTIFICATIONS.id -> BottomNavigationPosition.NOTIFICATIONS
    BottomNavigationPosition.PROFILE.id -> BottomNavigationPosition.PROFILE
    else -> BottomNavigationPosition.HOME
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.newInstance()
    BottomNavigationPosition.DASHBOARD -> ChallengesFragment.newInstance()
    BottomNavigationPosition.NOTIFICATIONS -> ClassementFragment.newInstance()
    BottomNavigationPosition.PROFILE -> ProfileFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.TAG
    BottomNavigationPosition.DASHBOARD -> ChallengesFragment.TAG
    BottomNavigationPosition.NOTIFICATIONS -> ClassementFragment.TAG
    BottomNavigationPosition.PROFILE -> ProfileFragment.TAG
}

