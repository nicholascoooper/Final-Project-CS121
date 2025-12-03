import java.util.Random;

public class Forest extends Location{

    public Forest(){
        super("Forest", "A deep forest full of berries and small critters.");
        lootTable.add(new Item("Berry", "food", 2));
        lootTable.add(new Item("Mushroom", "food", 3));
        lootTable.add(new Item("Stick", "tool", 0));
    }

    
    public Item forage(){
        Random rand = new Random();
        return lootTable.get(rand.nextInt(lootTable.size()));
    }
}
