package src;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int var1 = 13;
    float var2 = 5;

    System.out.println(var1/var2);

    BigDecimal var3 = new BigDecimal("2.15");
    BigDecimal var4 = new BigDecimal("1.1");
    System.out.println(var3.subtract(var4));
  }
}
