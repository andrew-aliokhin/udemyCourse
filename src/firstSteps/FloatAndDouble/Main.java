package firstSteps.FloatAndDouble;

public class Main {

  public static void main(String[] args) {

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3F;
    double myDoubleValue = 5.00 / 3.00;

    System.out.println("MyIntValue = " + myIntValue);
    System.out.println("MyFloatValue = " + myFloatValue);
    System.out.println("MyDoubleValue = " + myDoubleValue);

    double weightInKilo = 15d;
    double conversionFactor = 0.45359237d;
    double resultInPounds = weightInKilo / conversionFactor;
    System.out.println("Result: " + resultInPounds);
  }
}
