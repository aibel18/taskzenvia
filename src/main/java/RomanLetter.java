/**
 * RomanLetter.class 
 *
 * content all characters allow to Roman number
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 *
 */

public enum RomanLetter {

  I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

  private int number;

  RomanLetter(int number) {
    this.number = number;
  }

  public int number() {
    return this.number;
  }

  public String letter() {
    return this.name();
  }
}