package firstSteps.Operators;

public class Main {
  public static void main(String[] args) {

    int result = 1 + 2; // 1 + 2 = 3

    System.out.println("1 + 2 = " + result);

    int previousResult = result;

    System.out.println("previousResult = " + previousResult);
    result = result - 1; // 3 - 1 = 2;
    System.out.println("3 - 1 = " + result);
    System.out.println("previousResult = " + previousResult);
    result = result * 10; // 2* 10 = 20
    System.out.println(result);
    result = result / 5;
    System.out.println(result);

    result = result % 3; // the remainder of (4 % 3 ) = 1;
    System.out.println(result);

    result++;
    System.out.println(result);

    result--;
    System.out.println(result);

    result += 2;
    System.out.println(result);

    result *= 10;
    System.out.println(result);

    result /= 3;
    System.out.println(result);

    result -= 2;
    System.out.println(result);

    System.out.println("It is not an alien!");
    System.out.println("And I am scared of aliens");

    // and
    System.out.println("Greater than second top score and less than 100");

    boolean isCar = false;
    isCar = true;
    System.out.println("wasCar is true");

    System.out.println("______________________________________________________");

    double firstDouble = 20.00;
    double secondDouble = 80.00;

    double totalDouble = (firstDouble + secondDouble) * 100.00;
    System.out.println(totalDouble);

    double remainderDouble = totalDouble % 40;
    System.out.println(remainderDouble);

    boolean isRemainderDouble = remainderDouble == 0;
    System.out.println(isRemainderDouble);
    if (isRemainderDouble) {
      System.out.println("Remainder = 0");
    } else {
      System.out.println("Remainder not equals zero. It equals " + remainderDouble);
    }
  }
}
