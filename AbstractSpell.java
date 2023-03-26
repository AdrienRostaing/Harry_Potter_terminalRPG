package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractSpell {
    static Wizard wizard;
    private static String name;
    private int damage;
    private int accuracy;
    private int resistance;
    private String type;
    static String[] spells = {};

    public AbstractSpell(String name, int damage, int accuracy, int resistance, String type) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.resistance = resistance;
        this.type = type;
    }
    public static void learnSpell(String name){
        System.out.println("You have learnt a new spell: "+ name);
        ArrayList<String> arrlistObj =
                new ArrayList<String>(Arrays.asList(spells));

        // Add new element to the ArrayList
        arrlistObj.add(name);
        // Convert the ArrayList to Array
        spells = arrlistObj.toArray(spells);
    }

    public static String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getResistance() {
        return resistance;
    }

}
