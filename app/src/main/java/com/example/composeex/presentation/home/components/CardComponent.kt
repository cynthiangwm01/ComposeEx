package com.example.composeex.presentation.home.components

import android.view.MenuItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeex.R
import com.example.composeex.domain.model.HomeMenu
import com.example.composeex.presentation.Routes
import com.example.composeex.presentation.ui.theme.cardDistance
import com.example.composeex.presentation.ui.theme.cardHeight
import com.example.composeex.presentation.ui.theme.standardFontSize
import com.example.composeex.presentation.ui.theme.standardPagePadding

@ExperimentalMaterialApi
@Composable
fun CardComponent(homeMenuItem: HomeMenu, navigateTo: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(cardDistance)
            .height(cardHeight)
            .background(Color.Yellow)
            .fillMaxWidth(),
        elevation = 8.dp,
        onClick = navigateTo
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                maxLines = 1,
                text = homeMenuItem.title,
                fontSize = standardFontSize,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(standardPagePadding)
            )
            Image(
                modifier = Modifier.padding(standardPagePadding)
                    .width(80.dp)
                    .height(80.dp),
                painter = painterResource(id = R.drawable.ic_android),
                contentDescription = homeMenuItem.title
            )
        }

    }
}