package com.example.assignmentweek4.ui.views.soal4

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kotlinx.coroutines.flow.callbackFlow

@Composable
fun photoRow(index: Int){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        if (index % 2 === 0){
            AsyncImage(model = "https://image.dummyjson.com/700", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
            AsyncImage(model = "https://image.dummyjson.com/700/282828", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
            AsyncImage(model = "https://image.dummyjson.com/700", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
        }else{
            AsyncImage(model = "https://image.dummyjson.com/700/282828", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
            AsyncImage(model = "https://image.dummyjson.com/700", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
            AsyncImage(model = "https://image.dummyjson.com/700/282828", modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
                contentDescription = "dummmy image")
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldWithIcons(){
    TextField(
        value = "",
        label = { Text(text = "Search") },
        leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "icon",) },
        onValueChange = {},
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 5.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(30.dp))
            .border(2.dp, Color.Gray, shape = RoundedCornerShape(30.dp))
        )
}