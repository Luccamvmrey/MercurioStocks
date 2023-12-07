package com.mercurio.mercuriostocks.presentation.navigation

sealed class Screen(val route: String) {
    data object StartingScreen : Screen("starting_screen")
    data object LoginScreen : Screen("login_screen")
    data object RegistrationScreen : Screen("registration_screen")
    data object ResetPasswordScreen : Screen("reset_password_screen")
    data object HomeScreen : Screen("home_screen")
    data object PortfolioManagementScreen : Screen("portfolio_management_screen")
    data object StockDetailScreen : Screen("stock_detail_screen")
    data object NotificationScreen : Screen("notification_screen")
    data object SettingsScreen : Screen("settings_screen")

    fun withArgs(vararg parameters: String): String {
        return buildString {
            append(route)
            parameters.forEach { param ->
                append("/$param")
            }
        }
    }
}