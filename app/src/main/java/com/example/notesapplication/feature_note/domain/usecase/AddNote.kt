package com.example.notesapplication.feature_note.domain.usecase

import com.example.notesapplication.feature_note.domain.model.Note
import com.example.notesapplication.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository)
{
  //  @Throws(InvalidNoteException::class)
    operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            //throw InvalidNoteException
        println("the title of the note can't be empty")
        }
        if (note.content.isBlank()){
            println("the content of the note can't be empty")
        }
        repository.insertNote(note)
    }

}