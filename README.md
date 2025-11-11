```mermaid

classDiagram
    
    class Player{
        -hp: int
        -stamina: int
        -woodCount: int
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

    class CampFire(){
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

    
