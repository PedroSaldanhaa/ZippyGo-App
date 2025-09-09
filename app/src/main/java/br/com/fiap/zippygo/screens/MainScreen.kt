package br.com.fiap.zippygo.screens

import androidx.compose.foundation.Image
import br.com.fiap.zippygo.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


data class Categoria(
    val nome: String,
    val icon: Int
)

@Composable
fun MainScreen(navController: NavController) {

    val categorias = listOf(
        Categoria("Orgânicos", R.drawable.organicos),
        Categoria("Mercados", R.drawable.mercado),
        Categoria("Farmácias", R.drawable.farmacia),
        Categoria("Almoço", R.drawable.almoco),
        Categoria("Lanches", R.drawable.lanches),
        Categoria("Massas", R.drawable.massas),
        Categoria("Doces", R.drawable.doces),
        Categoria("Sorvetes", R.drawable.sorvetes),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black_app))
            .padding(top = 32.dp)
    ){
        Column {
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier
                    .height(60.dp)
                    .width(180.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(id = R.color.green_button),
                        shape = RoundedCornerShape(15.dp),
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Column {
                        Text(
                            text = "Cliente",
                            color = colorResource(id = R.color.white_letra2),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "R.Felix gieseler senior",
                            color = colorResource(id = R.color.cinza_linha)
                        )
                    }
                }
                Image(
                    painter = painterResource(R.drawable.zippy_go_logo),
                    contentDescription = "Imagem logo",
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(40.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Eai, vai de que hoje?",
                color = colorResource(id = R.color.white_letra2),
                fontSize = 28.sp,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            LazyHorizontalGrid(
                rows = GridCells.Fixed(2), // 2 colunas ,
                modifier = Modifier
                    .height(220.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(categorias) { categoria ->
                    CategoriaCard(categoria)
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Recente",
                    color = colorResource(id = R.color.white_letra2)
                )
                Text(
                    text = "Ver mais",
                    color = colorResource(id = R.color.green_button)
                )
            }
            Row(
                modifier = Modifier.padding(start = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.mcdonalds),
                    contentDescription = "Logo do McDonalds",
                    modifier = Modifier
                        .size(height = 100.dp, width = 100.dp)
                        .clickable{navController.navigate("mcdonalds")})
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burgerking),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center) // coloca no centro
                            .size(120.dp) // ajusta o tamanho
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.outback),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center) // coloca no centro
                            .size(120.dp) // ajusta o tamanho
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burger),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "Entrega",
                    color = colorResource(id = R.color.white_letra2)
                )
                Text(
                    text = "Zippy Flash",
                    color = colorResource(id = R.color.green_button)
                )
            }
            Row(
                modifier = Modifier.padding(start = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burgerking),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.outback),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Image(painter = painterResource(id = R.drawable.mcdonalds),
                    contentDescription = "Logo do McDonalds",
                    modifier = Modifier
                        .size(height = 100.dp, width = 100.dp)
                        .clickable{navController.navigate("mcdonalds")},)
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burger),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
            }
            Row(
                modifier = Modifier.padding(start = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burgerking),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.outback),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Image(painter = painterResource(id = R.drawable.mcdonalds),
                    contentDescription = "Logo do McDonalds",
                    modifier = Modifier
                        .size(height = 100.dp, width = 100.dp)
                        .clickable{navController.navigate("mcdonalds")})
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(height = 75.dp, width = 85.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.burger),
                        contentDescription = "Imagem sobreposta",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(120.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CategoriaCard(categoria: Categoria) {
    Column(
        modifier = Modifier
            .background(Color(0xFF1C1C1E), RoundedCornerShape(16.dp)) // fundo escuro com bordas arredondadas
            .padding(12.dp)
            .height(20.dp)
            .wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = categoria.icon),
            contentDescription = categoria.nome,
            modifier = Modifier
                .size(64.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = categoria.nome,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}