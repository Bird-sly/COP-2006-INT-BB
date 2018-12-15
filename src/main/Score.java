package main;
import extra.Player;

//import java.util.Map;

public class Score {

  public static void do9() {
    
    
    Player p1 = new Player(100);
    Player p2 = new Player();
    
    //p1.score = 100;

    //p1.setScore(100);
    p2.setScore(200);

    System.out.println("Player 1 score = " + p1.getScore());
    System.out.println("Player 2 score = " + p2.getScore());
  }
}