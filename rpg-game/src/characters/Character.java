package characters;

import java.util.HashMap;

public abstract class Character {
    protected String name;
    protected int level;
    protected int mana;
    protected int damage;
    protected int defence;
    protected int hit_points;

    public Character(String name, int level, int mana, int damage, int defence, int hit_points){
        this.name = name;
        this.level = level;
        this.mana = mana;
        this.damage = damage;
        this.defence = defence;
        this.hit_points = hit_points;

    }

    public abstract void attack();
    public abstract void defend();
    public abstract void useAbility();

    public boolean isAlive(){
        return hit_points > 0;
    }

    public void takeDamage(int damageAmount){
        this.hit_points -= damageAmount;
    }

    public void heal(int healAmount){
        this.hit_points += healAmount;
    }

    public void levelUp(){}

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getMana(){
        return mana;
    }

    public int getDamage(){
        return damage;
    }

    public int getDefence(){
        return defence;
    }

    public int getHit_points(){
        return hit_points;
    }
}
