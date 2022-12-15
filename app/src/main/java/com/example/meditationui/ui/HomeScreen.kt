package com.example.meditationui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.meditationui.ui.theme.DeepBlue

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            
        }
    }
}

@Composable
fun GreetingSection(
    name:String ="bobo wg"
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        
    }
}