package A08;

import java.util.Hashtable;

public class Player {
    private String name;
    private int totalFood = 0;
    private int gatheredFood = 0;
    private int stolenFood = 0;
    private String[] targets;
    private Hashtable<String, Integer> stolenFoodPerPlayer;

    public Player(int numberOfPlayers, String name){
        this.name = name;
        stolenFoodPerPlayer = new Hashtable<String, Integer>(numberOfPlayers);
    }

    public void setPlayers(String[] players){
        targets = players;
        for (String player : players) {
            stolenFoodPerPlayer.put(player, 0);
        }
    }

    public String getName(){
        return name;
    }

    public int getFood(){
        return totalFood;
    }

    private void updateFood(){
        totalFood = gatheredFood + stolenFood;
    }

    public void gatherFood(int amount){
        gatheredFood += amount;
        updateFood();
    }

    public void removeFood(int amount){
        gatheredFood -= amount;
        updateFood();
    }

    public String[] getStealTargets(){
        return targets;
    }

    public void stealFood(String name, int amount){
        stolenFood += amount;
        int newAmount = stolenFoodPerPlayer.get(name);
        stolenFoodPerPlayer.put(name, newAmount);
        updateFood();
    }

}
