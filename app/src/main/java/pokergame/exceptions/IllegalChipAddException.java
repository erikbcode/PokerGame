package pokergame.exceptions;

public class IllegalChipAddException extends Exception {

  private String message;

  public IllegalChipAddException(String string) {
    this.message = string;
  }

  public String getMessage() {
    return this.message;
  }
  
}
