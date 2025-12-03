public class Event{
    private String name;
    private String description;
    private int healthChange;
    private int hungerChange;

    public Event(String name, String description, int healthChange, int hungerChange){
        this.name = name;
        this.description = description;
        this.healthChange = healthChange;
        this.hungerChange = hungerChange;
    }

    public String getName(){
	    return name;
    }

    public String getDescription(){
	    return description;
    }

    public int healthEffect(){
	    return healthChange;
    }

    public int hungerEffect(){
	    return hungerChange;
    }

    public void trigger(Player player){
        System.out.println("Event: " + name);
        System.out.println(description);

        player.takeDamage(Math.abs(healthChange));
        player.decreaseHunger(Math.abs(hungerChange));
    }
}
