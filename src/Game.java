public class Game {
    private final int rounds;
    private final Dice dice = new Dice();

    public Game(int rounds) {
        if (rounds <= 0) throw new IllegalArgumentException("Rounds can not be 0 or less");
        this.rounds = rounds;
    }

    public void play(Player player) {
        int num2;
        int num1;

        for (int i = 0; i < rounds; i++) {
            num1 = dice.rollDice();
            num2 = dice.rollDice();
            if (num1 == num2) {
                player.incrementDoubleDice();
            }
            int result = num1 + num2;
            player.addResult(result);
        }
    }
}
