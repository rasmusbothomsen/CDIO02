package test;

import org.junit.Test;
import src.BoardGame;
import src.PlayTurn;
import src.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayTurnTest {

    @Test
    void testIfGameHasEndedNone() {
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertTrue(resualt);
    }
    @Test
    void testIfGameHasEndedPlayer1(){
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        player1.addPoint(3000);
        player1turn.checkPoints(player1);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertFalse(resualt);
    }
    @Test
    void testIfGameHasEndedPlayer2(){
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        player2.addPoint(3000);
        player2turn.checkPoints(player2);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertFalse(resualt);
    }
    @Test
    void testIfGameHasEndedBothPlayers(){
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        player2.addPoint(3000);
        player1.addPoint(3000);
        player1turn.checkPoints(player2);
        player2turn.checkPoints(player2);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertFalse(resualt);
    }
    @Test
    void testIfGameHasEndedPlayer1300PointsExact(){
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        player1.addPoint(2000);
        player1turn.checkPoints(player1);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertFalse(resualt);
    }
    @Test
    void testIfGameHasEndedPlayer2300PointsExact(){
        Player player1 = new Player("Test",1);
        Player player2 = new Player("Test",1);
        PlayTurn player1turn = new PlayTurn(player1);
        PlayTurn player2turn = new PlayTurn(player2);
        player2.addPoint(2000);
        player2turn.checkPoints(player2);
        boolean resualt = BoardGame.testIfGameHasEnded(player1turn,player2turn);
        assertFalse(resualt);
    }

    @Test
    void testPlayerPointsNotLessThanZero(){
        Player player = new Player("test",1);
        player.addPoint(-1500);
        assertEquals(player.getPoint(), 0 );
    }

    /*@Test
    void testOutOfBoundsBoardArray(){
        Board board = new Board();
        Dice dice = new Dice(6);
        int[] dicethrow = new int[2];
        for(int i =0; i<1000;i++) {
            dicethrow = dice.getDice();
            board.getBoard((dicethrow[1] + dicethrow[0]) - 2, 0);
            Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->{});
        }


        }*/

    }

