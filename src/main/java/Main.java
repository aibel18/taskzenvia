/**
 * Main.class
 * 
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  public int evaluate(String expression) {
    int sum = 0;
    for (String summand : expression.split("\\+")) {
      sum -= Integer.valueOf(summand);
    }
    return sum;
  }

  public double divide(double x, double y) {
    return x / y;
  }
}
