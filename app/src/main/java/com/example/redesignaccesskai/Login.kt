package com.example.redesignaccesskai

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    val gradient = Brush.linearGradient(
        colors = listOf(Color(0xFFEF5D9A), Color(0xFF80A6F0)),
        start = Offset(0f, 0f),
        end = Offset.Infinite // Use Offset.Infinite for full container gradient
    )

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(gradient),

            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_kai), contentDescription = "Login image",
                modifier = Modifier.size(150.dp),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffffffff))
        ) {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Email", textAlign = TextAlign.Left, modifier = Modifier.width(280.dp), fontSize = 16.sp)
                OutlinedTextField(value = "", onValueChange = {}, label = {
                    Text(text = "Masukkan email...")
                })

                Spacer(modifier = Modifier.height(50.dp))

                Text("Password", textAlign = TextAlign.Left, modifier = Modifier.width(280.dp), fontSize = 16.sp)
                OutlinedTextField(value = "", onValueChange = {}, label = {
                    Text(text = "Masukkan password...")
                })

                Spacer(modifier = Modifier.height(50.dp))

                Button(
                    onClick = { navController.navigate("home") },
                    modifier = Modifier
                        .width(280.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4B83EF),
                        contentColor = Color(0xFFFFFFFF)
                    )
                ) {
                    Text(text = "Masuk", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(100.dp))

                Row(
                    modifier = Modifier
                        .padding(2.dp),
                    horizontalArrangement = Arrangement.Absolute.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Belum punya akun?", fontSize = 16.sp)
                    TextButton(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color(0xFFEF5D9A)
                        )
                    ) {
                        Text("Buat akun", fontSize = 16.sp)
                    }
                }
            }
        }
    }
}