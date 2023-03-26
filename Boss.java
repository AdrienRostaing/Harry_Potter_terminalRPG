package Game;

public class Boss {
    private int lifePoint;
    private int maxLifePoint;
    private String name;
    private int accuracy;
    private int damage;
    private int resistance;

    public Boss(int lifePoint, int maxLifePoint, String name, int accuracy, int damage, int resistance) {
        this.lifePoint = lifePoint;
        this.maxLifePoint = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
    }
    public void Troll() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Troll";
        this.accuracy = 50;
        this.damage = 20;
        this.resistance = 0;
    }
    public void Voldemort() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Voldemort";
        this.accuracy = 50;
        this.damage = 90;
        this.resistance = 0;
    }
    public void Bellatrix() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Bellatrix";
        this.accuracy = 50;
        this.damage = 70;
        this.resistance = 0;
    }
    public void Dementor() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Dementor";
        this.accuracy = 50;
        this.damage = 40;
        this.resistance = 0;
    }
    public void Basilisk() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Basilisk";
        this.accuracy = 50;
        this.damage = 30;
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
    public void PeterPettigrew() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Peter Pettigrew";
        this.accuracy = 50;
        this.damage = 25;
        this.resistance = 0;
    }
    public void doloresUmbridge() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Dolores Umbridge";
        this.accuracy = 50;
        this.damage = 40;
        this.resistance = 0;
    }
    public void voldemortweak() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "VoldeMort";
        this.accuracy = 50;
        this.damage = 30;
        this.resistance = 0;
    }

}
