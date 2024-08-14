package com.siso.mvvmandroid.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intentscreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Intent screen",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 15.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Share",
                color = Color.White)}
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Stk",
                color = Color.White)}
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Call",
                color = Color.White)}
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Camera",
                color = Color.White)}

            Text(text = "Sms",
                color = Color.White)}
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Email",
                color = Color.White)}
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Dial",
                color = Color.White)}



    }


}

@Preview
@Composable
private fun Intentprev() {
    Intentscreen(rememberNavController())

}
