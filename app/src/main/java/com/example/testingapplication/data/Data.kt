package com.example.testingapplication.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    val _id: String? = null,
    val index: Int? = null,
    val guid: String? = null,
    val isActive: Boolean? = null,
    val balance: String? = null,
    val picture: String? = null,
    val age: Int? = null,
    val eyeColor: String? = null,
    val name: String? = null,
    val gender: String? = null,
    val company: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null,
    val about: String? = null,
    val registered: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
) : Parcelable {
    override fun toString(): String {
        return "_id=$_id, index=$index, guid=$guid, isActive=$isActive, balance=$balance, picture=$picture, age=$age, eyeColor=$eyeColor, name=$name, gender=$gender, company=$company, email=$email, phone=$phone, address=$address, about=$about, registered=$registered, latitude=$latitude, longitude=$longitude"
    }
}