package pokergame;

import java.util.Scanner;

public class PokerGameRunner {
  

  public static void main (String[] args) {

    Table table = new Table();
    Dealer dealer = new Dealer();

    dealer.sitAtTable(table);

    AIPlayer aiPlayer1 = new AIPlayer();
    AIPlayer aiPlayer2 = new AIPlayer();
    AIPlayer aiPlayer3 = new AIPlayer();
    AIPlayer aiPlayer4 = new AIPlayer();
    AIPlayer aiPlayer5 = new AIPlayer();

    table.addSeatedPlayer(aiPlayer2);
    table.addSeatedPlayer(aiPlayer3);
    table.addSeatedPlayer(aiPlayer4);
    table.addSeatedPlayer(aiPlayer5);
    table.addSeatedPlayer(aiPlayer1);

    System.out.println("----- Welcome to the poker game -----");

    Scanner scanner = new Scanner(System.in);

    System.out.print("How much would you like to deposit ($): ");
    int playerDeposit = scanner.nextInt();

    HumanPlayer humanPlayer = new HumanPlayer(playerDeposit);
    table.addSeatedPlayer(humanPlayer);
    
    for (int i = 0; i < 5; i++) {
      System.out.println("----- NEW ROUND -----");
      // Ask for bet
      System.out.print("What should the bet be? ");
      int bet = scanner.nextInt();

      // Collect bets from players
      dealer.collectBets(bet);

      // deal player cards
      dealer.dealHoleCards();

      for (Player player : table.getActivePlayers()) {
        System.out.println(player.getHand().toString());
      }

      // deal board cards
      dealer.dealBoardCards();

      // Check winner
      System.out.println("Board is: " + table.getBoardCards());
      System.out.println();
      dealer.endRound();
    }
    

    scanner.close();
  }
}
