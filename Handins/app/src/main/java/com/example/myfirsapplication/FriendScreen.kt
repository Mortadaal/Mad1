package com.example.myfirsapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FriendScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Friends List") }

            )
        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Welcome to my app!")
            }
            DrawerHeader()
            DrawerBody(
                items = listOf(
                    MenuItem(
                        id="home",
                        title = "Home",
                        contentDescription = "Go to Home Screen",
                        icon = Icons.Default.Home
                    ),
                    MenuItem(
                        id="friends",
                        title = "Friends",
                        contentDescription = "Go to Friends Screen",
                        icon = Icons.Default.Person
                    )
                ),
                onItemClick ={


                    when(it.id){
                        "home" -> navController.navigate(Screen.HomeScreen.route)
                        "friends" -> navController.navigate(Screen.FriendScreen.route)
                    }
                    print("Clicked on ${it.title}")
                }
            )
        }

    )



}