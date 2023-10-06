package com.example.assignmentweek4.ui.views.soal1

class LineChat(user: String, currentMessage:String, messageDate:String){
    val user = user
    val currentMessage = currentMessage
    val messageDate = messageDate
}
fun getAllLineChats(): List<LineChat> {
    return listOf(
        LineChat("Lebron James",  "Practice starts in 10, where are you?", "4/10/2023"),
        LineChat("Kobe Bryant", "Hey, how's it going?", "3/10/2023"),
        LineChat("Michael Jordan", "I heard you had a great game last night!", "2/10/2023"),
        LineChat("Stephen Curry",  "Let's grab dinner tonight.", "1/10/2023"),
        LineChat("Kevin Durant", "Can you pass me the ball more often?", "30/9/2023"),
        LineChat("Magic Johnson", "We need to work on our defense.", "30/9/2023"),
        LineChat("Larry Bird",  "I'll be late for practice tomorrow.", "28/9/2023"),
        LineChat("Tim Duncan",  "I'm excited about the upcoming game.", "25/9/2023"),
        LineChat("Shaquille O'Neal",  "I need new sneakers.", "21/9/2023"),
        LineChat("Charles Barkley", "Let's hit the gym early.", "18/9/2023"),
        LineChat("Magic Johnson", "We need to work on our defense.", "30/9/2023"),
        LineChat("Larry Bird",  "I'll be late for practice tomorrow.", "28/9/2023"),
        LineChat("Tim Duncan",  "I'm excited about the upcoming game.", "25/9/2023"),
        LineChat("Shaquille O'Neal",  "I need new sneakers.", "21/9/2023"),
        LineChat("Charles Barkley", "Let's hit the gym early.", "18/9/2023")

    )


}

