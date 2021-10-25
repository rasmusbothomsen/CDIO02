import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast spiller 1's navn");
        String tempName = scan.nextLine();
        Player player1 = new Player(tempName,1);
        System.out.println("Indtast spiller 2's navn");
        tempName=scan.nextLine();
        Player player2 = new Player(tempName,2);
        PlayTurn playTurnPlayer1 = new PlayTurn(player1);
        PlayTurn playTurnPlayer2 = new PlayTurn(player2);


        while (!playTurnPlayer1.getHasWon()|| !playTurnPlayer2.getHasWon()){
            playTurnPlayer1.playTurn();
            playTurnPlayer2.playTurn();
        }
        if(playTurnPlayer1.getHasWon()){
            System.out.println("Spiller 1 har vundet");
        } else System.out.println("Spiller 2 har vundet");


    }

    public static void introText(){
        System.out.println("Velkommen til FeltSpillet");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Man vinder ved at opnå 3000 point");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
    }




    }

