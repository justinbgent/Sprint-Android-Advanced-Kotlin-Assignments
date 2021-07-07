package com.schoolwork.advancedkotlin

sealed class MarineMammal(val name: String)

class Whale(name: String): MarineMammal(name)
class Dolphin(name: String): MarineMammal(name)
class Other(name: String): MarineMammal(name)