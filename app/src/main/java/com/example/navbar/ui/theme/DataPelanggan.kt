package com.example.navbar.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DataPelanggan(
    onSubmitButtonClicked : (MutableList<String>) -> Unit,
    onCancelButtonClicked : () -> Unit
) {
    var nama by remember { mutableStateOf(value = "") }
    var noTelepon by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var listData: MutableList<String> = mutableListOf(nama,noTelepon,alamat)

}