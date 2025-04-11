package com.example.ncbabankapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ncbabankapplication.R
import com.example.ncbabankapplication.ui.theme.NCBABANKAPPLICATIONTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 28.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = "Welcome JOHN DOE JANE"
                )
                Row(
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    BadgedBox(
                        modifier = Modifier
                            .padding(end = 20.dp),
                        badge = {
                            Badge(
                                containerColor = Color.Red,
                                contentColor = Color.White,
                                modifier = Modifier
                            ) {
                                Text("80")
                            }

                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Notifications,
                            contentDescription =null
                        )
                    }



                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Login,
                            contentDescription = null,
                            modifier = Modifier
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(colorResource(R.color.primary).copy(.5f))
                .padding(8.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "Your Relationship Manager is >>"
                )
            }

            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.4f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(colorResource(R.color.white))
                    .padding(5.dp, bottom = 30.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    TextButton(
                        modifier = Modifier, onClick = {}) {
                        Text(
                            text = "BANKING"
                        )
                    }
                    TextButton(onClick = {}) {
                        Text(
                            text = "CREDIT CARD"
                        )
                    }
                    TextButton(onClick = {}) {
                        Text(
                            text = "LOAN"
                        )
                    }
                    TextButton(onClick = {}) {
                        Text(
                            text = "DEPOSITS"
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Show balance"
                    )
                    IconToggleButton(checked = false, onCheckedChange = {}) {
                        Icon(
                            imageVector = Icons.Filled.ToggleOn,
                            contentDescription = null,
                            tint = colorResource(R.color.primary),
                            modifier = Modifier
                                .rotate(180f)
                        )
                    }
                }
                Text(
                    text = "Account"
                )
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.white)
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 5.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth(), onClick = {}) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .horizontalScroll(rememberScrollState())
                    ) {

                        Text(
                            text = "57xxxxxx10",
                            fontSize = 14.sp
                        )
                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(R.color.secondary)
                            ),
                            modifier = Modifier,
                            shape = RoundedCornerShape(8.dp), onClick = {}) {
                            Text(
                                text = "View Balance",
                                fontSize = 12.sp
                            )
                        }
                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(R.color.secondary)
                            ),
                            shape = RoundedCornerShape(8.dp), onClick = {}) {
                            Text(
                                text = "View Statement",
                                fontSize = 12.sp
                            )
                        }

                    }
                }
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.white)
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 5.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth(), onClick = {}) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .horizontalScroll(rememberScrollState())
                    ) {

                        Text(
                            text = "57xxxxxx10",
                            fontSize = 14.sp
                        )
                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(R.color.secondary)
                            ),
                            modifier = Modifier,
                            shape = RoundedCornerShape(8.dp), onClick = {}) {
                            Text(
                                text = "View Balance",
                                fontSize = 12.sp
                            )
                        }
                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(R.color.secondary)
                            ),
                            shape = RoundedCornerShape(8.dp), onClick = {}) {
                            Text(
                                text = "View Statement",
                                fontSize = 12.sp
                            )
                        }

                    }
                }

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.2f)
            ) {
                Text(
                    text = "QUICK ACCESS MENU"
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth(.6f)
                ) {
                    TextButton(onClick = {}) {
                        Text(
                            text = "CUSTOMIZE"
                        )
                    }

                    Icon(
                        imageVector = Icons.Filled.Create,
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                    )
                }


            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.7f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(colorResource(R.color.white))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        modifier = Modifier
                            .size(100.dp),
                        onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.mpesa),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .size(100.dp),
                        onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .size(100.dp)
                        ,onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        modifier = Modifier
                            .size(100.dp),
                        onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .size(100.dp),
                        onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .size(100.dp),
                        onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp),
                        )
                    }

                }

            }

        }
    }
}

@Preview
@Composable
fun HomePreview() {
    NCBABANKAPPLICATIONTheme {
        Home(rememberNavController())
    }
}