package com.example.assignmentweek4.ui.views.soal2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun tokopedia(){
    val  categoriesData = getAllCategories()
    val productsData = getAllProducts()
    Column(
        modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 15.dp),
        verticalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tokopedia", fontWeight = FontWeight.Bold, fontSize = 23.sp)
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "icon")
        }
        AsyncImage(
            model = "https://image.dummyjson.com/1100x350/008080/ffffff?text=Black+Friday",
            contentDescription = "poster",
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(
            text = "Categories",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(categoriesData) { item: Category ->
                categoryCard(category = item)
            }
        }
        Text(
            text = "Products",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(productsData) {product ->
                productCard(product)
            }


        }
    }

}


@Preview(showSystemUi = true, showBackground = true)
@Composable()
fun tokopediaView(){
    tokopedia()
}