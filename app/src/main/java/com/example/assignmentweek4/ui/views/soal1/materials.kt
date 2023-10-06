package com.example.assignmentweek4.ui.views.soal1

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun ChatRow(user:String, message:String, date:String, context: Context = LocalContext.current){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                Toast
                    .makeText(context, "$user Clicked", Toast.LENGTH_SHORT)
                    .show()
            },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Row (
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ){
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "account img",
                modifier = Modifier
                    .size(55.dp),
                tint = Color.White
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
            ) {
                Text(text = user,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
                Text(text = message,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White,

                    )
            }
        }

        Text(text = date,
            color = Color.White)
    }
}

@Composable
fun TopBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = "Chats",
            fontWeight = FontWeight.SemiBold,
            color = Color.White)
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "more vert icon",
                tint = Color.White)
    }
}