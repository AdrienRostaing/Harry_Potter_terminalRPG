package Game;

public class Spell {
    private String name;
    private int damage;
    private int accuracy;
    private int resistance;
    private String type;


    public void WingardiumLeviosa() {
        this.name = "Wingardium Leviosa";
        this.damage = 10;
        this.accuracy = 100;
        this.resistance = 0;
        this.type = "attack";
    }


    public void Expelliarmus() {
        this.name = "Expelliarmus";
        this.damage = 20;
        this.accuracy = 80;
        this.resistance = 0;
        this.type = "turnskip";
    }

    public void Protego() {
        this.name = "Protego";
        this.damage = 0;
        this.accuracy = 100;
        this.resistance = 50;
        this.type = "defense";
    }

    public void Stupefy() {
        this.name = "Stupefy";
        this.damage = 30;
        this.accuracy = 60;
        this.resistance = 0;
        this.type = "attack";
    }

    public void Sectumsempra() {
        this.name = "Sectumsempra";
        this.damage = 40;
        this.accuracy = 40;
        this.resistance = 0;
        this.type = "attack";
    }
}

