
public class Felter {

    public String getFelt(int a, int b) {
        return felt[a][b];
    }

    private final String[][] felt;

    public Felter(){
        felt = new String[][]{{"Tower", "+250"},{"Crater","-100"},{"Place gates","+100"},
                {"Cold Desert","-20"},{"Walled city","+180"},{"Monastery","0"},{"Black Cave","-70"},
                {"Huts in the mountain","+60"},{"The Werewall","-80"},{"The pit","-50"},{"Goldmine","+650"}};

    }

}
