package com.example.setupmanager.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "vehicles")
data class Vehicle (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var name: String
)

@Entity(tableName = "tracks")
data class Track (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var name: String
)

@Entity(tableName = "layouts", foreignKeys = [
    ForeignKey(entity = Track::class, parentColumns = ["id"], childColumns = ["id"], onDelete = ForeignKey.CASCADE)
])
data class TrackLayout (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val trackId: Int,
    var name: String
)

@Entity(tableName = "setups", foreignKeys = [
    ForeignKey(entity = Vehicle::class, parentColumns = ["id"], childColumns = ["carId"], onDelete = ForeignKey.CASCADE),
    ForeignKey(entity = Track::class, parentColumns = ["id"], childColumns = ["trackId"], onDelete = ForeignKey.CASCADE),
    ForeignKey(entity = TrackLayout::class, parentColumns = ["id"], childColumns = ["layoutId"], onDelete = ForeignKey.CASCADE)
])
data class Setups (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val carId: Int,
    val trackId: Int,
    val layoutId: Int,
    var name: String
)