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
        -stamina: int
`        -woodCount: int
        -meatCount: int
        +Player()
    }

    class HasMenu{
        <<interface>>
        +menu(): String
        +start() void
    }

    class Tree{
        -hp: int
        +getWood(): String
    }

    class Animal{
        -hp: int
        +defeat(): String
    }

    class Forest{
        +menu(): void
        +start(): void
        +main(): void
        +findWood(): String
        +findAnimal(): String
    }

    class CampFire{
        -hp: int
        +menu(): void
        +start(): void
        +main(): void
        +addWood(): String
        +cookFood() String
    }

HasMenu <.. Forest
HasMenu <.. Campfire

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

    
