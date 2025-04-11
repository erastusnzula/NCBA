package com.example.ncbabankapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ncbabankapplication.R
import com.example.ncbabankapplication.ui.theme.NCBABANKAPPLICATIONTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun Welcome(navController: NavController) {
    val width = LocalConfiguration.current.screenWidthDp.dp
    val height = LocalConfiguration.current.screenHeightDp.dp
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    Scaffold(
        modifier = Modifier
            .background(colorResource(R.color.white))
            .padding(top = 28.dp, bottom = 28.dp),
        topBar = { HomeTopBar(navController=navController, scope=scope, drawerState=drawerState) },
        bottomBar = {},
        containerColor = colorResource(R.color.white),
        contentColor = colorResource(R.color.secondary),
        contentWindowInsets = WindowInsets.systemBars
    ) {innerPadding->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding)
                .background(colorResource(R.color.primary).copy(.5f))

        ) {
            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .height(180.dp)
                    .clip(RoundedCornerShape(8.dp))

            ) {
                Image(
                    painter = painterResource(R.drawable.welcome),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth(.7f)
                        .fillMaxHeight()
                )
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(R.color.white))
                        .clickable {
                            navController.navigate(Screens.Login.route)
                        }
                ){
                    IconButton(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(colorResource(R.color.primary))

                        ,onClick = {
                            navController.navigate(Screens.Login.route)
                        }) {
                        Icon(
                            imageVector = Icons.Filled.Key,
                            contentDescription = null,
                            tint = colorResource(R.color.white),
                            modifier = Modifier
                                .size(40.dp)
                                .rotate(45f)
                        )
                    }
                    TextButton(
                        modifier = Modifier,
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = colorResource(R.color.secondary)
                        )
                        ,onClick = {
                            navController.navigate(Screens.Login.route)
                        }) {
                        Text(
                            text = "LOGIN",
                        )
                    }
                }

            }
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(colorResource(R.color.white))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(.3f)
                        .background(colorResource(R.color.primary))
                ) {

                }
            }
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(8.dp))

            ) {
                Image(
                    painterResource(R.drawable.new_digital),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(colorResource(R.color.white))
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(.2f)
                        .background(colorResource(R.color.primary))
                        .padding(5.dp)
                ) {
                    Text(
                        text = "CONTACT US",
                        color = colorResource(R.color.white)
                    )

                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painterResource(R.drawable.contact_us),
                        contentScale = ContentScale.FillBounds,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth(.8f)
                            .fillMaxHeight()
                    )
                    Column (
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(top = 10.dp, bottom = 10.dp)
                    ){
                        IconButton(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(Color.Green)
                            ,onClick = {}) {
                            Icon(
                                tint = colorResource(R.color.white),
                                imageVector = Icons.Filled.Whatsapp,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(30.dp)

                            )
                        }
                        IconButton(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(Color.LightGray)
                            ,onClick = {}) {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = null,
                                tint = Color.Green,
                                modifier = Modifier
                                    .size(30.dp)
                            )
                        }
                        IconButton(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(Color.LightGray)
                            ,onClick = {}) {
                            Icon(
                                imageVector = Icons.Filled.Call,
                                contentDescription = null,
                                tint = colorResource(R.color.primary),
                                modifier = Modifier
                                    .size(30.dp)
                            )
                        }
                    }

                }
            }
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(5.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(colorResource(R.color.primary))
                    .padding(8.dp)
            ) {
                Text(
                    text = "BID & DRIVE",
                    color = colorResource(R.color.white)
                )
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(.75f)

                    ) {
                        Text(
                            text = "DRIVE THE DEAL HOME",
                            color = colorResource(R.color.white),
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Choose from a wide selection of vehicles from",
                            color = colorResource(R.color.white),
                            fontSize = 12.sp
                        )
                        Text(
                            text = "Kenya's leading online auto auction",
                            color = colorResource(R.color.white)
                        )

                    }
                    Image(
                        painter = painterResource(R.drawable.vh),
                        contentScale = ContentScale.FillWidth,
                        contentDescription = null
                    )

                }
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.white),
                        contentColor = colorResource(R.color.secondary)
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth(.7f)
                        .align(Alignment.CenterHorizontally)
                    ,
                    onClick = {}) {
                    Text(
                        text = "VIEW AUCTIONS"
                    )
                }

            }

        }
    }
}

@Composable
fun HomeTopBar(navController: NavController, scope: CoroutineScope, drawerState: DrawerState){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(R.color.white)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            modifier = Modifier
                .padding(start = 20.dp)
                .size(90.dp)
            ,onClick = {
            scope.launch {
                drawerState.apply {
                    if (isClosed) open() else close()
                }
            }

        }) {
            Icon(
                painter = painterResource(R.drawable.ncba_logo),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(90.dp)
            )
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                modifier = Modifier
                    .size(28.dp)
                ,onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.NotificationsNone,
                    contentDescription = null,
                    tint = colorResource(R.color.secondary),
                    modifier = Modifier
                        .size(28.dp)
                )
            }

            IconButton(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .size(40.dp)
                ,onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = null,
                    tint = colorResource(R.color.secondary),
                    modifier = Modifier
                        .size(40.dp)
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    NCBABANKAPPLICATIONTheme {
        Welcome(navController = rememberNavController())
    }
}