package src;

public class Main {
  public static void main(String[] args) {
    boolean isLoggedIn = true;
    System.out.println(isLoggedIn);

    int var1 = 5;
    System.out.println(var1);

    int var2 = 10;
    System.out.println(var2);

    var1 = var2;
    System.out.println(var1);
    System.out.println(var2);

    var2 = 20;
    System.out.println(var1);
    System.out.println(var2);
  }
}
