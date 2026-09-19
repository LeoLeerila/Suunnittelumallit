package A08;

import java.util.Random;
import java.util.Scanner;

public class Dilemma extends Game {
    private static Scanner scanner = new Scanner(System.in);
    private final int winCondition = 20;
    private boolean gameOver = false;
    private Player[] players;
    
    public void initializeGame(int numberOfPlayers){
        if (numberOfPlayers < 2) {
            System.out.println("Dilemma needs at least 2 players");
            gameOver = true;
        }
        
        players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++){
            System.out.println("name of player " + (i+1));
            String name = scanner.next();
            players[i] = new Player(numberOfPlayers-1, name);
        }

        //give each player targets to steal food
        for (Player player : players) {
            String[] stealTargets = new String[numberOfPlayers-1];
            int stealTargetsIndex = 0;
            for(int i = 0; i < players.length; i++){
                if (player.getName() != players[i].getName()) {
                    stealTargets[stealTargetsIndex] = players[i].getName();
                    stealTargetsIndex++;
                }
            }
            player.setPlayers(stealTargets);
        }
    }

    public boolean endOfGame(){
        return gameOver;
    }

    public void playSingleTurn(int playerIndex){
        String[] options = {"Gather", "Steal"};
        int choise = readUserChoice(options, players[playerIndex].getName());
        switch (choise) {
            case 1:
                players[playerIndex].gatherFood(5);
                break;
            case 2:
                stealFood(playerIndex);
                break;
        }

        for (Player player : players) {
            if (player.getFood() >= winCondition) {
                gameOver = true;
            }
        }
    }

    public void displayWinner(){
        if (players.length < 2) {
            System.out.println("not enough players");
        } else {
            for (Player player : players) {
                System.out.println("Player " + player.getName() + " Food " + player.getFood());
            }
        }
    }

    private void stealFood(int playerIndex){
        int stealIndex = playerIndex;
        String[] options = new String[players.length];
        for(int i = 0; i < options.length; i++){
            options[i] = players[i].getName();
        }
        while (playerIndex == stealIndex) {
            stealIndex = readUserChoice(options, players[playerIndex].getName());
            stealIndex--;
        }

        Random r = new Random();
        int stealRoll = r.nextInt(21);
        int amount = 0;
        if (stealRoll < 2) {
            amount = 0;
        } else if (stealRoll < 10) {
            amount = 1;
        } else if (stealRoll < 15) {
            amount = 2;
        } else if (stealRoll < 18) {
            amount = 3;
        } else if (stealRoll < 20) {
            amount = 5;
        } else {
            amount = 10;
        }
        players[stealIndex].removeFood(amount);
        players[playerIndex].stealFood(players[stealIndex].getName(), amount);
    }

    private int readUserChoice(String[] options, String name) {
        // print options
        System.out.println("\nPlayer " + name);
        System.out.println("Select an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }

}
