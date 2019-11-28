package rooms;


import Items.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Treasure> treasures;

    public Room(){
        this.treasures = new ArrayList<Treasure>();
    }

    public int startsEmpty(){
        return this.treasures.size();
    }

    public void addTreasure(Treasure treasure){
         this.treasures.add(treasure);
    }
}
