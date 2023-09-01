package com.example.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun CanvasTest() {
    var points by rememberSaveable {
        mutableStateOf<List<Point>>(listOf())
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .pointerInput(key1 = Unit) {
                detectDragGestures(
                    onDragStart = {
                        points = points + Point(offset = it, isStartedPosition = true)
                    },
                    onDrag = { change, _ ->
                        points = points + change.historical.map {
                            Point(offset = it.position, isStartedPosition = false)
                        }
                    }
                )
            }
    ) {
        val path = Path()
        points.forEach {
            if (it.isStartedPosition) {
                path.moveTo(it.offset.x, it.offset.y)
            } else {
                path.lineTo(it.offset.x, it.offset.y)
            }
        }
        drawPath(
            path = path,
            brush = Brush.linearGradient(listOf(Color.Cyan, Color.Magenta, Color.Red)),
            style = Stroke(width = 10.dp.toPx())
        )
    }
}

data class Point(
    val offset: Offset,
    val isStartedPosition: Boolean
)

@Composable
fun Dp.toPx() = with(LocalDensity.current) {
    this@toPx.toPx()
}

@Composable
fun convertDpToPx(dp: Dp): Float {
    return LocalDensity.current.density * dp.value
}
