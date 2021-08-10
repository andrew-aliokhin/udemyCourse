package javaTutorial.DecimalComparator;

public class Main {
  public static void main(String[] args) {
    }


  public static boolean areEqualThreeDecimalPlaces(double firstNumber, double secondNumber) {
    return (int)(firstNumber * 1000) == (int)(secondNumber * 1000);
  }
}
