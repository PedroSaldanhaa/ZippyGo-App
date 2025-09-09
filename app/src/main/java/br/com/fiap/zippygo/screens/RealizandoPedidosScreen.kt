package br.com.fiap.zippygo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.zippygo.R
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController

@Composable
fun RealizandoPedidoScreen(
    navController: NavController,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {

    var cupom by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black_app))
            .padding(top = 32.dp)
    ) {
        Column(
          modifier = Modifier
              .fillMaxWidth()
              .verticalScroll(rememberScrollState()
              )
        ) {
            IconButton(
                onClick = {navController.navigate("mcdonalds")},
                modifier = Modifier
                    .size(60.dp)
                    .background(
                        color = colorResource(id = R.color.back_button),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Voltar",
                    tint = colorResource(id = R.color.green_button),
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))


            Row(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mcdonalds),
                    contentDescription = "Logo McDonalds",
                    modifier = Modifier.size(width = 40.dp, height = 30.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "McDonald's - Velha",
                    color = colorResource(id = R.color.white_letra2),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(80.dp))
                Text(
                    text = "Pedir mais",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.green_button),
                    modifier = Modifier.clickable {}
                )
            }
            Spacer(Modifier.height(40.dp))
            Column(
                modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
            ) {
                Text(
                    text = "Itens selecionados",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.green_button)
                )
                Spacer(Modifier.height(12.dp))
                Row(
                    modifier = Modifier
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    ItemEditavel(
                        imageRes = R.drawable.big,
                        onEditClick = {}
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Combo BigMac",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "1 uni",
                        color = colorResource(id = R.color.cinza_linha)
                    )
                    Spacer(modifier = Modifier.width(60.dp))
                    Text(
                        text = "R$ 38,90",
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.white_letra2)
                    )
                }
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    ItemEditavel(
                        imageRes = R.drawable.casquinha,
                        onEditClick = {}
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Casquinha baunilha",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "1 uni",
                        color = colorResource(id = R.color.cinza_linha)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "R$ 5,60",
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.white_letra2)
                    )

                }
                Spacer(Modifier.height(40.dp))
                Text(
                    text = "Endereço de entrega",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.green_button)
                )
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "R. Felix gieseler senior, n77 - bairro velha",
                        color = colorResource(id = R.color.cinza_linha),
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.width(50.dp))
                    Text(
                        text = "Trocar",
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.green_button),
                        modifier = Modifier.clickable {}
                    )
                }
                Spacer(Modifier.height(40.dp))
                Text(
                    text = "Formato de entrega",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.green_button)
                )
                Spacer(Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    DeliveryOptionCard(
                        title = "Zippy Drone",
                        price = "R$ 4,50",
                        imageRes = R.drawable.dron,
                        isSelected = selectedOption == "drone",
                        onClick = { onOptionSelected("drone") }
                    )
                    DeliveryOptionCard(
                        title = "Zippy Moto",
                        price = "R$ 9,00",
                        imageRes = R.drawable.moto,
                        isSelected = selectedOption == "moto",
                        onClick = { onOptionSelected("moto") }
                    )
                    DeliveryOptionCard(
                        title = "Zippy Car",
                        price = "R$ 12,00",
                        imageRes = R.drawable.carro,
                        isSelected = selectedOption == "car",
                        onClick = { onOptionSelected("car") }
                    )
                }
                Spacer(Modifier.height(40.dp))
                Text(
                    text = "Pagamento",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.green_button)
                )
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mastercard),
                        contentDescription = "Logo Mast",
                        modifier = Modifier
                            .size(width = 40.dp, height = 30.dp)
                            .clip(RoundedCornerShape(6.dp))
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "McDonald's - Velha",
                        color = colorResource(id = R.color.white_letra2),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.width(80.dp))
                    Text(
                        text = "Trocar",
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.green_button),
                        modifier = Modifier.clickable {}
                    )
                }
                Spacer(Modifier.height(14.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedTextField(
                        value = cupom,
                        onValueChange = {cupom = it},
                        modifier = Modifier
                            .width(200.dp)
                            .heightIn(48.dp),
                        shape = RoundedCornerShape(10.dp),
                        placeholder = {Text("Cupom", fontSize = 16.sp)},
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedPlaceholderColor = colorResource(R.color.cinza_linha),
                            focusedBorderColor = colorResource(id = R.color.green_button),
                            focusedTextColor = colorResource(id = R.color.white_letra2)
                        ),
                        textStyle = LocalTextStyle.current.copy(fontSize = 14.sp),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Spacer(Modifier.width(8.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(125.dp)
                            .height(35.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.green_button)
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = "Confirmar",
                            color = colorResource(id = R.color.black_button),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Spacer(Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Subtotal",
                    color = colorResource(id = R.color.subtotal_total_gray),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(200.dp))
                Text(
                    text = "R$ 44,50",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.subtotal_total_gray)
                )
            }
            Spacer(Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Taxa de entrega",
                    color = colorResource(id = R.color.subtotal_total_gray),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(143.dp))
                Text(
                    text = "R$ 4,50",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.subtotal_total_gray)
                )
            }
            Spacer(Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Taxa repassada à Natura&Co",
                    color = colorResource(id = R.color.subtotal_total_gray),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(44.dp))
                Text(
                    text = "R$ 4,50",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.subtotal_total_gray)
                )
            }
            Spacer(Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Total",
                    color = colorResource(id = R.color.white_letra2),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(224.dp))
                Text(
                    text = "R$ 49,49",
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.white_letra2)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = {navController.navigate("efetuado")},
                modifier = Modifier
                    .padding(start = 16.dp, end = 30.dp)
                    .fillMaxWidth()
                    .height(38.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.green_button)
                ),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(
                    text = "Realizar pedido",
                    color = colorResource(id = R.color.black_button),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Composable
fun ItemEditavel(
    imageRes: Int,
    onEditClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(60.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Item do pedido",
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(12.dp))
        )
        IconButton(
            onClick = onEditClick,
            modifier = Modifier
                .size(32.dp)
                .align(Alignment.TopEnd)
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Editar item",
                tint = colorResource(id = R.color.white_button),
                modifier = Modifier
                    .background(color = colorResource(id = R.color.black_button).copy(alpha = 0.7f), CircleShape) // fundo preto circular
                    .padding(4.dp)
            )
        }
    }
}
