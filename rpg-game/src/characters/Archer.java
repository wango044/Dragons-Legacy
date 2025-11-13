package characters;

public class Archer extends Character {
    public Archer(String name){
        super(name, 1 , 10, 30, 25, 100);
    }

    @Override
    public void attack(){};

    @Override
    public void defend(){};

    @Override
    public void useAbility(){};
}
