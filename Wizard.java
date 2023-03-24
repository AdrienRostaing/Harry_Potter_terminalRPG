package Game;

public class Wizard extends Character {

    // integers to store number of upgrades/skills in each path
    public int numatkUpgrades, numdefUpgrades;

    //Arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale armor", "Holy Aura"};

    // wizard specific constructor
    public Wizard(String name){
        super(name, 100, 0);
        //Setting # of upgrades to 0
        this.numatkUpgrades = 0;
        this.numdefUpgrades = 0;
        //let player choose a trait when creating a new character
        choosetrait();

    }
    //Wizard specific methods
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
    //let the wizard choose a trait of their skill path
    public void choosetrait(){
        GameLogic.printHeading("Choose a House: ");
        System.out.println("(1)" + atkUpgrades[numatkUpgrades]);
        System.out.println("(2)" + defUpgrades[numdefUpgrades]);
        // get the player choice
        int input = GameLogic.readInt("->", 2);
        //deal with both cases
        if(input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numatkUpgrades] + "!");
            numatkUpgrades++;
        }else{
            GameLogic.printHeading("You chose " + defUpgrades[numdefUpgrades] + "!");
            numdefUpgrades++;
        }
        GameLogic.anythingToContinue();




    }
}
