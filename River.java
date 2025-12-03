import java.util.Random;

public class River extends Location{

    public River(){
        super("River", "A flowing river with fresh water and fish.");
        lootTable.add(new Item("Fresh Water", "drink", 3));
        lootTable.add(new Item("Small Fish", "food", 4));
        lootTable.add(new Item("Pebble", "misc", 0));
    }

    
    public Item forage(){
        Random rand = new Random();
        return lootTable.get(rand.nextInt(lootTable.size()));
    }
}
