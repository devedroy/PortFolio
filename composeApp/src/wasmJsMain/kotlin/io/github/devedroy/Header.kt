package io.github.devedroy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.pass_pic

@Composable
fun Header(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(vertical = 50.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ){
        Image(
            painter = painterResource(Res.drawable.pass_pic),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Devpreyo Roy",
            style = TextStyle(
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(600),
                fontSize = 50.sp
            ),
            modifier = Modifier.padding(top = 24.dp, bottom = 12.dp)
        )
        Text(
            text = "Kotlin Developer",
            style = TextStyle(
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(600),
                fontSize = 30.sp
            ),
            modifier = Modifier.padding(bottom = 24.dp)
        )
    }
}