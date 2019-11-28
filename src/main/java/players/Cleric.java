package players;


public class Cleric extends Player {

    private int healingPotion;

    public Cleric(String name, int health, int healingPotion){

        super(name, health);
        this.healingPotion = healingPotion;

    }


    public int getHealingPotion(){
        return this.healingPotion;
    }


    public int healOtherPlayer(Player player){
        return player.getHealth() + healingPotion;
    }

    public void changeHealingTool(int newHealingTool){
        this.healingPotion = newHealingTool;
    }
}
