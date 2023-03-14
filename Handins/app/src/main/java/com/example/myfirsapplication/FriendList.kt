package com.example.myfirsapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun FriendList(resources: List<FriendModel>) {

    Column() {
        resources.forEach { PersonCard(it) }
    }

}