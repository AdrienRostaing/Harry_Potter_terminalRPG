package Game;

public class Enemy extends Character {
    private int lifePoint;
    private int maxLifePoint;
    private String name;
    private int accuracy;
    private int damage;
    private int resistance;

    public Enemy(int lifePoint, int maxLifePoint, String name, int accuracy, int power, int efficiencyPotions, int resistance) {
        super(name,lifePoint, maxLifePoint,  accuracy, power, efficiencyPotions, resistance);
    }

    public void snake() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Snake";
        this.accuracy = 50;
        this.damage = 15;
        this.resistance = 0;
    }

    public void acromantula() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Acromantula";
        this.accuracy = 50;
        this.damage = 20;
        this.resistance = 0;
    }

    public void cerberus() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Cerberus";
        this.accuracy = 50;
        this.damage = 30;
        this.resistance = 0;
    }
    public void dementor() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Dementor";
        this.accuracy = 50;
        this.damage = 35;
        this.resistance = 0;
    }
    public void werewolf() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Werewolf";
        this.accuracy = 50;
        this.damage = 30;
        this.resistance = 0;
    }
    public void dragon() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Dragon";
        this.accuracy = 50;
        this.damage = 40;
        this.resistance = 0;
    }
    public void deathEater() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Death Eater";
        this.accuracy = 50;
        this.damage = 50;
        this.resistance = 0;
    }


    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
