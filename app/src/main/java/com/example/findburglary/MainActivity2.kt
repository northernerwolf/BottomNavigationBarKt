package com.example.findburglary

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.findburglary.ui.theme.FindBurglaryTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var selectedItem by remember {
                mutableStateOf(0)
            }

            ContentView(selectedItem, onSelectedItem = {
                selectedItem = it
            })

        }
    }


    @Composable
    private fun ContentView(selectedItem : Int , onSelectedItem : (index : Int) -> Unit){
        val items = listOf("Menu", "Add", "History", "Account")

        Column(
            modifier = Modifier.fillMaxSize()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ){

                Text("NorthStar Product")
            }

            Box(
                modifier = Modifier.fillMaxWidth()
            ){
                BottomNavigation(
                    modifier = Modifier
                        .padding(
                            bottom = 20.dp, start = 16.dp, end = 16.dp
                        )
                        .clip(RoundedCornerShape(30)),
                    elevation = 10.dp,
                    backgroundColor = Color.Blue
                ) {

                    items.forEachIndexed{ index, item ->
                        BottomNavigationItem(
                            icon = {
                                when(index){
                                    0 -> {
                                        Icon(Icons.Filled.Home, contentDescription = null)
                                    }
                                    1 ->{
                                        Icon(Icons.Filled.Add, contentDescription = null)
                                    }
                                    2 ->{
                                        Icon(Icons.Filled.Share, contentDescription = null)
                                    }
                                    3 -> {
                                        Icon(Icons.Filled.AccountCircle, contentDescription = null)
                                    }
                                }

                            },
                            label = {
                                Text(item)},

                            selected = selectedItem == index,
                            onClick = {
                                      if(index == 1){
                                                    Toast.makeText(this@MainActivity2,
                                                    "NorthStar", Toast.LENGTH_SHORT).show()}
                                onSelectedItem(index)
                            },
                            selectedContentColor = Color.White,
                            unselectedContentColor = Color.Black
                        )
                    }
                        
                    }

                }
            }

        }
    }


