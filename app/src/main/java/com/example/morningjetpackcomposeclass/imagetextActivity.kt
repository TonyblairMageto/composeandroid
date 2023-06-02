package com.example.morningjetpackcomposeclass

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningjetpackComposeclassTheme

class imagetextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           cartoon()
        }
    }
}

@Composable
fun cartoon() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car1), contentDescription = "cartoon")
            Column() {
                Text(text = "This is me")
                Text(text = "Cartoon")
                Text(text = "You")
            }
        }

        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car2), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(4.dp))
            Column() {
                Text(text = "Animated series")
                Text(text = "Cartoon network")
                Text(text = "You")
            }


        }
        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car3), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(5.dp))
            Column() {
                Text(text = "Animated series cartoons")
                Text(text = "Cartoon network")
                Text(text = "You")
            }
        }
        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car4), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(5.dp))
            Column() {
                Text(text = "Animated series cartoons")
                Text(text = "Cartoon network")
                Text(text = "You")
            }
        }

        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car5), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(5.dp))
            Column() {
                Text(text = "Animated series cartoons")
                Text(text = "Cartoon network")
                Text(text = "You")
            }
        }
        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car6), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(5.dp))
            Column() {
                Text(text = "Animated series cartoons")
                Text(text = "Cartoon network")
                Text(text = "You")
            }
        }
        Row(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
            Image(painter = painterResource(id = R.drawable.car7), contentDescription = "cartoon")
            Spacer(modifier = Modifier.height(5.dp))
            Column() {
                Text(text = "Animated series cartoons")
                Text(text = "Cartoon network")
                Text(text = "You")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun carprev(){
    cartoon()
}
