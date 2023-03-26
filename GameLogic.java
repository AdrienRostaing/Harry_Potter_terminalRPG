package Game;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    public static String pet;
    public static String name;

    static Scanner scanner = new Scanner(System.in);
    static Wizard wizard;

    //story elements
    public static int place = 0, act =1;
    public static String[] places = {"Dungeon bathrooms", "Chamber of secrets", "Lake in forbidden forrest",
            "Little Hangleton cemetery","Exam room Hogwarts", "Astronomy tower", "Hogwarts"};
    public static int boss = 0;
    public static String newspell;

    //random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Professor", "Rest", "Battle"};
    //enemy names
    public static String[] enemyNames = {"Dementor", "Basilisk", "Acromantula", "Death Eater", "Voldemort", "Dementor", "Basilisk", "Acromantula", "Death Eater", "Voldemort"};
    public static boolean isRunning;



    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter integer!");
            }

        } while (input < 1 || input > userChoices);
        return input;

    }
    public static void textDelay(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            delay(0);
        }
        System.out.println("");
    }

    public static void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // method to simulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }

    // method to print a separator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();

    }

    // method to print a heading
    public static void printHeading(String title) {
        printSeperator(1);
        System.out.println(title);
        printSeperator(1);

    }

    //method to stop the game until user enters anything
    public static void promptEnterKey(){
        System.out.println("Appuyez sur Entrée pour continuer...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void removeElement(Object[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }



    public static void name() {
        boolean nameSet;
        nameSet = false;
        do {
            name = scanner.next();
            // verifying if correct name
            printHeading("Your name is " + name + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input = readInt("->", 2);
            if (input == 1)
                nameSet = true;
        }while (!nameSet);
    }







    public static void petinialise(){
        boolean petSet;
        petSet = false;
        do {
            for(int i = 0; i < Pet.PETS.length; i++)
                System.out.println("("+(i+1)+")"+Pet.PETS[i]);
            int input = readInt("->", 4);
            if (input == 1)
                petSet = true;
            else if (input == 2)
                petSet = true;
            else if (input == 3)
                petSet = true;
            else if (input == 4)
                petSet = true;
            else
                System.out.println("Invalid input");
            pet =  Pet.PETS[input - 1];
            System.out.println("You have chosen " + pet + " as your pet. Please give him a name.");
            String petName;
            petName= scanner.next();
            System.out.println("You have named your pet " + petName + ".");
        } while (!petSet);

    }



    //Method to start the game
    public static void startGame() {




        Story.printIntro();

        //setting is Runnning  to true, so the game loop
        isRunning = true;

        //start main game loop can continue
        printMenu();
        gameLoop();

    }

    //method that changes the game if you beat the boss
    public static void checkAct(){
        //change acts based on boss fight
        if(boss == 0)
            encounters = new String[]{"Battle", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus"};
            Story.printFirstActIntro();
            promptEnterKey();
            Story.printFirstActOutro();
        if(boss == 1)
            newspell = "Expelliarmus";
            encounters = new String[]{"Battle", "Battle", "Professor", "Rest", "Battle"};

            act = 2;
        if(boss == 2)
            act = 3;
        if(boss == 3)
            act = 4;
        if(boss == 4)
            act = 5;
        if(boss == 5)
            act = 6;
        if(boss == 6)
            act = 7;
        else if(boss == 7)
            //Story.printEnd();
            isRunning = false;
    }


    //method to calculate random encounters
    public static void randomEncounter(){
        //random encounter
        Random random = new Random();
        //random number between 0 and length of encounters array
        int encounter = random.nextInt(encounters.length);
        for(int i = encounter; i < encounters.length -1; i++){
            encounters[i] = encounters[i + 1];
        }

        if(encounters[encounter].equals("Battle")){
            //create enemy
            AbstractEnemy.enemy();
            //start battle
            //Battle.startBattle(wizard, enemy);
        }
        else if(encounters[encounter].equals("Professor")){
            //create professor
            AbstractSpell.learnSpell(newspell);

        }
        else if(encounters[encounter].equals("Rest")){
            //rest
            //take.Rest();
        }
        else if(encounters[encounter].equals("Shop")){
            //shop
            //Shop.shop();
        }
        else if(encounters.length == 0){
            //bossfight();
            //Boss.boss();
        }

    }


    public static void continueJourney(){
        //check if act must be increased
        checkAct();
        //check if game isn t in the last act
        if(act != places.length){
            //check if the player is in the last place of the act
            if (place < places.length){
                //increase place
                place++;
                //print the new place
                printMenu();
            }
            else{
                //increase act
                act++;
                //reset place
                place = 0;
                //print the new place
                printMenu();
            }
        }
        else{
            //print the end screen
            //Story.printEnd();
        }

    }
    public static void characterInfo(){
        boolean returnmenu;
        clearConsole();
        printHeading("Character Info");
        System.out.println("Name: " + Character.name);
        System.out.println("House: " + SortingHat.house);
        System.out.println("Pet: "+ pet);
        System.out.println("Wand: " + Wand.getWand());
        System.out.println("Known-spells: " + Arrays.toString(AbstractSpell.spells));
        System.out.println("potions: " + Arrays.toString(Potion.potions));
        System.out.println(" ");
        promptEnterKey();
        returnmenu = true;
        if (returnmenu == true){
            clearConsole();
            printMenu();
        }
    }
    public static void printMenu(){
        clearConsole();
        printHeading("Main Menu");
        System.out.println(places[place]);
        System.out.println("Choose an action: ");
        printSeperator(1);
        System.out.println("(1) Continue Journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");

    }

    public static void gameLoop(){
        while(isRunning){
            //print the main menu

            int input = readInt("->",3);
            if(input == 1){
                //start the game
                continueJourney();
            }else if(input == 2){
                characterInfo();
                //exit the game
            }else if(input == 3){
                isRunning = false;
            }
        }
    }
}