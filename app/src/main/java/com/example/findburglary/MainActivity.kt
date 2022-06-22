package com.example.findburglary

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.findburglary.ui.theme.FindBurglaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())){
                ListItem(name = "Kotlin", prof = "Hemmezat Bet")

            }


        }
    }
}

@Composable
private fun ListItem(name: String, prof: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.
                    background(Color.Blue)
        ){
           Row(
               verticalAlignment = Alignment.CenterVertically
           ) {
               Image(painter = painterResource(id = R.drawable.kotlin),
                   contentDescription = "image",
                   contentScale = ContentScale.Crop,
                   modifier = Modifier
                       .size(80.dp)
                       .clip(CircleShape)

                   )
               Column(
                   modifier = Modifier.padding(start = 16.dp)
               ) {
                   Text(text = prof,
                   color = Color.White,
                   fontSize = 16.sp)
                   Text(text = name,
                       color = Color.White,
                   fontSize = 20.sp)

               }
               
           }
        }

    }
}

