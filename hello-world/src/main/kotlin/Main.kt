package org.example

import org.example.greeting.People
import org.example.greeting.Team
import org.example.greeting.Universe
import org.example.greeting.World

val greetingReceivers = listOf(
    World(),
    People(),
    Team(),
    Universe()
)

fun main() {
    val nameToBeGreeted = greetingReceivers.random().name
    println("Hello $nameToBeGreeted!")
    // asdf

    asdf
}
