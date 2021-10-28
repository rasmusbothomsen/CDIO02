import java.util.Scanner;

public class GamePlayTest {
    public static boolean isPlayer1Won() {
        return player1Won;
    }

    public static boolean isPlayer2won() {
        return player2won;
    }

    private static boolean player1Won;
    private static boolean player2won;
    private static int player1Point;

    public static int getPlayer1Point() {
        return player1Point;
    }

    public static int getPlayer2Point() {
        return player2Point;
    }

    private static int player2Point;

    public void GamePlayTest(){
        this.player1Won = false;
        this.player2won = false;
    }
    public void resetTest(){
        this.player1Won = false;
        this.player2won = false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("test1",1);


        Player player2 = new Player("test2",2);

        PlayTurn playTurnPlayer1 = new PlayTurn(player1);
        PlayTurn playTurnPlayer2 = new PlayTurn(player2);


        //while (!playTurnPlayer1.getHasWon()&& !playTurnPlayer2.getHasWon()){
        while (testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)){
            playTurnPlayer1.playTurn();

            if(!testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)) break;

            playTurnPlayer2.playTurn();
        }
        player1Point=player1.getPoint();
        player2Point=player2.getPoint();

        if(playTurnPlayer1.getHasWon()){
            System.out.println(player1.getName()+" has won");
            player1Won=true;
        } else {
            System.out.println(player2.getName()+" has won");
            player2won=true;
        }
    }
    public static boolean testIfGameHasEnded(PlayTurn player1, PlayTurn player2){
        return !player1.getHasWon() && !player2.getHasWon();
    }
}
