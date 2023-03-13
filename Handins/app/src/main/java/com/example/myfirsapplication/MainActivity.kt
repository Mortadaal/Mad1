package com.example.myfirsapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.myfirsapplication.ui.theme.MyFirsApplicationTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

          MyFirsApplicationTheme{
              val scaffoldState= rememberScaffoldState()
              val scope= rememberCoroutineScope()
            Scaffold(

                scaffoldState = scaffoldState,
                topBar = {
                     AppBar(
                         onNavigationIconClick = {
                             scope.launch {
                                 scaffoldState.drawerState.open()
                             }
                         }
                     )
                },
                drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
                drawerContent = {
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
                          /* when(it.id){
                                "home" ->

                            }*/
                            print("Clicked on ${it.title}")
                        }
                    )
                }
            ) {

            }

          }
        }

    }
}





