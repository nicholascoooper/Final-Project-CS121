import java.util.ArrayList;
import java.util.Random;

public abstract class Location {
    protected String name;
    protected String description;
    protected ArrayList<Item> lootTable;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        lootTable = new ArrayList<>();
    }

    public String getName(){
	    return name;
    }
    public String getDescription(){
	    return description;
    }
    public ArrayList<Item> getLootTable(){
	    return lootTable;
    }

    public abstract Item forage();

    public void printLocationInfo(){
        System.out.println("You are at the " + name + ": " + description);
    }
}
