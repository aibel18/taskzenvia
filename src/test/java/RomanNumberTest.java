
/**
 * RomanNumberTest.class 
 *
 * Unit test for RomanNumber.class
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 *
 */

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(OrderAnnotation.class)
public class RomanNumberTest extends TimingExtension{

  @Test
  @Order(1)
  public void validateArguments(TestInfo testInfo) {

    assertAll("validate arguments",
        () -> assertDoesNotThrow(() -> new RomanNumber(25), "Should not throw an exception"),
        () -> assertDoesNotThrow(() -> new RomanNumber("XIX"), "Should not throw an exception"));
  }

  @Test
  @Order(2)
  public void invalidateArguments() {

    assertAll("invalidate arguments", () -> assertThrows(RuntimeException.class, () -> new RomanNumber(-10)),
        () -> assertThrows(RuntimeException.class, () -> new RomanNumber(3001)),
        () -> assertThrows(RuntimeException.class, () -> new RomanNumber("FDV")),
        () -> assertThrows(RuntimeException.class, () -> new RomanNumber("-10")));

  }

  @Test
  @Order(3)
  public void convertToRoman() {

    assertEquals("", new RomanNumber(0).getRomanNumber(), () -> "it's not number zero in romans");
    assertEquals("I", new RomanNumber(1).getRomanNumber(), () -> "it's not number one in romans");
    assertEquals("III", new RomanNumber(3).getRomanNumber(), () -> "it's not number three in romans");
    assertEquals("IV", new RomanNumber(4).getRomanNumber(), () -> "it's not number four in romans");
    assertEquals("V", new RomanNumber(5).getRomanNumber(), () -> "it's not number five in romans");
    assertEquals("VII", new RomanNumber(7).getRomanNumber(), () -> "it's not number seven in romans");
    assertEquals("IX", new RomanNumber(9).getRomanNumber(), () -> "it's not number nine in romans");
  }

  //@Test
  @DisplayName("TEST 1")
  public void valuatesExpression() {
    //logger.info("Before all tests");
    Main calculator = new Main();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(-6, sum, () -> "My error message -- " + "to avoid");
  }

  //@RepeatedTest(10)
  public void valuatesExpressions() {

    new Main().evaluate("1+2+3+4+5+6");
  }

  //@Test
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

  //@Test
  //@ParameterizedTest
  void mytest() {

    assertTimeout(Duration.ofMillis(10), () -> {

      Main calculator = new Main();
      int sum = calculator.evaluate("1+2");
      //Thread.sleep(100);

      //return "a result";
    });
    //assertEquals("a result", actualResult);
  }
}
