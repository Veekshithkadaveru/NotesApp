package com.example.notesapplication.feature_note.domain.repository

import com.example.notesapplication.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNotes(): Flow<List<Note>>
    fun getNoteById(id: Int): Note?
    fun insertNote(note: Note)
    fun deleteNote(note: Note)
}