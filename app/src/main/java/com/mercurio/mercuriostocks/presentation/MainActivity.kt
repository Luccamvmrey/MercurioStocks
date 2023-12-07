package com.mercurio.mercuriostocks.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mercurio.mercuriostocks.presentation.navigation.Navigation
import com.mercurio.mercuriostocks.presentation.ui.theme.MercurioStocksTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MercurioStocksTheme {
                Navigation()
            }
        }
    }
}

