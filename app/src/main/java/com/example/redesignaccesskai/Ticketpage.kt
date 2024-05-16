package com.example.redesignaccesskai

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun TicketPage(navController: NavHostController) {
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
                .height(510.dp)
                .background(Color(0xffffffff))
        ) {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Tiket Saya", textAlign = TextAlign.Left, modifier = Modifier.width(320.dp), fontSize = 25.sp, style = TextStyle(fontWeight = FontWeight.Bold))

                Spacer(modifier = Modifier.height(15.dp))

                Row (
                    modifier = Modifier.width(320.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically)
                {
                    OutlinedButton(onClick = {},
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color(0xff4B83EF),
                        )) {
                        Text("Semua", style = TextStyle(fontWeight = FontWeight.Bold))
                    }
                    OutlinedButton(onClick = {},
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color(0xffD9D9D9),
                        )) {
                        Text("Antar Kota")
                    }
                    OutlinedButton(onClick = {},
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color(0xffD9D9D9),
                        )) {
                        Text("Lokal")
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                Image(
                    painter = painterResource(id = R.drawable.info_tiket),
                    contentDescription = "Info tiket image",
                    modifier = Modifier.size(320.dp),
                )
            }
        }
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Color(0xffffffff))
                .border(BorderStroke(1.dp, Color(0xffD9D9D9))),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.kereta),
                            contentDescription = "Home",
                            modifier = Modifier.size(40.dp),
                        )
                        TextButton(
                            onClick = { navController.navigate("home") },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = Color(0xff000000)
                            )
                        ) {
                            Text("Kereta", fontSize = 16.sp)
                        }
                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tiket_pink),
                            contentDescription = "Ticket",
                            modifier = Modifier.size(40.dp),
                        )
                        TextButton(
                            onClick = { navController.navigate("ticket") },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = Color(0xff000000)
                            )
                        ) {
                            Text("Tiket Saya", fontSize = 16.sp)
                        }
                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profil),
                            contentDescription = "Profile",
                            modifier = Modifier.size(40.dp),
                        )
                        TextButton(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = Color(0xff000000)
                            )
                        ) {
                            Text("Profil", fontSize = 16.sp)
                        }
                    }
                }
            }
        }
    }
}