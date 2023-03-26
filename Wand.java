package Game;
import java.util.Random;

public class Wand {

    private static int size;
    private static Core core;
    private static String wand;
    public void wand() {
        Random random = new Random();
        this.core = Core.values()[random.nextInt(Core.values().length)];
        this.size = random.nextInt(15) + 22;
        this.wand = this.core + " " + this.size;
        System.out.println("Your wand measures " + this.size + "cm and is made of " + this.core.type + " core."+" It is often said that a wand chooses its wielder!");

    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getSize() {
        return size;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public static Core getCore() {
        return core;
    }

    public void setWand(Wand wand) {
        this.wand = String.valueOf(wand);
    }

    public static String getWand() {
        return wand;
    }


}