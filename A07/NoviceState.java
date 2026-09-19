package A07;

public class NoviceState extends State {

    private int initialLevel;

    public NoviceState(Player player){
        super(player);
        initialLevel = this.getPlayer().getPlayerLevel();
    }

    public String getPlayerLevelName(){
        return "Novice";
    }

    public void action(){
        this.getPlayer().getPlayerStats();
        String[] options = {"Train"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train();
                break;
            }
        
        if (this.getPlayer().getPlayerHealthPoints() <= 0) {
            this.getPlayer().resetPlayer();
            this.getPlayer().setState(new NoviceState(this.getPlayer()));
        }
        if (initialLevel < this.getPlayer().getPlayerLevel()) {
            this.getPlayer().setState(new IntermediateState(this.getPlayer()));
        }
    }
    
}
