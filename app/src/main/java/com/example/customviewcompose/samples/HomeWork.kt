package com.example.customviewcompose.samples

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.oleg() {
    // О
    drawCircle(
        color = Color.White,
        radius = 25.dp.toPx(),
        center = Offset(50.dp.toPx(), 50.dp.toPx()),
        style = Stroke(width = 2.dp.toPx())
    )

    // Л
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(85.dp.toPx(), 75.dp.toPx()),
        end = Offset(110.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(110.dp.toPx(), 25.dp.toPx()),
        end = Offset(135.dp.toPx(), 75.dp.toPx())
    )

    //Е
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 25.dp.toPx()),
        end = Offset(145.dp.toPx(), 75.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 25.dp.toPx()),
        end = Offset(175.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 50.dp.toPx()),
        end = Offset(175.dp.toPx(), 50.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 75.dp.toPx()),
        end = Offset(175.dp.toPx(), 75.dp.toPx())
    )
    //Г
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(190.dp.toPx(), 25.dp.toPx()),
        end = Offset(225.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(190.dp.toPx(), 25.dp.toPx()),
        end = Offset(190.dp.toPx(), 75.dp.toPx())
    )
}
