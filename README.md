Survival Game
Nicholas Cooper
CS121

###Purpose
This project is intended to demonstrate mastery of concepts learned in CSCI 121, specifically Object-Oriented programming, use of abstract data types, and use of data structures.

###Overview
This survival game demonstrates java concepts such as classes, inheritance, encapsulation, and abstraction. Using
classes to streamline the process and create an easier process allows for better code. The goal of managing the
health, stamina, hunger, and thirst is percefectly suited for this style of programming

###classes
 


```mermaid

classDiagram
    
    class Player{
        -hp: int
        -hunger: int
`       -inventory: ArrayList<Item>
        -currentLoctaion: Location
        +takeDamage(): void
        +increaseHunger(): void
    }

    class Item{
        -name: String
        -type: String
        -value: int
    }

    class Location{
        -name: String
        -description: String
        -lootTable: ArrayList<Item>
    }

    class Event{
        -name: String
        -descritption: String
        -healthChange: int
        -hungerChange: int
    }

    class Game{
        -player Player
        -locations: ArrayList<Location>
        -events: ArrayList<Event>
    }

```

#Player
=============
int hp = 10
int stamina = 10
int woodCount = 0
int meatCount = 0

Player(){
}

#HasMenu
interface
============
string menu(){
}
void start(){
}

    
