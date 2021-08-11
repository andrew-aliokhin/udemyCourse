package javaTutorial.SecondsAndMinutesChallenge;

public class Main {

  public static void main(String[] args) {
    System.out.println(getDurationString(82, 56));
  }

  public static int getRemainderForTime(int value) {
    return value % 60;
  }

  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid value";
    }
    return (minutes / 60
        + "h "
        + (getRemainderForTime(minutes) + seconds) / 60
        + "m "
        + getRemainderForTime(getRemainderForTime(minutes))
        + "s");
  }

  public static String getDurationString(int seconds){
    return "";
  }
}
