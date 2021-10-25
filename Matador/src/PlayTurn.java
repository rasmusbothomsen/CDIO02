import java.util.Scanner;
public class PlayTurn {
    private Player player;
    int[] diceThrow;
    private boolean haswon;


    public PlayTurn(Player player, int[] diceThrow){
        this.player=player;
        this.diceThrow=diceThrow;
        this.haswon= false;
    }
    public static void playTurn(){

    }
    public static void pressToPlay(Player player){
        Scanner scan = new Scanner(System.in);
        boolean isPressed=false;
        boolean rightButton=false;
        while(!isPressed) {
                System.out.println(player.getName() + ", Tryk "+player.getPlayerNumber()+" For at kaste");
                String buttonPressed = scan.nextLine();
                if (buttonPressed.charAt(0)== player.getPlayerNumber()) rightButton=true;
                if(rightButton){
                    isPressed=true;
                }
            }
                }
}
