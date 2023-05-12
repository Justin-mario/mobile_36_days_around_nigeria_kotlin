package com.example.android.nigerianstatesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class State(
    val day: Int,
    @StringRes val stateRes: Int,
    @StringRes val capitalRes: Int,
    @StringRes val slogan: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val doYouKnowRes : Int,
)
//    @StringRes val descriptionRes: Int