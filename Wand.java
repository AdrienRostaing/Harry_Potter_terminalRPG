package Game;
import java.util.Scanner;

import static Game.GameLogic.readInt;


public class Wand{
    static Scanner scanner = new Scanner(System.in);
    public String core;
    public int size;

    public Wand() {
        this.core = "";
        this.size = 0;
        corewand();
        sizewand();

    }

    public void corewand() {
        boolean coreSet = false;

        do {
            GameLogic.printHeading("Create your own wand \n What core would you like?");
            for (int i = 1; i < Core.cores.length; i++)
                System.out.println("(" + i + ") " + Core.cores[i]);
            int input = readInt("->", 3);
            core = Core.cores[input];
            GameLogic.printHeading("You chose a " + core + " core" + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change the core.");
            int input2 = readInt("->", 2);
            if (input2 == 1)
                coreSet = true;
        } while (!coreSet);
    }
    public void sizewand(){
        boolean sizeSet = false;
        do{
            GameLogic.printHeading("How long would you like the wand to be 22-35cm?");
            size = Integer.parseInt(scanner.next());
            if (size < 22  || size > 35) {
                System.out.println("The size you chose is not correct");
                GameLogic.anythingToContinue();
                sizewand();
            }
            else{
                // verifying if correct size
                GameLogic.printHeading("You chose a wand of " + size + " cm" + "\nIs that correct?");
                System.out.println("(1) Yes!");
                System.out.println("(2) No, I want to change the size.");
                int input = readInt("->", 2);
                if (input == 1)
                    sizeSet = true;
            }
        }while(!sizeSet);
    }
}
