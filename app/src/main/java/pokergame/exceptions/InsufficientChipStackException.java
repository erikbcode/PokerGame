package pokergame.exceptions;

public class InsufficientChipStackException extends Exception {
  
  private String message;

  public InsufficientChipStackException(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }
}
