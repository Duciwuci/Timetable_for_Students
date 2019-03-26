package classes;

public class Abgabetermin {

  public static void main(String... args) {
    Stundenplan plan = new Stundenplan(Integer.parseInt(args[0]));
    String[] seperated = args[1].split("-");
    System.out.println(seperated);
  }
}
