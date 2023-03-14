package com.example.myfirsapplication

import android.util.Log
import com.example.myfirsapplication.R.*


private const val TAG = "CarModel"

data class CardModel(
    val firstName: String,
    val lastName: String,
    val occupation: String,
    val drawable: Int
)

fun getCardModels(): List<CardModel> {
    Log.v(TAG, "getAllDrawableIds")
    return drawable::class.java.fields
        .filter { it.name.startsWith("pic") }
        .map {
            val split = it.name.split("_")
            CardModel(split[1], split[2], split[3], it.getInt(null))
        }
}