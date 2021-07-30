package firstSteps.Strings;

public class Main {
  public static void main(String[] args) {
    // byte
    // short
    // int
    // float
    // long
    // double
    // char
    // boolean

    String myString = "This is a string";
    System.out.println("myString is equal to " + myString);
    myString = myString + ", and this is more.";
    System.out.println("meString equal to " + myString);
    myString = myString + "\u00A9 2019";
    System.out.println("myString is equal to " + myString);
    String numberString = "250.55";
    numberString = numberString + "156.25";
    System.out.println(numberString);
    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("LastString is equal to " + lastString);

    double doubleNumber = 120.47d;
    lastString = lastString + doubleNumber;
    System.out.println(lastString);
  }
}
