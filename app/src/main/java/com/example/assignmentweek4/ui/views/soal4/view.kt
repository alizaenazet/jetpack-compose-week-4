package com.example.assignmentweek4.ui.views.soal4

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun photosGrid(){
    val imagesUrl = arrayOfNulls<String>(10)
    Box(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()){
        LazyColumn(
            modifier = Modifier
                .padding(bottom = 40.dp)
        ){
            item {
                TextFieldWithIcons()
            }
            itemsIndexed(imagesUrl){index, item ->
                photoRow(index = index)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.Black)
                .padding(10.dp),
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Icon(imageVector = Icons.Filled.Home,
                    modifier = Modifier
                        .size(35.dp),
                    contentDescription = "icon",
                    tint = Color.White)
                Icon(imageVector = Icons.Filled.Search,
                    modifier = Modifier
                        .size(35.dp),
                    contentDescription = "icon",
                    tint = Color.White)
                Icon(imageVector = Icons.Filled.AddCircle,
                    modifier = Modifier
                        .size(35.dp),
                    contentDescription = "icon",
                    tint = Color.White)
                Icon(imageVector = Icons.Filled.PlayArrow,
                    modifier = Modifier
                        .size(35.dp),
                    contentDescription = "icon",
                    tint = Color.White)
                Icon(imageVector = Icons.Filled.Person,
                    modifier = Modifier
                        .size(35.dp),
                    contentDescription = "icon",
                    tint = Color.White)
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun photoGridPreview(){
    photosGrid()
}