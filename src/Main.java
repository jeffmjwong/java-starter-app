package src;

public class Main {
  public static void main(String[] args) {
    long var1 = 21;
    short var2 = 5;
    float var3 = 20.2f;

    System.out.println(var1 > var3);

    short result1 = (short) (var3 - var1);

    System.out.println(result1);

    // BigDecimal var3 = new BigDecimal("2.15");
    // BigDecimal var4 = new BigDecimal("1.1");
    // System.out.println(var3.subtract(var4));
  }
}
