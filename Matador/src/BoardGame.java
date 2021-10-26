import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 enter your name");
        String tempName = scan.nextLine();
        Player player1 = new Player(tempName,1);
        System.out.println("Player 2 enter your name");
        tempName=scan.nextLine();
        Player player2 = new Player(tempName,2);
        PlayTurn playTurnPlayer1 = new PlayTurn(player1);
        PlayTurn playTurnPlayer2 = new PlayTurn(player2);


        //while (!playTurnPlayer1.getHasWon()&& !playTurnPlayer2.getHasWon()){
        while (testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)){
            playTurnPlayer1.playTurn();
            playTurnPlayer1.checkPoints(player1);
            playTurnPlayer2.playTurn();
            playTurnPlayer1.checkPoints(player2);
        }
        if(playTurnPlayer1.getHasWon()){
            System.out.println("Player 1 has won");
        } else System.out.println("Player 2 has won");


    }
    public static boolean testIfGameHasEnded(PlayTurn player1, PlayTurn player2){
        return !player1.getHasWon() && !player2.getHasWon();
    }

    public static void introText(){
        System.out.println("Welcome to the Fieldgame");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Each of the players take their turn to throw the dice and will land on field 2-12");
        System.out.println("Each of the fields will have either a negative og positive impact on the players cash balance");
        System.out.println("The game is won by achieving 3000 points ");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
    }




    }

