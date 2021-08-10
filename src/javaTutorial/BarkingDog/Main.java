package javaTutorial.BarkingDog;

public class Main {
  public static void main(String[] args) {}

  public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay) {
    if (hourOfTheDay < 0 || hourOfTheDay > 23) {
      return false;
    }
    if (isBarking) {
      return hourOfTheDay < 8 || hourOfTheDay > 22;
    }
    return false;
  }
}
