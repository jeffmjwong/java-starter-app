package src;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    float var1 = 2.15f;
    float var2 = 1.1f;

    BigDecimal var3 = new BigDecimal("2.15");
    BigDecimal var4 = new BigDecimal("1.1");
    System.out.println(var3.subtract(var4));
  }
}
