package com.ashish.androidlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.androidlibrary.ui.theme.AndroidLibraryTheme
import com.ashish.primaryslicedbutton.PrimaryGreenButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidLibraryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
    PrimaryGreenButton(text = "Click Me", onClick = {})
//    PrimaryGreenButton()

}

//@Composable
//fun PrimaryGreenButton(
//    text: String,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    val shape = CutCornerShape(bottomEnd = 14.dp)
//
//    Button(
//        onClick = onClick,
//        modifier = modifier,
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color(0xFF00C853),
//            contentColor = Color.Black
//        ),
//        shape = shape,
////        elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
//        elevation = ButtonDefaults.buttonElevation(
//            defaultElevation = 8.dp,
//            pressedElevation = 12.dp,
//            disabledElevation = 0.dp
//        )
//    ) {
//        Text(text = text)
//    }
//}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidLibraryTheme {
        Greeting("Android")
    }
}