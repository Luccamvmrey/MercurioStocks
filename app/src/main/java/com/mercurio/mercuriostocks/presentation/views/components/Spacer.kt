package com.mercurio.mercuriostocks.presentation.views.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mercurio.mercuriostocks.presentation.ui.theme.spacing

/**
 * 8dp spacer
 */
@Composable
fun ExtraSmallSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
}

/**
 * 12dp spacer
 */
@Composable
fun SmallSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
}

/**
 * 24dp spacer
 */
@Composable
fun SmallMediumSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.smallMedium))
}

/**
 * 32dp spacer
 */
@Composable
fun MediumSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.medium))
}

/**
 * 48dp spacer
 */
@Composable
fun LargeSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.large))
}

/**
 * 64dp spacer
 */
@Composable
fun ExtraLargeSpacer() {
    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraLarge))
}