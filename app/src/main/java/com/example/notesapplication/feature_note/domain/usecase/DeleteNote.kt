package com.example.notesapplication.feature_note.domain.usecase

import com.example.notesapplication.feature_note.domain.model.Note
import com.example.notesapplication.feature_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    operator fun invoke(note: Note){
        repository.deleteNote(note)
    }

}