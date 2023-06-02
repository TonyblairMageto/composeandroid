package com.example.morningjetpackcomposeclass

import android.media.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf
import com.example.morningjetpackcomposeclass.ui.theme.MorningjetpackComposeclassTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()

            }

    }
}


@Composable
fun mycard(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

       Card(modifier = Modifier
           .background(color = Color.Gray)
           .padding(30.dp)


           ) {
           Text(text = "BullDog", fontStyle = FontStyle.Italic, fontSize = 30.sp, fontWeight = FontWeight.Bold)
           Image(painter = painterResource(id = R.drawable.bulldog), contentDescription = "bulldog",modifier= Modifier
               .size(width = 50.dp, height = 50.dp)
               .clip(shape = CircleShape))

       }
        Spacer(modifier = Modifier.height(30.dp))

        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(30.dp)


        ) {
            Text(text = "Pitbull", fontStyle = FontStyle.Italic, fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Image(painter = painterResource(id = R.drawable.pitbull), contentDescription = "bulldog",modifier= Modifier
                .size(width = 50.dp, height = 50.dp)
                .clip(shape = CircleShape))

        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(30.dp)


        ) {
            Text(text = "German Sherpherd", fontStyle = FontStyle.Italic, fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Image(painter = painterResource(id = R.drawable.ger), contentDescription = "dog",modifier= Modifier
                .size(width = 50.dp, height = 50.dp)
                .clip(shape = CircleShape))

        }
    }

}










@Preview(showBackground = true)
@Composable
fun mycardprev(){
    mycard()
}

