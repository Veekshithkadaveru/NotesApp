package com.example.notesapplication.feature_note.domain.util

sealed class OrderType {
    object Ascending:OrderType()
    object Descending:OrderType()
}