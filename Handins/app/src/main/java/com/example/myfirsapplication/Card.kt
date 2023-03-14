package com.example.myfirsapplication

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

private const val TAG = "ActorCard"

@Composable
fun PersonCard(model: CardModel) {

    Card(
        Modifier
            .fillMaxWidth()
            .clickable {
                Log.v(TAG, model.drawable.toString())
            }) {
        Row() {
            Image(
                painter = painterResource(id = model.drawable),
                contentDescription = "Clint Eastwood",
                modifier = Modifier
                    .width(100.dp)
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(all = 10.dp)
            ) {
                Text(
                    text = "${model.firstName} ${model.lastName}",
                    style = MaterialTheme.typography.h5
                )
                Text(text = "Occupation: ${model.occupation}", style = MaterialTheme.typography.h5)
            }
        }
    }
}