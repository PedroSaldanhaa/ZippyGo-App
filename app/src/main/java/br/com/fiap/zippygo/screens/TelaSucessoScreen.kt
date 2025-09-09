package br.com.fiap.zippygo.screens

import br.com.fiap.zippygo.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import androidx.navigation.NavController


@Composable
fun TelaSucessoScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 15.dp)
            .padding(top = 60.dp),
    ) {

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Voltar",
                tint = Color(0xFF89FF80),
                modifier = Modifier.align(Alignment.CenterStart)
            )

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo ZippyGO",
                modifier = Modifier
                    .width(180.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(50.dp))


        Text(
            text = "Seu pedido foi realizado com sucesso",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Acompanhar entrega",
            color = Color(0xFF89FF80),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(55.dp))


        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFF89FF80))) { append("•  ") }
                withStyle(style = SpanStyle(color = Color.White)) { append("Pedido aceito") }
            },
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(37.dp))
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFF89FF80))) { append("•  ") }
                withStyle(style = SpanStyle(color = Color.White)) { append("Preparando seu pedido") }
            },
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(37.dp))
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFF4D4D4D))) { append("•  ") }
                withStyle(style = SpanStyle(color = Color(0xFF4D4D4D))) { append("Sua entrega está em rota") }
            },
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(37.dp))

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFF4D4D4D))) { append("•  ") }
                withStyle(style = SpanStyle(color = Color(0xFF4D4D4D))) { append("Chegouu !") }
            },
            fontSize = 29.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(45.dp))


        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFFFFFFFF))) { append("Rastreio AO VIVO") }
                withStyle(style = SpanStyle(color = Color(0xFFFF0000))) { append("  •") }
            },
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 8.dp)
                .align(Alignment.Start)
        )

        MapboxTrackingMap()
    }
}


@Composable
fun MapboxTrackingMap() {
    AndroidView(
        factory = { context ->
            MapView(context).apply {
                getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(18.dp))

    )
}