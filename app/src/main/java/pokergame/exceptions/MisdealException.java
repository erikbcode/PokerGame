package pokergame.exceptions;

public class MisdealException extends RuntimeException {
  private String message;

  public MisdealException(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }
}
