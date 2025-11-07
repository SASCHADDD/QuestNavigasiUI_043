package com.example.pertemuan6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: navHostController = remembernavController()
){
    Scaffold {isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier
                .padding(isiRuang)
        )
    }
}