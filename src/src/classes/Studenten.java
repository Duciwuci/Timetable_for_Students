package classes;

import java.util.ArrayList;
import java.util.List;

public class Studenten {

  private List<String> studenten = new ArrayList<>();

  public Studenten(int anzahl) {
    for(int i = 0; i < anzahl; i++) {
      // adding studentes here
    }
  }

  public String liefereErstenStudent() {
    return studenten.isEmpty() ? null : studenten.get(0);
  }

  public void printListe() {
    if(studenten.isEmpty()) {
      return;
    }
    for (String student : studenten) {
      System.out.println(student);
    }
  }

  public void studentEntfernen(String name) {
    studenten.remove(studenten.indexOf(name));
  }

  public boolean studentenVorhanden() {
    return !studenten.isEmpty();
  }

  public void studentHinzufuegen(String name) {
    if(studenten.indexOf(name) < 0) {
      studenten.add(name);
    }
  }

}
