package com.sandeep.canvasinjetpackcompose

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

sealed interface DrawingAction {
    data object OnNewPathStart : DrawingAction
    data class OnDraw(val offset: Offset) : DrawingAction
    data object OnPathEnd : DrawingAction
    data class OnSelectColor(val color: Color) : DrawingAction
    data object OnClearCanvasClick : DrawingAction
}