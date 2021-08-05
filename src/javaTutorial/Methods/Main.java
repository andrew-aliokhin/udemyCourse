package javaTutorial.Methods;

public class Main {
  public static void main(String[] args) {
    int score = 1500;
    displayHighScorePosition("Andrew", calculateHighScorePosition(score));

    score = 900;
    displayHighScorePosition("Emil", calculateHighScorePosition(score));
    score = 400;
    displayHighScorePosition("Miron", calculateHighScorePosition(score));
    score = 12;
    displayHighScorePosition("Sam", calculateHighScorePosition(score));
  }

  public static void displayHighScorePosition(String playerName, int positionOnHighScoreTable) {
    System.out.println(
        "Player "
            + playerName
            + " managed to get into position "
            + positionOnHighScoreTable
            + " on the high score table.");
  }

  public static int calculateHighScorePosition(int playerScore) {
    int position = 4;
    if (playerScore >= 1000) {
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    }
    return position;
  }
}
