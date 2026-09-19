package A07;

public class IntermediateState extends State {

    private int initialLevel;

    public IntermediateState(Player player){
        super(player);
        initialLevel = this.getPlayer().getPlayerLevel();
    }

    public String getPlayerLevelName(){
        return "Intermediate";
    }
    
    public void action(){
        this.getPlayer().getPlayerStats();
        String[] options = {"Train", "Meditate"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train();
                break;
            case 2:
                this.getPlayer().meditate();
                break;
            }
        
        if (this.getPlayer().getPlayerHealthPoints() <= 0) {
            this.getPlayer().resetPlayer();
            this.getPlayer().setState(new NoviceState(this.getPlayer()));
        }
        if (initialLevel < this.getPlayer().getPlayerLevel()) {
            this.getPlayer().setState(new ExpertState(this.getPlayer()));
        }
    }
}
