package com.example.myfirsapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun CardList(resources: List<CardModel>) {

    Column() {
        resources.forEach { PersonCard(it) }
    }

}