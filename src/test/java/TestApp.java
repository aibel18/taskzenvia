import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestApp {
  @Test
  public void valuatesExpression() {
    App calculator = new App();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
