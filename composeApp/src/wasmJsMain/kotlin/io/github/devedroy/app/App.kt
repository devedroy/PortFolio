package io.github.devedroy.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.devedroy.components.Tab
import io.github.devedroy.resources.Strings
import kotlinx.browser.window
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.background

@Composable
fun App() {
    MaterialTheme {
        Scaffold { innerPadding ->
            Box(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                contentAlignment = Alignment.TopStart
            ) {
                Image(
                    painter = painterResource(Res.drawable.background),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(20.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                    ) {
                        Strings.NAME.forEach { letter ->
                            Text(
                                text = letter.toString(),
                                fontFamily = FontFamily.Monospace,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 50.sp,
                                color = Color.White,
                                lineHeight = 60.sp
                            )
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Tab(data = Pair("read", "Medium"), onClick = {
                            window.open(Strings.MEDIUM, "_blank")
                        })
                        Tab(data = Pair("fork", "Github"), onClick = {
                            window.open(Strings.GITHUB, "_blank")
                        })
                        Tab(data = Pair("connect", "LinkedIn"), onClick = {
                            window.open(Strings.LINKEDIN, "_blank")
                        })
                        Tab(data = Pair("follow", "X"), onClick = {
                            window.open(Strings.X, "_blank")
                        })
                        Tab(data = Pair("contact", "GMail"), onClick = {
                            window.open(Strings.GMAIL, "_blank")
                        })
                    }
                }
            }
        }
    }
}