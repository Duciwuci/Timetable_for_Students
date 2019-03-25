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
    int freierIndex = -1;
    for(int i = 0; i < studenten.length; i++) {
      if (studenten[i].equals(name)) {
        return;
      } else if(studenten[i] == null && freierIndex == -1) {
        freierIndex = i;
      }
    }
    if(freierIndex != -1) {
      studenten[freierIndex] = name;
    }
  }

}
