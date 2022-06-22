package com.example.findburglary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfilPage(){

    Column() {
        Image(painter = painterResource(id = R.drawable.hachi),
            contentDescription ="hachi" )
        
    }

}
@Preview(showBackground = true)
@Composable
fun ProfilPagePreview(){
    ProfilPage()
}
