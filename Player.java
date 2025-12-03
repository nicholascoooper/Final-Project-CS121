import java.util.ArrayList;

public class Player{
    private int hp;
    private int hunger;
    private ArrayList<Item> inventory;
    private Location currentLocation;

    public Player(){
        hp = 10;
        hunger = 10;
        inventory = new ArrayList<>();
    }

    public void setCurrentLocation(Location loc){
        this.currentLocation = loc;
    }

    public Location getCurrentLocation(){
        return currentLocation;
    }

    public int getHealth(){
	    return hp;
    }

    public int getHunger(){
	    return hunger;
    }

    public ArrayList<Item> getInventory(){
	    return inventory;
    }

    public void heal(int amount){
        hp = Math.min(10, hp + amount);
    }

    public void takeDamage(int amount){
        hp -= amount;
        if (hp < 0) hp = 0;
    }

    public void increaseHunger(int amount){
        hunger = Math.min(10, hunger + amount);
    }

    public void decreaseHunger(int amount){
        hunger -= amount;
        if (hunger < 0) hunger = 0;
    }

    public void addItem(Item item){
        inventory.add(item);
    }

    public void removeItem(Item item){
        inventory.remove(item);
    }

    public void eat(String name) {
        for (Item i : inventory) {
            if (i.getName().equalsIgnoreCase(name) &&
               (i.getType().equals("food") || i.getType().equals("drink"))){

                increaseHunger(i.getValue());
                System.out.println("You consumed " + i.getName() + ". Hunger increased by " + i.getValue());
                removeItem(i);
                return;
            }
        }
        System.out.println("You don't have that item or it cannot be eaten.");
    }

    public void printStatus(){
        System.out.println("HP: " + hp + "/10");
        System.out.println("Hunger: " + hunger + "/10");
        System.out.println("Location: " + (currentLocation != null ? currentLocation.getName() : "None"));
        System.out.print("Inventory: ");
        if (inventory.isEmpty()) System.out.println("Empty");
        else inventory.forEach(i -> System.out.print(i.getName() + " "));
        System.out.println();
    }
}
