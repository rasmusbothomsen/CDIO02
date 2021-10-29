package ModelGui;


import gui_fields.GUI_Field;

import java.awt.*;
public class GameBoard

{
//placeholder med gameboard//
    private GUI_Field[] fields = new GUI_Field[12];
    private Square[] squares = new Square[12];
    public GameBoard()
    {
        createSquare();
    }
//str på
    public GUI_Field[] createFields()
    {
        for (int i = 0; i < fields.length; i++)
        {

            fields[i] = squares[i].getType();
        }

        return fields;
    }
//get getFields placeholder til brug i main//
    public GUI_Field getFields(int placement) {
        return fields[placement];
    }

    public void createSquare()
    {
        squares[0] = new Square(1, 0, "Start", "startPlaceholder",Color.WHITE);
        squares[1] = new Square(2, +250, "Tower", "You have arrived at the Tower and get 250points! 😍", Color.GREEN );
        squares[2] = new Square(3, -100, "Crater","You stumbled into the Crater and lost 100 points 😢",Color.RED);
        squares[3] = new Square(4, +100, "Palace Gates","You approach the Palace gates and receive 100 points 😲",Color.GREEN);
        squares[4] = new Square(5, -20, "Cold Desert","You landed in the Cold Desert and lost 20 points 🥶", Color.CYAN);
        squares[5] = new Square(6, +180, "Walled City","You visit the Walled City and get 180 points 🏙", Color.GREEN);
        squares[6] = new Square(7, 0, "Monastery","You spend a night at the holy Monastery for free ⛪", Color.PINK);
        squares[7] = new Square(8, -70, "Black Cave","You entered the Black Cave and lose 70 points🦇", Color.RED);
        squares[8] = new Square(9, +60, "Huts in the Mountain","You climbed up to the Huts in the mountain and find 60 points!🗻", Color.GREEN);
        squares[9] = new Square(10, -80, "The Werewall", "You bumped into The Werewall and lose 80 points \n You will receive an extra turn🐺", Color.RED);
        squares[10] = new Square(11, -50, "The Pit","You fell into the Pit and lost 50 points🕳", Color.RED);
        squares[11] = new Square(12, +650, "Goldmine","You found the goldmine and receive and 650 points⛏", Color.YELLOW);

    }
//squarepoint og squaredesc placeholder til brug i main//
    public int getSquarePoint(int placement) {
        return squares[placement].getPoints();
    }

    public String getSquareDesc(int placement)
    {
        return squares[placement].getDescription();
    }

}
