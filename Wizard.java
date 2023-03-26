package Game;

public class Wizard extends Character {


    public String[] knownSpells;

    String pet;

    private static String name;

    String wand;

    private String house;


    public String[] potions;

    // integers to store number of upgrades/skills in each path
    public int numatkUpgrades, numdefUpgrades;

    //Arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale armor", "Holy Aura"};

    // wizard specific constructor
    public Wizard(String name, String pet, Wand wand, SortingHat house, String[] knownSpells, String[] potions){
        super(name,100, 100,  100, 100, 100,100 );
        this.pet = GameLogic.pet;
        this.wand = Wand.getWand();
        this.house = String.valueOf(SortingHat.house);
        this.knownSpells = AbstractSpell.spells;
        this.potions = Potion.potions;

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

