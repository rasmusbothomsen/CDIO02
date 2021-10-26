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


        //while (!playTurnPlayer1.getHasWon()&& !playTurnPlayer2.getHasWon()){
        while (testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)){
            playTurnPlayer1.playTurn();

            if(!testIfGameHasEnded(playTurnPlayer1,playTurnPlayer2)) break;

            playTurnPlayer2.playTurn();
        }
        if(playTurnPlayer1.getHasWon()){
            System.out.println("Spiller 1 har vundet");
        } else System.out.println("Spiller 2 har vundet");


    }
    public static boolean testIfGameHasEnded(PlayTurn player1, PlayTurn player2){
        return !player1.getHasWon() && !player2.getHasWon();
    }

    public static void introText(){
        System.out.println("Velkommen til FeltSpillet");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Hver af spillerne skiftes til at slå med 2 terninger og lander på et vilkårligt felt fra 2-12");
        System.out.println("Hver af disse felter har en positiv eller negativ påvirkning på spillerens pengebeholdning");
        System.out.println("Man vinder ved at opnå 3000 point");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
    }




    }

