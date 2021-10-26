import java.util.Scanner;
public class PlayTurn {
    private  Player player;
    private boolean haswon;
    private static Dice dice = new Dice(6);


    public PlayTurn(Player player){
        this.player=player;
        this.haswon= false;
    }
    public boolean getHasWon(){

        return this.haswon;
    }
    public void playTurn(){
        Board board = new Board();
        System.out.println("Det er "+player.getName()+"'s tur");
        pressToPlay();
        int[] diceThrow = dice.getDice();
        int diceAccThrow=(diceThrow[0]+diceThrow[1])-2;
        printResult(diceThrow,board);
        addPoints(board.getBoard(diceAccThrow,1));
        checkPoints(player);
        if (diceAccThrow==9){
            playTurn();
        }
    }
    public void printResult(int[] diceThrow, Board board){
        int diceAccThrow=(diceThrow[0]+diceThrow[1])-2;
        System.out.println(player.getName()+" Slog "+diceThrow[0]+" og "+diceThrow[1]);
        System.out.println(player.getName()+" Landende på: "+board.getBoard(diceAccThrow,0));
        System.out.println("Feltet påvirker din pengebeholdning med: "+board.getBoard(diceAccThrow,1));
    }
    public void addPoints(String effektOnPoints){
        player.addPoint(Integer.parseInt(effektOnPoints));
        System.out.println(player.getName()+" Har nu: "+player.getPoint()+"\n");

    }
    public void checkPoints(Player player){
        if(player.getPoint()>=3000) this.haswon=true;
    }
    public void pressToPlay(){
        Scanner scan = new Scanner(System.in);
        boolean rightButton=false;
        char buttenToPress = (char) (player.getPlayerNumber()+'0'); // 0 har en ASCII på 48, så dermed bliver tallet til en char
        while(!rightButton) {
                System.out.println(player.getName() + ", Tryk "+buttenToPress+" For at kaste");
                String buttonPressed = scan.nextLine();
                if (buttonPressed.charAt(0)== buttenToPress) rightButton=true;
                if(buttonPressed.charAt(0) == 'k') this.player.setPoint(3000);

            }
    }
}
