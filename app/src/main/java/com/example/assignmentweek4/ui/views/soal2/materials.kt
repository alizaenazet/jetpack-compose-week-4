package com.example.assignmentweek4.ui.views.soal2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage


@Composable
fun categoryCard(category: Category){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .size(width = 120.dp, height = 160.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            AsyncImage(model = category.ImageUrl, contentDescription = "image")
            Text(text = category.name, fontWeight = FontWeight.Bold)
            Text(text = "${category.itemNumber} Products ", fontSize = 12.sp)

        }
    }
}

@Composable
fun productCard(product: Product){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 200.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            AsyncImage(model = product.imageUrl, contentDescription = "img")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(top = 10.dp),
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Text(text = product.name, fontWeight = FontWeight.Bold)
                Text(text = "Rp. ${product.price}", fontSize = 12.sp)
                Text(text = "Kota ${product.location}", fontSize = 12.sp)
                Text(text = "${product.sold} Sold", fontSize = 12.sp)

            }
        }
    }
}