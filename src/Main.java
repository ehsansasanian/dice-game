public class Main {
    public static void main(String[] args) {


        Player player1 = new Player("Mohammad");
        Player player2 = new Player("Ehsan");

        Game game = new Game(5);

        game.play(player1);
        game.play(player2);


        if(player1.getDoubleDiceCount() == player2.getDoubleDiceCount()){
            System.out.println(player1);
            System.out.println(player2);

        }else if(player1.getDoubleDiceCount() >player2.getDoubleDiceCount()){
            System.out.println("winner :" + player1);
        } else{
            System.out.println("winner :" + player2);
        }

    }
}