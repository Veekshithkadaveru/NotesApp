package com.example.notesapplication.feature_note.data.repository

import com.example.notesapplication.feature_note.data.data_source.NoteDao
import com.example.notesapplication.feature_note.domain.model.Note
import com.example.notesapplication.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow


class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()

    }

    override fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id = id)

    }

    override fun insertNote(note: Note) {
        noteDao.insertNote(note)

    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note)

    }
}