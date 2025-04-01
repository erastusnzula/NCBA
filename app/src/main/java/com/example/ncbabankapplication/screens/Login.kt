package com.example.ncbabankapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ncbabankapplication.R
import com.example.ncbabankapplication.ui.theme.NCBABANKAPPLICATIONTheme

@Composable
fun Login(navController: NavController) {
    val pin = remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.primary))
    ) {
        Text(
            text = "Please enter your PIN to login",
            color = colorResource(R.color.white)
        )
        Spacer(Modifier.height(10.dp))
        TextField(
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = colorResource(R.color.primary)
            ),
            visualTransformation = PasswordVisualTransformation(),
            shape = RectangleShape,
            value = pin.value,
            onValueChange = {pin.value = it},
            placeholder = {
                Text(
                    text = "Enter PIN",
                    color = colorResource(R.color.secondary).copy(.5f)
                )
            },

            modifier = Modifier
                .fillMaxWidth(.9f)
        )
        Spacer(Modifier.height(20.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = colorResource(R.color.secondary)
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth(.7f)
            ,onClick = {
                navController.navigate(Screens.Home.route)
            }
        ) {
            Text(
                text = "Go for it"
            )
        }
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Keep your PIN private",
            color = colorResource(R.color.white)
        )

    }
}

@Preview
@Composable
fun LoginPreview(){
    NCBABANKAPPLICATIONTheme {
        Login(rememberNavController())
    }
}