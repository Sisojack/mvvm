package com.siso.mvvmandroid.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.siso.mvvmandroid.navigation.ROUTE_CALCULATOR
import com.siso.mvvmandroid.navigation.ROUTE_INTENT
import com.siso.mvvmandroid.navigation.ROUTE_LOGIN
import com.siso.mvvmandroid.navigation.ROUTE_REGISTER

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround) {
        Text(text = "Siso's App",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive

        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "This is my First Class",
            color = Color.Blue,
            fontFamily = FontFamily.Serif,
            fontSize = 10.sp

        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Green,
                contentColor = Color.Magenta)) {
            Text(text = "Log In",
                color = Color.White,
                modifier = Modifier.fillMaxWidth())
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue,
                contentColor = Color.White),
            shape = CircleShape){
            Text(text = "Register")


        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_CALCULATOR) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue,
                contentColor = Color.White),
            shape = CircleShape){
            Text(text = "Calculate")


        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_INTENT) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue,
                contentColor = Color.White),
            shape = CircleShape){
            Text(text = "Intents")


        }


    }

}

@Preview
@Composable
private fun Homeprev() {
    HomeScreen(rememberNavController())
}