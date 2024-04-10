package com.example.notesapplication.feature_note.domain.usecase

import com.example.notesapplication.feature_note.domain.model.Note
import com.example.notesapplication.feature_note.domain.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    operator fun invoke(id:Int):Note?{
      return  repository.getNoteById(id)
    }

}