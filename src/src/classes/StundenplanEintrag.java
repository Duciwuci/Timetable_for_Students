package classes;

public class StundenplanEintrag {

  static int id;
  static String name;
  static boolean zufaellig;

  public StundenplanEintrag(int id, String name, boolean zufaellig) {
    this.id = id;
    this.name = name;
    this.zufaellig = zufaellig;
  }

  public static String leererEintragToString(int id) {
    return "Leer" + id;
  }

  public static String printAufbau() {
    return "name, id, random";
  }

  public String toString() {
    return name + ", " + id + ", " + zufaellig;
  }

}
