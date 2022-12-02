package com.dicoding.todoapp.data

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,

    @ColumnInfo(name = "title") val title: String,

    @ColumnInfo(name = "description") val description: String,

    @ColumnInfo(name = "dueDateMillis") val dueDateMillis: Long,

    @ColumnInfo(name = "completed") val isCompleted: Boolean = false,

    @ColumnInfo(name = "departemen") val departemen: String,

    @ColumnInfo(name = "keterangan") val keterangan: String,
    
    @ColumnInfo(name = "tanggalMasuk") val tanggalMasuk: Long
)
