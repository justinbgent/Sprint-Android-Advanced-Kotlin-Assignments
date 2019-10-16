package com.schoolwork.andvancedkotproj

sealed class Song(var song: String)

class DrumAndBase(song: String): Song(song)
class EDM(song: String): Song(song)
class Dubstep(song: String): Song(song)

object Lists{
    var edm = mutableListOf<Song>(
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere"),
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere"),
        EDM("Sad Machine"),
        EDM("Room for Happiness"),
        EDM("Angel On My Shoulder"),
        EDM("4AM"),
        EDM("Atmosphere")
    )

    var drumAndBase = mutableListOf<Song>(
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day"),
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day"),
        DrumAndBase("Freefall"),
        DrumAndBase("Legacy"),
        DrumAndBase("Tearing Me Apart"),
        DrumAndBase("Just A Thought"),
        DrumAndBase("Night & Day")
    )

    var dubstep = mutableListOf<Song>(
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool"),
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool"),
        Dubstep("Finale"),
        Dubstep("Flight"),
        Dubstep("Frame of Mind"),
        Dubstep("Hey Now"),
        Dubstep("It's Cool")
    )
}