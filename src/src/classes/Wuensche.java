package classes;

import java.util.Arrays;

public class Wuensche {

  private Wunsch[] wuensche;

  public Wuensche(int anzahl) {
    this.wuensche = new Wunsch[anzahl];
  }

  public void alleBesitzerEntfernen(String besitzer) {
    for(int i = 0; i < wuensche.length; i++) {
      if (wuensche[i].getBesitzer().equals(besitzer)) {
        wuensche[i] = null;
      }
    }
  }

  public void alleWuenscheEntfernen(int wunschId){
    for(int i = 0; i < wuensche.length; i++) {
      if (wuensche[i].getWunschId() == wunschId) {
        wuensche[i] = null;
      }
    }
  }

  public Wunsch naechsterEinmaligerWunsch() {
    Wunsch einmalig = null;
    int store = 0;
    einmalig = wuensche[store];
    for(int i = 0; i < wuensche.length; i++) {
      if(einmalig.getWunschId() == wuensche[i].getWunschId() && i != store) {
        store++;
        i = 0;
        if(store >= wuensche.length) {
          return null;
        }
        einmalig = wuensche[store];
      }
    }
    return einmalig;
  }

  public Wunsch naechsterWunsch() {
    for (Wunsch wunsch : wuensche) {
      if(wunsch != null) {
        return wunsch;
      }
    }
    return null;
  }

  public String[] wunschBesitzer(int wunschId) {
    String[] besitzer = new String[wuensche.length];
    int capacity = 0;
    for(int i = 0; i < wuensche.length; i++) {
      if(wuensche[i].getWunschId() == wunschId) {
        besitzer[capacity] = wuensche[i].getBesitzer();
        capacity++;
      }
    }
  return Arrays.copyOfRange(besitzer, 0, capacity - 1);
  }

  public void wunschHinzufuegen(String besitzer, int wunschId) {
    for(int i = 0; i < wuensche.length; i++) {
      if (wuensche[i] == null) {
        wuensche[i] = new Wunsch(besitzer, wunschId);
        return;
      }
    }
  }

  public boolean wunschVorhanden() {
    for (Wunsch wunsch : wuensche) {
      if (wunsch != null) {
        return true;
      }
    }
    return false;
  }

}
