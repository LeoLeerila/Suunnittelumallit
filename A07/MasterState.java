package A07;

public class MasterState extends State {

    private int initialLevel;

    public MasterState(Player player){
        super(player);
        initialLevel = this.getPlayer().getPlayerLevel();
    }

    public String getPlayerLevelName(){
        return "Master";
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
            System.out.println("You are a master, there is nothing more to learn.");
        }
    }
    
}
