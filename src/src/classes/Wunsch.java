package classes;

public class Wunsch {

  private String besitzer;
  private int wunschId;

  public Wunsch(String besitzer, int wunschId) {
    this.besitzer = besitzer;
    this.wunschId = wunschId;
  }

  public int getWunschId() {
    return wunschId;
  }

  public String getBesitzer() {
    return besitzer;
  }
}
