package br.com.fiap.zippygo.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import br.com.fiap.zippygo.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun McDonaldsScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black_app))
    ) {
        Image(
            painter = painterResource(id = R.drawable.restaurante),
            contentDescription = "Imagem de restaurante",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Column(
            modifier = Modifier
            .fillMaxWidth()
            .padding(start = 18.dp, end = 18.dp, top = 32.dp)
        ) {
            IconButton(
                onClick = {navController.navigate("principal")},
                modifier = Modifier
                    .size(60.dp)
                    .background(
                        color = colorResource(R.color.back_button),
                        shape = RoundedCornerShape(8.dp))
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Voltar",
                    tint = colorResource(id = R.color.green_button),
                    modifier = Modifier.size(32.dp)
                )
            }
            Card(
                modifier = Modifier
                    .height(160.dp)
                    .offset(y = 65.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.card_black),

                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mcdonalds),
                                contentDescription = "Logo do Mcdonalds",
                                modifier = Modifier.size(100.dp)
                            )
                            Spacer(modifier = Modifier.width(15.dp))
                            Column {
                                Text(
                                    text = "McDonalds - Velha",
                                    color = colorResource(id = R.color.white_letra2),
                                    fontSize = 23.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.stars),
                                        contentDescription = "estrelas",
                                        modifier = Modifier.size(height = 30.dp, width = 60.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "3,8",
                                        color = colorResource(id = R.color.white_letra2),
                                        fontSize = 12.sp
                                    )
                                    Spacer(modifier = Modifier.width(58.dp))
                                    Box(
                                        modifier = Modifier
                                            .size(width = 50.dp, height = 18.dp)
                                            .clip(RoundedCornerShape(7.dp))
                                            .background(colorResource(id = R.color.green_button)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "Aberto",
                                            color = colorResource(id = R.color.black_button),
                                            fontSize = 12.sp
                                        )
                                    }
                                }
                            }
                        }
                        Row {
                            Text(
                                text = "Endereço:",
                                color = colorResource(id = R.color.green_button),
                                fontSize = 13.sp
                            )
                            Text(
                                text = "R. 7 de Setembro, 2713 - Velha, Blumenau - SC",
                                color = colorResource(id = R.color.white_letra2),
                                fontSize = 13.sp
                            )
                        }
                        Row {
                            Text(
                                text = "Entrega a partir de",
                                color = colorResource(id = R.color.white_letra2),
                                fontSize = 12.sp
                            )
                            Text(
                                text = "R$ 4.50",
                                color = colorResource(id = R.color.green_button),
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.width(85.dp))
                            Text(
                                text = "Aberto até as",
                                color = colorResource(id = R.color.white_letra2),
                                fontSize = 12.sp
                            )
                            Text(
                                text = "23:00",
                                color = colorResource(id = R.color.green_button),
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.height(88.dp))
            Text(
                text = "Destaques",
                color = colorResource(id = R.color.green_button),
                fontSize = 18.sp
            )
            Spacer(Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ProductCard(
                    imageRes = R.drawable.big,
                    price = "R$ 38,90",
                    title = "McOfertas – Combo BigMac",
                    onClick = {navController.navigate("pagamento")}
                )

                ProductCard(
                    imageRes = R.drawable.mctasty,
                    price = "R$ 32,90",
                    title = "Média Tasty Turbo 2 Carnes",
                    onClick = {navController.navigate("pagamento")}
                )

                ProductCard(
                    imageRes = R.drawable.mccrispy,
                    price = "R$ 15,90",
                    title = "McCrispy Chicken Bacon Ranch",
                    onClick = {}
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ProductCard(
                    imageRes = R.drawable.fritas,
                    price = "R$ 19,50",
                    title = "McFritas Grande Individual",
                    onClick = {navController.navigate("pagamento")}
                )

                ProductCard(
                    imageRes = R.drawable.nuggets,
                    price = "R$ 17,50",
                    title = "McNuggets - 6 unidades + Barbecue",
                    onClick = {navController.navigate("pagamento")}
                )

                ProductCard(
                    imageRes = R.drawable.refri,
                    price = "R$ 10,90",
                    title = "Refrigerante Grande - Coca Cola",
                    onClick = {navController.navigate("pagamento")}
                )
            }
        }

        }
    }







@Composable
fun ProductCard(
    imageRes: Int,
    price: String,
    title: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .clickable { onClick() }
        ,
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = title,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "A partir de",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )

            Text(
                text = price,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center
            )
        }
    }
}