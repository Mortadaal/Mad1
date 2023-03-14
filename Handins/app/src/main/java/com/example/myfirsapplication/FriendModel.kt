package com.example.myfirsapplication

import android.util.Log
import com.example.myfirsapplication.R.*


private const val TAG = "CarModel"

data class FriendModel(
    val firstName: String,
    val lastName: String,
    val drawable: Int
)

fun getFriendModelModels(): List<FriendModel> {
    Log.v(TAG, "getAllDrawableIds")
    return drawable::class.java.fields
        .filter { it.name.startsWith("pic") }
        .map {
            val split = it.name.split("_")
            FriendModel(split[1], split[2],  it.getInt(null))
        }
}