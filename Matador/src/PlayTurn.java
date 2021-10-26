import java.util.Scanner;
public class PlayTurn {
    public  Player player;
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
        System.out.println(player.getName()+"'s turn");
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
        System.out.println(player.getName()+" Rolled "+diceThrow[0]+" and "+diceThrow[1]);
        System.out.println(player.getName()+" "+board.getBoard(diceAccThrow,0));
        System.out.println("The field will impact your cash balance with: "+board.getBoard(diceAccThrow,1));
    }
    public void addPoints(String effektOnPoints){
        player.addPoint(Integer.parseInt(effektOnPoints));
        System.out.println(player.getName()+" Now has: "+player.getPoint()+"\n");
        //

    }
    public void checkPoints(Player player){
        if(player.getPoint()>=3000) this.haswon=true;
    }
    public void pressToPlay(){
        Scanner scan = new Scanner(System.in);
        boolean rightButton=false;
        char buttenToPress = (char) (player.getPlayerNumber()+'0'); // 0 har en ASCII på 48, så dermed bliver tallet til en char
        while(!rightButton) {
                System.out.println(player.getName() + ", Press "+buttenToPress+" To roll");
                String buttonPressed = scan.nextLine();
                if (buttonPressed.charAt(0)== buttenToPress) rightButton=true;
                if(buttonPressed.charAt(0) == 'k') this.player.setPoint(3000);

            }
    }
}
