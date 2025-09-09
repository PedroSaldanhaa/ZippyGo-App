package br.com.fiap.zippygo.screens

import androidx.compose.foundation.Image
import br.com.fiap.zippygo.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LogoScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.black_app))
        .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.zippy_go_logo),
            contentDescription = "Logo principal",
            modifier = Modifier
                .size(250.dp)
        )
    }
}

@Preview
@Composable
private fun LogoScreenPreview() {
    LogoScreen()
}