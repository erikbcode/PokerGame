package pokergame.exceptions;

public class InsufficientBankrollException extends Exception {
  
  private String message;

  public InsufficientBankrollException(String string) {
    this.message = string;
  }

  public String getMessage() {
    return this.message;
  }
}
