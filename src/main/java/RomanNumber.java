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
    this.arabicNumber = arabicNumber;
  }

  public RomanNumber(String romanNumber) {
    this.romanNumber = romanNumber;
  }

  public void setArabicNumber(int arabicNumber) {
    this.arabicNumber = arabicNumber;
  }

  public int getArabicNumber() {
    return this.arabicNumber;
  }

  public void setRomanNumber(String romanNumber) {
    this.romanNumber = romanNumber;
  }

  public String getRomanNumber() {
    return this.romanNumber;
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