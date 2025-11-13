package characters;

public class Warrior extends Character {
    public Warrior(String name){
        super(name, 1 , 10, 25, 50, 100);
    }

    @Override
    public void attack(){};

    @Override
    public void defend(){};

    @Override
    public void useAbility(){};
}
