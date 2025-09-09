package br.com.fiap.zippygo.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import br.com.fiap.zippygo.R
import androidx.compose.foundation.background
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun EnterScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.black_app))
        ) {
        Column {
            Spacer(modifier = Modifier.height(180.dp))
            Image(
                painter = painterResource(id = R.drawable.drone),
                contentDescription = "Imagem de drone",
                modifier = Modifier.size(380.dp)
            )
            Column(
                modifier = Modifier.padding(32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.zippy_go_logo),
                    contentDescription = "Zippy GO logo",
                    modifier = Modifier
                        .width(200.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Suas encomendas agora estão no ar",
                    color = colorResource(id = R.color.white_letra2),
                    fontSize = 25.sp
                )
                Spacer(modifier = Modifier.height(60.dp))
                Row {
                    Button(
                        onClick = { navController.navigate("login")},
                        modifier = Modifier
                            .width(160.dp)
                            .height(38.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.green_button)
                        ),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Text(
                            text = "Entrar",
                            color = colorResource(id = R.color.black_button),
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    OutlinedButton(
                        onClick = {navController.navigate("criar")},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(38.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.black_app)
                        ),
                        border = BorderStroke(2.dp, colorResource(id = R.color.green_button)),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Text(
                            text = "Criar Conta",
                            color = colorResource(id = R.color.green_button),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

