package io.github.devedroy.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Tab(
    data: Pair<String, String>,
    onClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(3.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = data.first,
            color = Color.White,
        )
        Text(
            text = data.second,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable { onClick.invoke() }
        )
    }
}