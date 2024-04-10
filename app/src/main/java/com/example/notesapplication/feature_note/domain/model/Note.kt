package com.example.notesapplication.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notesapplication.ui.theme.BabyBlue
import com.example.notesapplication.ui.theme.DarkGray
import com.example.notesapplication.ui.theme.LightBlue
import com.example.notesapplication.ui.theme.LightGreen
import com.example.notesapplication.ui.theme.RedOrange
import com.example.notesapplication.ui.theme.RedPink
import com.example.notesapplication.ui.theme.Violet

@Entity
data class Note(
    val color: Int,
    val content: String,
    val title: String,
    val timestamp: Long,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            DarkGray,
            LightBlue,
            RedOrange,
            RedPink,
            BabyBlue,
            Violet,
            LightGreen
        )
    }
}