package Game;

import java.util.ArrayList;
import java.util.Arrays;

public class Potion {
    private static String name;
    private int lifePoint;
    private int accuracy;
    private int damage;
    private int resistance;
    private int price;
    private String type;
    static String[] potions = {};

    public void PotionOfLife() {
        this.name = "Potion of Life";
        this.lifePoint = 50;
        this.accuracy = 0;
        this.damage = 0;
        this.resistance = 0;
        this.price = 50;
        this.type = "heal";
    }

    public void PotionOfAccuracy() {
        this.name = "Potion of Accuracy";
        this.lifePoint = 0;
        this.accuracy = 50;
        this.damage = 0;
        this.resistance = 0;
        this.price = 50;
        this.type = "buff";
    }

    public void PotionOfPower() {
        this.name = "Potion of Power";
        this.lifePoint = 0;
        this.accuracy = 0;
        this.damage = 50;
        this.resistance = 0;
        this.price = 50;
        this.type = "buff";
    }

    public void PotionOfResistance() {
        this.name = "Potion of Resistance";
        this.lifePoint = 0;
        this.accuracy = 0;
        this.damage = 0;
        this.resistance = 50;
        this.price = 50;
        this.type = "buff";
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public int getResistance() {
        return resistance;
    }

    public String getType() {
        return type;
    }
    public static void potions(){
        System.out.println("You have learnt a new potion:");
        ArrayList<String> arrlistObj =
                new ArrayList<String>(Arrays.asList(name));

        // Add new element to the ArrayList
        arrlistObj.add("Polyjuice Potion");
        // Convert the ArrayList to Array
        potions = arrlistObj.toArray(new String[]{name});
    }
}
