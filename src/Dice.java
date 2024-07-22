import java.util.Random;

public class Dice {
    private final Random rnd;
    public Dice(){
         this.rnd = new Random();
    }

    public int rollDice(){
        return rnd.nextInt(6)+1;

    }

}
