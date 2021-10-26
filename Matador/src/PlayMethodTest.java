public class PlayMethodTest {
    public static void main(String[] args) {
        Player player1 = new Player("ras",1);
        PlayTurn player1Turn = new PlayTurn(player1);
        player1Turn.playTurn();

    }
}
