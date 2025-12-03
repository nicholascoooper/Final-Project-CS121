import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game{

    private Player player;
    private ArrayList<Location> locations;
    private ArrayList<Event> events;
    private int day;
    private Scanner scanner;

    public Game(){
        player = new Player();
        locations = new ArrayList<>();
        events = new ArrayList<>();
        day = 1;
        scanner = new Scanner(System.in);

        locations.add(new Forest());
        locations.add(new River());

        events.add(new Event("Wild Animal Attack",
                "A small animal attacks you and runs off!",
                -2, 0));

        events.add(new Event("Rotten Food",
                "Something you ate earlier didn't sit well.",
                0, -2));
    }

    public void startGame(){
        System.out.println("You wake up on a deserted island");
        player.setCurrentLocation(locations.get(0));

        gameLoop();
    }

    private void gameLoop(){
        while (player.getHealth() > 0 && player.getHunger() > 0) {
            System.out.println("\n--- Day " + day + " ---");
            displayMenu();

            int choice = getInt();

            if (choice == 1){
                explore();
            } else if (choice == 2) {
                forage();
            } else if (choice == 3) {
                rest();
            } else if (choice == 4) {
                player.printStatus();
            } else if (choice == 5) {
                eat();
            } else if (choice == 6) {
                quitGame();
                return;
            } else {
                System.out.println("Invalid option.");
            }

            randomEventChance();
            day++;
        }

        System.out.println("You have perished. Game over.");
    }

    private void displayMenu(){
        System.out.println("What would you like to do?");
	System.out.println("1)Explore 2)Forage 3)Rest 4)Check Status 5)Eat 6)Quit");
    }

    private int getInt(){
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    private void explore(){
        Random rand = new Random();
        Location newLoc = locations.get(rand.nextInt(locations.size()));
        player.setCurrentLocation(newLoc);
        System.out.println("You explore and discover a " + newLoc.getName() + ".");
    }

    private void forage(){
        Location loc = player.getCurrentLocation();
        Item item = loc.forage();
        player.addItem(item);
        System.out.println("You found a " + item.getName() + " Added to inventory.");
        player.decreaseHunger(1);
    }

    private void rest(){
        player.heal(2);
        player.decreaseHunger(2);
        System.out.println("You rest and recover 2 hp but your hunger decreases.");
    }

    private void eat(){
        System.out.println("Inventory: ");
        player.getInventory().forEach(i -> System.out.println("- " + i.getName()));

        System.out.println("What would you like to eat?");
        scanner.nextLine(); 
        String food = scanner.nextLine();
        player.eat(food);
    }

    private void randomEventChance(){
        Random rand = new Random();
        if (rand.nextInt(100) < 25){
            Event e = events.get(rand.nextInt(events.size()));
            e.trigger(player);
        }
    }

    private void quitGame(){
        System.out.println("Thanks for playing");
    }
}
