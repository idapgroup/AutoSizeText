package com.idapgroup.autosizetext

import androidx.compose.ui.unit.TextUnit

internal const val SIZE_DECREASER = 0.9f

internal enum class SizeDecreasingStage(val value: Float) {
    Offense(0.5f),
    Defence(1.2f),
    Diplomacy(0.95f),
    Peace(Float.NaN);
}

internal fun SizeDecreasingStage?.next(didOverflowHeight: Boolean) :SizeDecreasingStage {
    return when {
        this == null -> SizeDecreasingStage.Offense
        this == SizeDecreasingStage.Offense && didOverflowHeight -> SizeDecreasingStage.Offense
        this == SizeDecreasingStage.Offense -> SizeDecreasingStage.Defence
        this == SizeDecreasingStage.Defence && didOverflowHeight.not() -> SizeDecreasingStage.Defence
        this == SizeDecreasingStage.Defence -> SizeDecreasingStage.Diplomacy
        this == SizeDecreasingStage.Diplomacy && didOverflowHeight -> SizeDecreasingStage.Diplomacy
        else -> SizeDecreasingStage.Peace
    }
}

internal data class InnerMetrics(
    val fontSize: TextUnit,
    val lineHeight: TextUnit,
)

internal fun coerceTextUnit(
    expected: TextUnit,
    default: TextUnit
) = if (expected != TextUnit.Unspecified) expected else default