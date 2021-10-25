import java.util.Scanner;
public class PlayTurn {
    private  Player player;
    private boolean haswon;
    private static Dice dice;


    public PlayTurn(Player player){
        this.player=player;
        this.haswon= false;
    }
    public boolean getHasWon(){

        return this.haswon;
    }
    public void playTurn(){
        Board board = new Board();
        System.out.println("Det er "+player.getName()+" tur");
        pressToPlay();
        int[] diceThrow = dice.getDice();
        int diceAccThrow=diceThrow[0]+diceThrow[1];
        System.out.println(player.getName()+" Slog "+diceThrow[0]+" og "+diceThrow[1]);
        System.out.println(player.getName()+"Landende på: "+board.getBoard(diceAccThrow,0));
        System.out.println("Feltet påvirker din pengebeholdning med: "+board.getBoard(diceAccThrow,1));
        player.addPoint(Integer.parseInt(board.getBoard(diceAccThrow,1)));
        if (diceAccThrow==9){
            playTurn();
        }
        if(player.getPoint()>=3000) this.haswon=true;
    }
    public void pressToPlay(){
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
