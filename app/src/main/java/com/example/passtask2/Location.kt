package com.example.passtask2

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val name: String, val author: String,
    val visited: String, val image: Int
):Parcelable
{

}
