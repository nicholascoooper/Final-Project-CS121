Main.class: Main.java Game.class Player.class Location.class Forest.class River.class Item.class Event.class
	javac -g Main.java

Game.class: Game.java Player.class Location.class Forest.class River.class Item.class Event.class
	javac -g Game.java

Player.class: Player.java Item.class Location.class
	javac -g Player.java

Location.class: Location.java Item.class
	javac -g Location.java

Forest.class: Forest.java Location.class Item.class
	javac -g Forest.java

River.class: River.java Location.class Item.class
	javac -g River.java

Item.class: Item.java
	javac -g Item.java

Event.class: Event.java Player.class
	javac -g Event.java

run: Main.class
	java Main

clean:
	rm -f *.class
