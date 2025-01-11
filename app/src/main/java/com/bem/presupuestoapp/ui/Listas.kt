package com.bem.presupuestoapp.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListaScreen(){
    Lista()
}

@Composable
private fun Lista(){
    val elementos= listOf("1.Registrar ingresos","2.Retirada de capital","3.Plan de consumo mensual")
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(elementos){elemento->
            Text(
                text=elemento,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                color=androidx.compose.ui.graphics.Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 18.sp,
                    fontWeight = MaterialTheme.typography.headlineSmall.fontWeight
                )
            )
        }
    }
}

@Preview
@Composable
fun ListaPreview(){
    Lista()
}