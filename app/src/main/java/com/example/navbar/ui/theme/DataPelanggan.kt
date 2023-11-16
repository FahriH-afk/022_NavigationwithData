package com.example.navbar.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataPelanggan(
    onSubmitButtonClicked : (MutableList<String>) -> Unit,
    onCancelButtonClicked : () -> Unit
) {
    var nama by remember { mutableStateOf(value = "") }
    var noTelepon by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var listData: MutableList<String> = mutableListOf(nama,noTelepon,alamat)

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()) {
        Text(text = "Data Pelanggan",
            textAlign = TextAlign.Center,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value =  nama,
            onValueChange = {nama = it},
            label = { Text(text = "Nama")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp))
    }

}