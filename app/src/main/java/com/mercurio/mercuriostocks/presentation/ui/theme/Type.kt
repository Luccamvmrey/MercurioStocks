package com.mercurio.mercuriostocks.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mercurio.mercuriostocks.R

val lato = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold, weight = FontWeight.Bold),
    Font(R.font.lato_light, weight = FontWeight.Thin),
    Font(R.font.lato_black, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    labelSmall = TextStyle(
        fontFamily = lato,
        fontSize = 11.sp,
        lineHeight = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = lato,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = lato,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = lato,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = lato,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = lato,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = lato,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    titleMedium = TextStyle(
        fontFamily = lato,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = lato,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = lato,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = lato,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = lato,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    displaySmall = TextStyle(
        fontFamily = lato,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    displayMedium = TextStyle(
        fontFamily = lato,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    displayLarge = TextStyle(
        fontFamily = lato,
        fontSize = 57.sp,
        lineHeight = 64.sp
    ),
)