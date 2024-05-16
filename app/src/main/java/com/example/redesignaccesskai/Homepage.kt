package com.example.redesignaccesskai

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

//@Composable
//fun RoundedBox(
//    backgroundColor: Color,
//    borderColor: Color,
//    cornerRadius: Dp,
//    borderWidth: Dp,
//    content: @Composable BoxScope.() -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .background(backgroundColor, shape = RoundedCornerShape(cornerRadius))
//            .border(borderWidth, borderColor, shape = RoundedCornerShape(cornerRadius))
//            .padding(8.dp) // Optional padding inside the border
//    ) {
//        content()
//    }
//}

@Composable
fun HomePage(navController: NavHostController) {
    val gradient = Brush.linearGradient(
        colors = listOf(Color(0xFFEF5D9A), Color(0xFF80A6F0)),
        start = Offset(0f, 0f),
        end = Offset.Infinite // Use Offset.Infinite for full container gradient
    )

    Column(
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
                painter = painterResource(id = R.drawable.icon_kai),
                contentDescription = "Login image",
                modifier = Modifier.size(150.dp),
            )
        }
        Box(
            modifier = Modifier
                .height(510.dp)
                .background(Color(0xffffffff))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .width(320.dp)
                        .height(100.dp)
                        .background(Color(0xff4B83EF), RoundedCornerShape(10.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(2.dp),
                        horizontalArrangement = Arrangement.Absolute.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.antar_kota),
                            contentDescription = "Kereta antar kota",
                            modifier = Modifier.size(100.dp),
                        )
                        Text(text = "Antar Kota", fontSize = 20.sp, color = Color(0xffffffff), style = TextStyle(fontWeight = FontWeight.Bold))
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Box(
                    modifier = Modifier
                        .width(320.dp)
                        .height(100.dp)
                        .background(Color(0xff4B83EF), RoundedCornerShape(10.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(2.dp),
                        horizontalArrangement = Arrangement.Absolute.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lokal),
                            contentDescription = "Kereta lokal",
                            modifier = Modifier.size(100.dp),
                        )
                        Text(text = "Lokal", fontSize = 20.sp, color = Color(0xffffffff), style = TextStyle(fontWeight = FontWeight.Bold))
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Box(
                    modifier = Modifier
                        .width(320.dp)
                        .height(100.dp)
                        .background(Color(0xff4B83EF), RoundedCornerShape(10.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(2.dp),
                        horizontalArrangement = Arrangement.Absolute.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.commuter_line),
                            contentDescription = "Commuter line",
                            modifier = Modifier.size(100.dp),
                        )
                        Text(text = "Commuter Line", fontSize = 20.sp, color = Color(0xffffffff), style = TextStyle(fontWeight = FontWeight.Bold))
                    }
                }
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
                            painter = painterResource(id = R.drawable.kereta_pink),
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
                            painter = painterResource(id = R.drawable.tiket),
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