package br.com.fiap.zippygo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import br.com.fiap.zippygo.screens.CreateAccountScreen
import br.com.fiap.zippygo.screens.EnterScreen
import br.com.fiap.zippygo.screens.LoginScreen
import br.com.fiap.zippygo.screens.MainScreen
import br.com.fiap.zippygo.screens.McDonaldsScreen
import br.com.fiap.zippygo.screens.RealizandoPedidoScreen
import br.com.fiap.zippygo.screens.TelaSucessoScreen
import br.com.fiap.zippygo.ui.theme.ZippyGOTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZippyGOTheme {
                Surface {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "entrada"
                    ) {
                        composable(route = "entrada") {
                            EnterScreen(navController)
                        }
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "criar") {
                            CreateAccountScreen(navController)
                        }
                        composable(route = "principal") {
                            MainScreen(navController)
                        }
                        composable(route = "mcdonalds") {
                            McDonaldsScreen(navController)
                        }
                        composable(route = "pagamento") {
                            RealizandoPedidoScreen(navController, "drone", {})
                        }
                        composable(route = "efetuado") {
                            TelaSucessoScreen(navController)
                        }
                    }
                }
            }
        }
    }
}