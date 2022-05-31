package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun MessageCard(msg: Message){
    Row{
        Image(painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Profile picture"
            )
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    Greeting("Android")
}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(Message(author = "Cristóbal", body = "I'm learning Compose!"))
}