package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningjetpackComposeclassTheme
import com.example.morningjetpackcomposeclass.ui.theme.listActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}

@Composable
fun text() {

    var mContext = LocalContext.current

    Column(modifier =Modifier.fillMaxSize()) {
        Text(
            text = "Welcome to Android",
            color = Color.Green,
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .padding(30.dp),
        )


        Button(onClick = {
            mContext.startActivity(Intent(mContext,listActivity::class.java))
        },
        shape = RectangleShape) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "icon")
        Text(text = "List")    
            
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,Textfieldactivity::class.java))
        },
        shape=  RectangleShape) {
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "icons")    
        Text(text = "Text Field")    
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,cardasign::class.java))
        },
        shape = RectangleShape) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription ="asign")
        Text(text = "Leaves")    

        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext, imagetextActivity::class.java))
        }, shape = RectangleShape) {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "IMAGE")
            Text(text = "Cartoons")

        }
    }
    
}




@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()
}


