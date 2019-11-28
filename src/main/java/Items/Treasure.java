package Items;

public class Treasure {

    private String name;
    private int value;

    public Treasure(String name, int value){

        this.name = name;
        this.value = value;

    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }
}
