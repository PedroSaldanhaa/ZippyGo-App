package br.com.fiap.zippygo.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CreateAccountScreen(navController: NavController) {

    var nomecompleto by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.mato_fundo),
            contentDescription = "Background de imagem de mato",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.4f))
        ) {}
        Card(
            modifier = Modifier
                .height(900.dp)
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 25.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding( horizontal = 20.dp, vertical = 31.dp)
            ) {
                Text(
                    text = "Criar Conta",
                    color = colorResource(id = R.color.white_letra2),
                    fontSize = 28.sp
                )
                Spacer(modifier = Modifier.height(22.dp))
                Column {
                    Text(
                        text = "Nome Completo",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = nomecompleto,
                        onValueChange = {nomecompleto = it},
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedTextColor = colorResource(id = R.color.white_letra2),
                            focusedBorderColor = colorResource(id = R.color.black_textfield),
                            unfocusedBorderColor = colorResource(id = R.color.black_textfield)
                        ),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        shape = RoundedCornerShape(5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Column {
                    Text(
                        text = "Email",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = email,
                        onValueChange = {email = it},
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedTextColor = colorResource(id = R.color.white_letra2),
                            focusedBorderColor = colorResource(id = R.color.black_textfield),
                            unfocusedBorderColor = colorResource(id = R.color.black_textfield)
                        ),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        shape = RoundedCornerShape(5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Column {
                    Text(
                        text = "Senha",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = password,
                        onValueChange = {password = it},
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedContainerColor = colorResource(id = R.color.black_textfield),
                            focusedTextColor = colorResource(id = R.color.white_letra2),
                            focusedBorderColor = colorResource(id = R.color.black_textfield),
                            unfocusedBorderColor = colorResource(id = R.color.black_textfield),
                            unfocusedTextColor = colorResource(id = R.color.white_letra2)
                        ),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        shape = RoundedCornerShape(5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.green_button)
                    ),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Criar conta",
                        color = colorResource(id = R.color.black_button),
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(28.dp))
                Text(
                    text = "Problemas ao acessar?",
                    color = colorResource(id = R.color.white_letra2),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(28.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.white_button)
                    ),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Continuar login com Google",
                        color = colorResource(id = R.color.black_button)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.white_button)
                    ),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Continuar login com Facebook",
                        color = colorResource(id = R.color.black_button)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.white_button)
                    ),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Continuar login com Apple",
                        color = colorResource(id = R.color.black_button)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    HorizontalDivider(
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp),
                        color = colorResource(id = R.color.cinza_linha)
                    )
                    Text(
                        text = "Ou",
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.cinza_linha),
                        modifier = Modifier.padding(horizontal = 8.dp) // espaço entre as linhas
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .weight(1f)
                            .height(5.dp),
                        color = colorResource(id = R.color.cinza_linha)
                    )
                }
                Button(
                    onClick = {navController.navigate("login")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.white_letra)
                    ),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Entrar",
                        color = colorResource(id = R.color.black_button),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}