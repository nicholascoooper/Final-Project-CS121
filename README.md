Survival Game
Nicholas Cooper
CS121

###Purpose
This project is intended to demonstrate mastery of concepts learned in CS121, specifically Java Object-Oriented programming, use of abstract data types, and use of data structures.

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
        +getHealth(): int
        +getHunger(): int
        +getInventory(): ArrayList<Item>
        +getCurrentLocation(): Location
        +setCurrentLocation(): void
        +heal(): void
        +takeDamage(): void
        +increaseHunger(): void
        +decreaseHunger(): void
        +addItem(): void
        +removeItem(): void
        +eat(): void
        +printStatus(): void
        
    }

    class Item{
        -name: String
        -type: String
        -value: int
        +getName(): String
        +getType(): String
        +getValue(): int
        +toString(): String
    }

    class Location{
        -name: String
        -description: String
        -lootTable: ArrayList<Item>
        +getName(): String
        +getDescription(): String
        +getLootTable(): ArrayList<Item>
        +forage(): void
        +printLocationInfo(): void
    }

    class Event{
        -name: String
        -descritption: String
        -healthChange: int
        -hungerChange: int
        +getName(): String
        +getDescription(): String
        +healthEffect(): int
        +hungerEffect(): int
        +trigger(): void
    }

    class Game{
        -player Player
        -locations: ArrayList<Location>
        -events: ArrayList<Event>
        -day: int
        -gameLoop(): void
        -printDayInfo(): void
        -displayMenu(): void
        -explore(): void
        -forage(): void
        -rest(): void
        -checkStatus(): void
        -randomEventChance(): void
        -quitGame(): void
        +startGame(): void
    }

```

#Player
=============



============


    
