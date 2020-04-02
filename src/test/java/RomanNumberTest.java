
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

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

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
  public void convertToRomaBase1() {

    assertEquals("", new RomanNumber(0).getRoman(), () -> "it's not number zero in romans");
    assertEquals("I", new RomanNumber(1).getRoman(), () -> "it's not number one in romans");
    assertEquals("III", new RomanNumber(3).getRoman(), () -> "it's not number three in romans");
    assertEquals("IV", new RomanNumber(4).getRoman(), () -> "it's not number four in romans");
    assertEquals("V", new RomanNumber(5).getRoman(), () -> "it's not number five in romans");
    assertEquals("VII", new RomanNumber(7).getRoman(), () -> "it's not number seven in romans");
    assertEquals("IX", new RomanNumber(9).getRoman(), () -> "it's not number nine in romans");
  }

  @Test
  @Order(4)
  public void convertToRomanBase10() {

    RomanNumber base10[] = {
      new RomanNumber(10, "X"),
      new RomanNumber(37, "XXXVII"),
      new RomanNumber(51, "LI"),
      new RomanNumber(93, "XCIII"),
      new RomanNumber(79, "LXXIX"),
      new RomanNumber(94, "XCIV"),
      new RomanNumber(88, "LXXXVIII") };

    for(RomanNumber rn: base10)
      assertEquals(rn.getRoman(), new RomanNumber(rn.getArabic()).getRoman(), () -> "it's not number "+rn.getArabic()+" in romans");
  }

  @Test
  @Order(5)
  public void convertToRomanBase100() {

    RomanNumber base100[] = {
      new RomanNumber(100, "C"),
      new RomanNumber(376, "CCCLXXVI"),
      new RomanNumber(934, "CMXXXIV"),
      new RomanNumber(455, "CDLV"),
      new RomanNumber(190, "CXC"),
      new RomanNumber(819, "DCCCXIX") };

    for(RomanNumber rn: base100)
      assertEquals(rn.getRoman(), new RomanNumber(rn.getArabic()).getRoman(), () -> "it's not number "+rn.getArabic()+" in romans");
  }

  @Test
  @Order(6)
  public void convertToRomanBase1000() {

    RomanNumber base1000[] = {
      new RomanNumber(3000, "MMM"),
      new RomanNumber(2956, "MMCMLVI"),
      new RomanNumber(1925, "MCMXXV"),
      new RomanNumber(2818, "MMDCCCXVIII"),
      new RomanNumber(1090, "MXC"),
      new RomanNumber(2444, "MMCDXLIV") };

    for(RomanNumber rn: base1000)
      assertEquals(rn.getRoman(), new RomanNumber(rn.getArabic()).getRoman(), () -> "it's not number "+rn.getArabic()+" in romans");
  }

  @Test
  @Order(7)
  public void runTime() {

    long timeMillis = 20;

    assertTimeout(Duration.ofMillis(timeMillis), () -> {
      new RomanNumber(2333);
      new RomanNumber(2999);
      new RomanNumber(2444);
      new RomanNumber(2888);
    },"runtime exceeded expectations: "+timeMillis);
  }
}
