/**
 * RomanNumber.class 
 *
 * This class represent a roman number with methods for convert to arabic number
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 * 
 */

public class RomanNumber {

  private int arabic;
  private String roman;

  public RomanNumber(int arabic) {

    this.validate(arabic);

    this.arabic = arabic;
    this.roman = ConvertNumber.arabicToRoman(arabic);
  }

  public RomanNumber(String roman) {

    this.validate(roman);

    this.roman = roman;
    this.arabic = ConvertNumber.romanToArabic(roman);
  }

  public RomanNumber(int arabic, String roman) {
    this.validate(arabic);
    this.validate(roman);
    this.arabic = arabic;
    this.roman = roman;
  }

  public int getArabic() {
    return this.arabic;
  }

  public String getRoman() {
    return this.roman;
  }

  private void validate(int arabic) {
    if (arabic > 3000)
      throw new IllegalArgumentException("RomanNumber only supports numbers up to 3000");

    if (arabic < 0)
      throw new IllegalArgumentException("RomanNumber not supports negative numbers");
  }

  private void validate(String roman) {
    for (char c : roman.toCharArray()) {
      if (RomanLetter.valueOf(c) == null)
        throw new IllegalArgumentException("RomanNumber only supports characters equals to " + RomanLetter.printAll());
    }
  }

  public RomanNumber add(RomanNumber otheRomanNumber) {
    int result = this.arabic + otheRomanNumber.arabic;
    return new RomanNumber(result);
  }

  public RomanNumber sustract(RomanNumber otheRomanNumber) {
    int result = this.arabic - otheRomanNumber.arabic;
    return new RomanNumber(result);
  }

  public RomanNumber mult(RomanNumber otheRomanNumber) {
    int result = this.arabic * otheRomanNumber.arabic;
    return new RomanNumber(result);
  }

  public RomanNumber divide(RomanNumber otheRomanNumber) {
    int result = this.arabic / otheRomanNumber.arabic;
    return new RomanNumber(result);
  }

  public void print() {
    System.out.println("roman: " + this.roman + " arabic: " + this.arabic);
  }
}