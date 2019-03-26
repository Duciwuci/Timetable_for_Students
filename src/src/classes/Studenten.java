package classes;

public class Studenten {

  private String[] studenten;

  public Studenten(int anzahl) {
    studenten  = new String[anzahl];
  }

  public String liefereErstenStudent() {
    String student = null;
    for (String i : studenten) {
      if (i != null) {
        student = i;
        break;
      }
    }
    return student;
  }

  public void printListe() {
    for (String student : studenten) {
      if (student != null) {
        System.out.println(student);
      }
    }
  }

  public void studentEntfernen(String name) {
    for(int i = 0; i < studenten.length; i++) {
      if (studenten[i].equals(name)) {
        studenten[i] = null;
        break;
      }
    }
  }

  public boolean studentenVorhanden() {
    for (String student : studenten) {
      if (student != null) {
        return true;
      }
    }
    return false;
  }

  public void studentHinzufuegen(String name) {
    for(int i = 0; i < studenten.length; i++) {
      if(studenten[i].equals(name)) {
        return;
      }
    }
    for(int i = 0; i < studenten.length; i++) {
      if(studenten[i] == null) {
        studenten[i] = name;
      }
    }
  }

}
