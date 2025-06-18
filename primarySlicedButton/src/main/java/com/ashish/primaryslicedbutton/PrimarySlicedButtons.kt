package com.ashish.primaryslicedbutton



import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by Ashish Kr on 18,June,2025
 */
@Composable
fun PrimaryGreenButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val shape = CutCornerShape(bottomEnd = 14.dp)

    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF00C853),
            contentColor = Color.Black
        ),
        shape = shape,
//        elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 8.dp,
            pressedElevation = 12.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = text)
    }
}