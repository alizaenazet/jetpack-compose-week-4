package com.example.assignmentweek4.ui.views.soal1

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.platform.LocalContext


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun chatPage(){
    val chatsData = getAllLineChats()
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 12.dp, vertical = 6.dp),
        verticalArrangement = Arrangement.spacedBy(19.dp),

    ){
        stickyHeader {
            TopBar()
        }
        items(chatsData){chatRow ->
            ChatRow(user = chatRow.user, message = chatRow.currentMessage, date = chatRow.messageDate, context = context)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, )
@Composable
fun chatPagePreview(){
    chatPage()
}