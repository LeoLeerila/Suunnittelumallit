package A07;

public class ExpertState extends State {

    private int initialLevel;

    public ExpertState(Player player){
        super(player);
        initialLevel = this.getPlayer().getPlayerLevel();
    }

    public String getPlayerLevelName(){
        return "Expert";
    }
    
    public void action(){
        this.getPlayer().getPlayerStats();
        String[] options = {"Train", "Meditate", "Fight"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train();
                break;
            case 2:
                this.getPlayer().meditate();
                break;
            case 3:
                this.getPlayer().fight();
                break;
            }
        
        if (this.getPlayer().getPlayerHealthPoints() <= 0) {
            this.getPlayer().resetPlayer();
            this.getPlayer().setState(new NoviceState(this.getPlayer()));
        }
        if (initialLevel < this.getPlayer().getPlayerLevel()) {
            this.getPlayer().setState(new MasterState(this.getPlayer()));
        }
    }
    
}
