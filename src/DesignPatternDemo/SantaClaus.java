package DesignPatternDemo;

public class SantaClaus {

    private static SantaClaus santa = new SantaClaus();
    private final MagicalBoard magicalBoard;

    private SantaClaus() {
        this.magicalBoard = new MagicalBoard();
    }

    public static SantaClaus getSingleton(){
        return santa;
    }

    public MagicalBoard getMagicalBoard() {
        return this.magicalBoard;
    }
}
