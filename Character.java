package Game;

public abstract class Character {

    public static String name;
    private int lifePoint;
    private final int maxLifePoint;


    private int accuracy;

    private int damage;

    private int efficiencyPotions;

    private int resistance;


    public Character(String name,int lifePoint, int maxLifePoint,  int accuracy, int damage, int efficiencyPotions, int resistance) {
        this.lifePoint = lifePoint;
        this.maxLifePoint = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.efficiencyPotions = efficiencyPotions;
        this.resistance = resistance;
    }



    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getMaxLifePoint() {
        return maxLifePoint;
    }

    public String getName() {
        return name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPower() {
        return damage;
    }

    public void setPower(int power) {
        this.damage = power;
    }

    public int getEfficiencyPotions() {
        return efficiencyPotions;
    }

    public void setEfficiencyPotions(int efficiencyPotions) {
        this.efficiencyPotions = efficiencyPotions;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void attack(Character character){

    }
    public void attack(AbstractEnemy enemy){

    }

    //Enemy specific attack and defence calculations
    public abstract int attack();

    public abstract int defend();
}
