import java.util.Random;

public class Dice {

    public int[] get;
    Random dice = new Random();
    public int faceValue;

    public Dice(int faceValue){
        this.faceValue=faceValue;
    }
    public int[] getDice() {
        int dice1 = dice.nextInt(faceValue)+1;
        int dice2 = dice.nextInt(faceValue)+1;
        return new int[]{dice1,dice2};
    }

}
