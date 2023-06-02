package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningjetpackComposeclassTheme

class cardasign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           leave()

        }
    }
}

@Composable
fun leave() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Card(
            modifier = Modifier
                .background(color = Color.White)
                .padding(30.dp)


        ) {
            Text(
                text = "leave",
                fontStyle = FontStyle.Italic,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.liv1),
                contentDescription = "leave",
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
                    .clip(shape = RectangleShape)
            )

        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(
            modifier = Modifier
                .background(color = Color.White)
                .padding(30.dp)


        ) {
            Text(
                text = "leave",
                fontStyle = FontStyle.Italic,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.liv2),
                contentDescription = "leave",
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .clip(shape = RectangleShape)
            )


        }
        Card(
            modifier = Modifier
                .background(color = Color.White)
                .padding(30.dp)


        ) {
            Text(
                text = "leave",
                fontStyle = FontStyle.Italic,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.liv3),
                contentDescription = "leave",
                modifier = Modifier
                    .size(width = 200.dp, height = 300.dp)
                    .clip(shape = RectangleShape)
            )

        }
    }
}
@Preview(showBackground = true)
@Composable
fun leaveprev() {
        leave()
}



