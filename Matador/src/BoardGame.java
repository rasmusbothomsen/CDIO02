import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        introText();
        System.out.println("Indtast spiller 1's navn");
        String tempName = scan.nextLine();
        Player player1 = new Player(tempName,1);

        System.out.println("Indtast spiller 2's navn");
        tempName=scan.nextLine();
        Player player2 = new Player(tempName,2);

        PlayTurn playTurnPlayer1 = new PlayTurn(player1);
        PlayTurn playTurnPlayer2 = new PlayTurn(player2);


        //while (!playTurnPlayer1.getHasWon()&& !playTurnPlayer2.getHasWon()){
        while (testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)){
            playTurnPlayer1.playTurn();

            if(!testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)) break;

            playTurnPlayer2.playTurn();
        }
        if(playTurnPlayer1.getHasWon()){
            System.out.println("Player 1 has won");
        } else System.out.println("Player 2 has won");
        restartGame(scan);


    }
    public static void restartGame(Scanner scan){
        System.out.println("Vil i spille igen? y/n");
        String playAgain = scan.nextLine();
        if (playAgain.charAt(0)=='y'){
            main(null);
        }
    }
    public static boolean testIfGameHasEnded(PlayTurn player1, PlayTurn player2){
        return !player1.getHasWon() && !player2.getHasWon();
    }

    public static void introText(){
        System.out.println("\n"+"Welcome to the FieldGame");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Each of the players take their turn to throw the dice and will land on field 2-12");
        System.out.println("Each of the fields will have either a negative og positive impact on the players cash balance");
        System.out.println("The game is won by achieving 3000 points ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------"+"\n \n");
    }




    }

