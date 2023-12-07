package com.mercurio.mercuriostocks.presentation.views.signin.starting_page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun StartingPageScreen(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Starting Page")
    }
}