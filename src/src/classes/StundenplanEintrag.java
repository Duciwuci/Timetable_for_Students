package classes;

public class StundenplanEintrag {

  private int id;
  private String name;
  private boolean zufaellig;

  public StundenplanEintrag(int id, String name, boolean zufaellig) {
    this.id = id;
    this.name = name;
    this.zufaellig = zufaellig;
  }

  // nochmal überdenken
  public static String leererEintragToString(int id) {
    return id + ";;false";
  }

  public static String printAufbau() {
    return "name;id;random";
  }

  public String toString() {
    return this.name + ";" + this.id + ";" + this.zufaellig;
  }

}
