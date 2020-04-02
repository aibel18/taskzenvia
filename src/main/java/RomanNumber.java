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

  private int arabicNumber;
  private String romanNumber;

  public RomanNumber(int arabicNumber) {

    this.validate(arabicNumber);

    this.arabicNumber = arabicNumber;
    this.romanNumber = ConvertNumber.arabicToRoman(arabicNumber);
  }

  public RomanNumber(String romanNumber) {

    this.validate(romanNumber);

    this.romanNumber = romanNumber;
    this.arabicNumber = ConvertNumber.romanToArabic(romanNumber);
  }

  public int getArabicNumber() {
    return this.arabicNumber;
  }

  public String getRomanNumber() {
    return this.romanNumber;
  }

  private void validate(int arabicNumber) {
    if (arabicNumber > 3000)
      throw new IllegalArgumentException("RomanNumber only supports numbers up to 3000");

    if (arabicNumber < 0)
      throw new IllegalArgumentException("RomanNumber not supports negative numbers");
  }

  private void validate(String romanNumber) {
    for (char c : romanNumber.toCharArray()) {
      if (RomanLetter.valueOf(c) == null)
        throw new IllegalArgumentException("RomanNumber only supports characters equals to " + RomanLetter.printAll());
    }
  }

  public RomanNumber add(RomanNumber otheRomanNumber) {
    int result = this.arabicNumber + otheRomanNumber.arabicNumber;
    return new RomanNumber(result);
  }

  public RomanNumber sustract(RomanNumber otheRomanNumber) {
    int result = this.arabicNumber - otheRomanNumber.arabicNumber;
    return new RomanNumber(result);
  }

  public RomanNumber mult(RomanNumber otheRomanNumber) {
    int result = this.arabicNumber * otheRomanNumber.arabicNumber;
    return new RomanNumber(result);
  }

  public RomanNumber divide(RomanNumber otheRomanNumber) {
    int result = this.arabicNumber / otheRomanNumber.arabicNumber;
    return new RomanNumber(result);
  }

  public void print() {
    System.out.println("roman: " + this.romanNumber + " arabic: " + this.arabicNumber);
  }
}