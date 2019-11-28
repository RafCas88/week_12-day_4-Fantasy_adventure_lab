package players;

import java.util.ArrayList;

public abstract class  Player {

    private String name;
    private int health;
    private ArrayList<Treasure> treasures;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        treasures = new ArrayList<Treasure>();
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getNumberOfTreasure(){
      return this.treasures.size();
    }

    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }
}
