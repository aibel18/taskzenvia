import java.util.EnumSet;

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
  private char letter;

  public static final EnumSet<RomanLetter> all = EnumSet.allOf(RomanLetter.class);

  RomanLetter(int number) {
    this.number = number;
    this.letter = this.name().charAt(0);
  }

  public int number() {
    return this.number;
  }

  public char letter() {
    return this.letter;
  }

  public static RomanLetter valueOf(char letter) {
    return all.stream().filter(l -> l.letter == letter).findAny().orElse(null);
  }

  public static String printAll() {
    return all.toString();
  }
}