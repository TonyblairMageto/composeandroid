package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Textfieldactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          form()
        }
    }
}






@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
    Column(modifier = Modifier.fillMaxSize()){


         Text(text = "personal Details", fontSize = 40.sp, color = Color.Black, fontStyle = FontStyle.Italic)
         var text by remember { mutableStateOf("") }
         TextField(
             value = text ,
             onValueChange ={ text=it},
             label = { Text(text = "Firstname")},
             placeholder = { Text(text = "Enter firstname")},
             modifier = Modifier
                 .padding(20.dp)
                 .background(color = Color.Gray) ,
             textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
             leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription ="icon" ) },
             trailingIcon = { androidx.compose.material3.Icon(
                 imageVector = Icons.Default.Check,
                 contentDescription = "icon"
             )},
             keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
         )

//MIDNAME
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname ,
            onValueChange ={ mname=it},
            label = { Text(text = "Middlename")},
            placeholder = { Text(text = "Enter Middlename")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray) ,
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Face, contentDescription ="icon" ) },
            trailingIcon = { androidx.compose.material3.Icon(
                imageVector = Icons.Default.Check,
                contentDescription ="icon"
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
//lastname
        var lname by remember { mutableStateOf("") }
        TextField(
            value = lname ,
            onValueChange ={ lname=it},
            label = { Text(text = "Lastname")},
            placeholder = { Text(text = "Enter Lastname")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray) ,
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription ="icon" ) },
            trailingIcon = { androidx.compose.material3.Icon(
                imageVector = Icons.Default.Check,
                contentDescription ="icon"
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
//email
        var email by remember { mutableStateOf("") }
        TextField(
            value = email ,
            onValueChange ={ email=it},
            label = { Text(text = "Email")},
            placeholder = { Text(text = "Enter Email")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray) ,
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Email, contentDescription = "icon") },
            trailingIcon = { androidx.compose.material3.Icon(
                imageVector = Icons.Default.Check,
                contentDescription ="icon"
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
//password
        var pass by remember { mutableStateOf("") }
        TextField(
            value = pass ,
            onValueChange ={ pass=it},
            label = { Text(text = "Password")},
            placeholder = { Text(text = "Enter Password")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray) ,
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription = "icon") },
            trailingIcon = { androidx.compose.material3.Icon(
                imageVector = Icons.Default.Check,
                contentDescription ="icon"
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
//contact
        )
        var phone by remember { mutableStateOf("") }
        TextField(
            value = phone ,
            onValueChange ={ phone=it},
            label = { Text(text = "Contact")},
            placeholder = { Text(text = "Enter Contact")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray) ,
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {androidx.compose.material3.Icon(imageVector = Icons.Default.Phone, contentDescription ="icon" ) },
            trailingIcon = { androidx.compose.material3.Icon(
                imageVector = Icons.Default.Check,
                contentDescription ="icon"
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
    }

}




@Preview(showBackground = true)
@Composable
fun formpreview(){
    form()
}
