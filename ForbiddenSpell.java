package Game;

public class ForbiddenSpell {
    private String name;
    private int damage;
    private int accuracy;
    private int resistance;
    private String type;

    public void AvadaKevedra() {
        this.name = "Avada Kedavra";
        this.damage = 100;
        this.accuracy = 70;
        this.resistance = 0;
        this.type = "attack";
    }

    public void Crucio() {
        this.name = "Crucio";
        this.damage = 50;
        this.accuracy = 100;
        this.resistance = 0;
        this.type = "attack";
    }

    public void Imperio() {
        this.name = "Imperio";
        this.damage = 30;
        this.accuracy = 100;
        this.resistance = 0;
        this.type = "attack";
    }


}