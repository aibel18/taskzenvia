import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Unit test for simple App.
 */
@TestInstance(Lifecycle.PER_METHOD)
@ExtendWith(TimingExtension.class)
public class MainTest implements TestLifecycleLogger {

  @Test
  @DisplayName("TEST 1")
  public void valuatesExpression() {
    //logger.info("Before all tests");
    Main calculator = new Main();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(-6, sum, () -> "My error message -- " + "to avoid");
  }

  @RepeatedTest(10)
  public void valuatesExpressions() {

    new Main().evaluate("1+2+3+4+5+6");
  }

  @Test
  @DisplayName("TEST 2")
  @Timeout(value = 110, unit = TimeUnit.MILLISECONDS)
  void exceptionTesting() {
    //Exception exception = assertThrows(ArithmeticException.class, () -> new App().divide(1, 0));
    //assertEquals("/ by zero", exception.getMessage());
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      //e.printStackTrace();
    }
  }

  @Test
  void mytest() {

    assertTimeout(Duration.ofMillis(10), () -> {

      Main calculator = new Main();
      int sum = calculator.evaluate(ex);
      //Thread.sleep(100);

      //return "a result";
    });
    assertTimeout(Duration.ofSeconds(10), MainTest::number2);
    //assertEquals("a result", actualResult);
  }

  public static String ex = "1+2";

  public static String number() {
    return "1+2";
  }

  public static double number2() {
    return 10.0;
  }
}
