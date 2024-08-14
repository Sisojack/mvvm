package com.siso.mvvmandroid.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.siso.mvvmandroid.navigation.ROUTE_REGISTER
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LoginScreen(navController:NavHostController){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)){
        Text(text = "Log in here",
            color = Color.Blue,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive)
        OutlinedTextField(value = email ,
            onValueChange = {email=it},
            label = { Text(text = "Enter Email Adress")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp))
        OutlinedTextField(value = password ,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()) {
            Text(text = "Log In")

        }
        TextButton(onClick = {navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have an account?" +""+
                    "Click here to create your account")

        }

    }
}

@Preview
@Composable
private fun Login() {
    LoginScreen(rememberNavController())
}