package javaTutorial.TeenNumberChecker;

public class Main {
  public static void main(String[] args) {
    //
  }

  public static boolean hasTeen(int firstPeopleAge, int secondPeopleAge, int thirdPeopleAge) {
    if (firstPeopleAge >= 13 && firstPeopleAge <= 19) {
      return true;

    } else if (secondPeopleAge >= 13 && secondPeopleAge <= 19) {
      return true;
    } else return thirdPeopleAge >= 13 && thirdPeopleAge <= 19;
  }

  public static boolean isTeen(int age) {
    return age >= 13 && age <= 19;
  }
}
