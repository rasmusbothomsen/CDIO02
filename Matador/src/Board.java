
public class Board {

    public String getBoard(int a, int b) {return field[a][b];
    }

    private final String[][] field;

    public Board(){
        field = new String[][]{{"You have arrived at the Tower", "+250"},{"You stumbled into the Crater","-100"},{"You approach the Palace gates","+100"},
                {"You landed in the Cold Desert","-20"},{"You visited the Walled city","+180"},{"You came to pass the holy Monastery","0"},{"You entered the Black Cave","-70"},
                {"You climbed up to the Huts in the mountain","+60"},{"You bumped into The Werewall","-80"},{"You fell into The pit","-50"},{"Du landede på feltet Goldmine","+650"}};

    }

}
