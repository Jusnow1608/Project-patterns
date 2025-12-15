package co.devfoundry.patterns.singletontask;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {

    public int score;
    private static GuessGame instance = new GuessGame();

    private GuessGame()
    {}

  public void play()
  {
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      score = 0;
      for(int i =1;i<=10;i++) {
          int number = rand.nextInt(10); // losuje od 0 do 9
          System.out.println("Runda "+ i+ ": zgadnij liczbe od 0 do 9: ");
          int guess = scanner.nextInt();
          if (guess == number) {
              System.out.println("Brawo! Trafiłeś.");
              score++;
          } else {
              System.out.println("Pudło! Wylosowana liczba to: " + number);
          }
      }
  }

 public int getScore()
  {
    return score;
  }
    public static GuessGame getInstance()
    {
        return instance;
    }

    protected Object readResolve()
    {
        return getInstance();
    }

}
