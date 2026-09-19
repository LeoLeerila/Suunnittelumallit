package A07;

import java.util.Scanner;

public class Player {
    private static Scanner scanner = new Scanner(System.in);
    private State state;

    private String name;
    private int level = 1;
    private int experiencePoints = 0;
    private int experiencePointsToLevel = 5;
    private int healthPoints = 5;

    public Player(){
        state = new NoviceState(this);
    }

    public void play() {
        System.out.println("What is your name?\n");
        this.name = scanner.next();
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Machine out of order");
                return;
            }
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void resetPlayer(){
        this.level = 1;
        this.experiencePoints = 0;
        this.experiencePointsToLevel = 5;
        this.healthPoints = 5;
    }

    public void getPlayerStats(){
        System.out.println(state.getPlayerLevelName() + " " + name);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + experiencePoints + "/" + experiencePointsToLevel);
        System.out.println("Health: " + healthPoints);
    }

    public int getPlayerLevel(){
        return this.level;
    }

    public int getPlayerHealthPoints(){
        return this.healthPoints;
    }

    public void increaseLevel(){
        this.level++;
        this.experiencePointsToLevel = (int) (this.experiencePointsToLevel * 1.5);
    }

    public void updateHealthPoints(int change){
        this.healthPoints += change;
    }

    public void updateExperiencePoints(int change){
        this.experiencePoints += change;
        if (this.experiencePoints >= this.experiencePointsToLevel) {
            increaseLevel();
        }
    }

    public void train(){
        updateExperiencePoints(1);
    }

    public void meditate(){
        updateHealthPoints(1);
    }

    public void fight(){
        updateHealthPoints(-1);
        updateExperiencePoints(3);
    }

    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }
}
