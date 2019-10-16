package com.schoolwork.andvancedkotproj

sealed class Song(var song: String)

class DrumAndBase(song: String): Song(song)
class EDM(song: String): Song(song)
class Dubstep(song: String): Song(song)