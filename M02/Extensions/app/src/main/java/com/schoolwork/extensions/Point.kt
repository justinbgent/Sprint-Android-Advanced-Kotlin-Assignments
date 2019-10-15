package com.schoolwork.extensions

data class Point(var x: Double, var y: Double) {
    operator fun plus(p: Point) = Point(x + p.x, y + p.y)
    operator fun minus(p: Point) = Point(x - p.x, y - p.y)
    operator fun times(p: Point) = Point(x * p.x, y * p.y)
    operator fun div(p: Point) = Point(x / p.x, y / p.y)
    operator fun inc()/* = Point(x + 1, y + 1)*/: Point{
        x++
        y++
        return Point(x+1, y+1)
    }
    operator fun dec() = Point(x - 1, y - 1)
    //TODO OO4: Overload Equals
    override fun equals(other: Any?): Boolean {
        if (other == null ||
            other !is Point ||
            x != other.x || y != other.y
        ) return false
        return true
    }
    //TODO OO5: Overload compareTO
    operator fun compareTo(other: Point): Int = when {
        y != other.y -> (y - other.y).toInt()
        else -> (x - other.x).toInt()
    }
}
