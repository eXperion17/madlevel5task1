package com.example.madlevel5task1.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.madlevel5task1.database.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_table LIMIT 1")
    fun getNotepad(): LiveData<Note>

    @Update
    suspend fun updateNote(note: Note)

    @Insert
    suspend fun insertNote(note: Note)

}

