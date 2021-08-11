package javaTutorial.MrthodOverloading;

public class Main {
  public static void main(String[] args) {
    System.out.println(calcFeetAndInchesToCentimeters(0, -1));
    System.out.println(calcFeetAndInchesToCentimeters(154));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0) {
      return -1;
    } else if (inches < 0 || inches > 12) {
      return -1;
    }
    return (inches * 2.54 + feet * 12 * 2.54);
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }
    System.out.println((int) inches/12 +" foot " +(int) (inches % 12)+ " inc " );
    return 1;
  }
}
