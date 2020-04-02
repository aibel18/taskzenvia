/**
 * ConvertNumber.class 
 *
 * to convert from Roman to Arabic and from Arabic to Arabic
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 *
 */

public class ConvertNumber {

  private static String repeat(RomanLetter r, int times) {

    String repeat = "";

    for (int i = 0; i < times; i++)
      repeat += r.letter();

    return repeat;
  }

  private static String convert(int digit, RomanLetter unit, RomanLetter middle, RomanLetter major) {
    if (digit < 5)
      return digit > 3 ? ""+unit.letter() + middle.letter() : repeat(unit, digit);
    else
      return digit > 8 ? ""+unit.letter() + major.letter() : middle.letter() + repeat(unit, digit - 5);
  }

  public static int romanToArabic(String roman) {

    /*int val = 0;

    for (char c : roman.toCharArray()) {
      val = RomanLetter.valueOf(c).number();
    }
    int arabic = 0;*/
    return 0;
  }

  public static String arabicToRoman(int arabic) {

    int digitCurrent = 0;
    String roman = "";

    /// convert units
    digitCurrent = arabic % 10;
    roman = convert(digitCurrent, RomanLetter.I, RomanLetter.V, RomanLetter.X) + roman;
    arabic = arabic / 10;

    /// convert tens
    digitCurrent = arabic % 10;
    roman = convert(digitCurrent, RomanLetter.X, RomanLetter.L, RomanLetter.C) + roman;
    arabic = arabic / 10;

    /// convert hundreds
    digitCurrent = arabic % 10;
    roman = convert(digitCurrent, RomanLetter.C, RomanLetter.D, RomanLetter.M) + roman;
    arabic = arabic / 10;

    /// convert thousands
    digitCurrent = arabic % 10;
    roman = convert(digitCurrent, RomanLetter.M, RomanLetter.M, RomanLetter.M) + roman;

    //arabic = arabic / 10;

    return roman;
  }
}
