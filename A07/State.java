package A07;

public abstract class State {
    private Player player;


    public State(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    abstract void action();

    abstract String getPlayerLevelName();
}
