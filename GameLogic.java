package Game;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Wand wand;
    static Wizard wizard;


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
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }



    //Method to start the game
    public static void startGame() {
        boolean nameSet = false;
        String name;
        //print title screen
        System.out.println("     ___      ___         _          ________      ________    __       __             ________     ________     ____________    ____________    __________     ________              ");
        System.out.println("     | |      | |        / \\        / /    \\ \\    / /    \\ \\   \\ \\     / /            / /    \\ \\   / /_____\\ \\  |____________|  |____________|  |  ________|   / /    \\ \\          ");
        System.out.println("     | |      | |       / _ \\       | |     | |   | |     | |   \\ \\   / /             | |     | |  | |     | |        | |             | |       | |            | |     | |                   ");
        System.out.println("     | |______| |      / / \\ \\      | |____/ /    | |____/ /     \\_\\ /_/              | |____/ /   | |     | |        | |             | |       | |________    | |____/ /         ");
        System.out.println("     | |______| |     / /___\\ \\     | |___/ /     | |___/ /        | |                | |___/_/    | |     | |        | |             | |       |  ________|   | |___/ /");
        System.out.println("     | |      | |    / /_____\\ \\    | |   \\ \\     | |   \\ \\        | |                | |          | |     | |        | |             | |       | |            | |   \\ \\      ");
        System.out.println("     | |      | |   / /       \\ \\   | |    \\ \\    | |    \\ \\       | |                | |          | |_____| |        | |             | |       | |________    | |    \\ \\             ");
        System.out.println("     |_|      |_|  /_/         \\_\\  |_|     \\_\\   |_|     \\_\\      |_|                |_|          \\_\\_____/_/        |_|             |_|       |__________|   |_|     \\_\\                             ");
        System.out.println("                                                                                                                          ");
        System.out.println("                                                                               /-\\                                  ");
        System.out.println("                                                                              /   \\                            ");
        System.out.println("                                                                             /     \\                         ");
        System.out.println("                                                                            /       \\                         ");
        System.out.println("                                                                           /         \\                       ");
        System.out.println("                                                                          /           \\                      ");
        System.out.println("                                                                         /             \\                      ");
        System.out.println("                                                                        /               \\                      ");
        System.out.println("                                                                       /                 \\                      ");
        System.out.println("                                                                      /                   \\                      ");
        System.out.println("                                                                     /                     \\                      ");
        System.out.println("                                                                    /                       \\                      ");
        System.out.println("                                                                 |||||||||||||||||||||||||||||||                     ");
        System.out.println("                                                                      |                   |            ");
        System.out.println("                                                                      |    __       __    |            ");
        System.out.println("                                                                     /|   |  |     |  |   |\\       ");
        System.out.println("                                                                     \\|   |__| / \\ |__|   |/          ");
        System.out.println("                                                                      |       /___\\       |         ");
        System.out.println("                                                                      |                   |         ");
        System.out.println("                                                                       \\     _______     /         ");
        System.out.println("                                                                        \\   [_______]   /         ");
        System.out.println("                                                                         \\             /         ");
        System.out.println("                                                                          \\___________/         ");

        System.out.println("\n                                                                      HARRY POTTER AT HOME");
        System.out.println("                                                         A game created and designed by Adrien Rostaing");
        System.out.println(" ");
        anythingToContinue();

        //getting the wizards name
        do{
            printHeading("What's your name?");
            name = scanner.next();
            // verifying if correct name
            printHeading("Your name is " + name + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input = readInt("->",2);
            if(input == 1)
                nameSet = true;
        }while(!nameSet);



        wand = new Wand();
        //Create new player object with the name
        //wizard = new Wizard(name);
        //start main game loop
        //gameLoop()
    }
}