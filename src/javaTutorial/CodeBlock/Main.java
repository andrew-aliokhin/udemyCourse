package javaTutorial.CodeBlock;

public class Main {
  static Main main = new Main();
  public static void main(String[] args) {
    System.out.println(main);
    int score;
    String myName;
    myName = "Andrew";
    printYourName(myName);
  }

  public static void printYourName(String name){
    System.out.println("Your name is: "+name);
  }

  @Override
  public String toString() {
    return "this is Main object";
  }
}
