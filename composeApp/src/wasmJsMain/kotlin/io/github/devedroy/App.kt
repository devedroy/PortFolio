package io.github.devedroy

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.resources.painterResource

import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Scaffold(
            topBar = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier.basicMarquee(),
                        text = "This website is build using Kotlin/Wasm"
                    )
                }
            },
            bottomBar = {
                Text(
                    text = "This is the bottombar",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        ) { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
            ) {
                Header()
                Button(onClick = { showContent = !showContent }) {
                    Text("Click me!")
                }
                AnimatedVisibility(showContent) {
                    val greeting = remember { Greeting().greet() }
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painterResource(Res.drawable.compose_multiplatform), null)
                        Text("Compose: $greeting")
                    }
                }
            }
        }
    }
}