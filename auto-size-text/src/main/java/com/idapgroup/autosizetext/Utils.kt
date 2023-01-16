package com.idapgroup.autosizetext

import androidx.compose.ui.unit.TextUnit

internal const val SIZE_DECREASER = 0.9f

internal data class InnerMetrics(
    val fontSize: TextUnit,
    val lineHeight: TextUnit,
)

internal fun coerceTextUnit(
    expected: TextUnit,
    default: TextUnit
) = if (expected != TextUnit.Unspecified) expected else default