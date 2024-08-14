package com.siso.mvvmandroid.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.siso.mvvmandroid.navigation.ROUTE_HOME

@Composable
fun CalculatorScreen(navController: NavHostController) {
    var input by remember { mutableStateOf("") }
    var input2 by remember { mutableStateOf("") }
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(text = "Calculate",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 24.dp))
            OutlinedTextField(value = input,
                onValueChange = {input=it},
                label = { Text(text = "Input 1",
                    color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp))
            OutlinedTextField(value = input2,
                onValueChange = {input2=it},
                label = { Text(text = "Input 2",
                    color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()) {
                Text(text = "ADD")

            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()) {
                Text(text = "SUBTRACT")

            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()) {
                Text(text = "MULTIPLY")

            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()) {
                Text(text = "DIVIDE")

            }
            TextButton(onClick = {navController.navigate(ROUTE_HOME)},
                modifier = Modifier
                    .fillMaxWidth()) {
                Text(text = "Return to Home Screen",
                    color = Color.DarkGray)

            }


    }

}

@Preview
@Composable
private fun CalcPrev() {
    CalculatorScreen(rememberNavController())

}