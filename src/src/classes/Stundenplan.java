package classes;

public class Stundenplan {

  private StundenplanEintrag[] eintraege;

  public Stundenplan(int anzahl) {
    this.eintraege = new StundenplanEintrag[anzahl];
  }

  public void eintragHinzufuegen(int id, String name, boolean zufaellig) {
    if(this.liefereFreierPlatz() < 0) {
      return;
    }
    this.eintraege[this.liefereFreierPlatz()] = new StundenplanEintrag(id, name, zufaellig);
  }

  public int liefereFreierPlatz() {
    for(int i = 0; i < this.eintraege.length; i++) {
      if(this.eintraege[i] == null) {
        return i;
      }
    }
    return -1;
  }

  public boolean platzVorhanden() {
    return !(this.liefereFreierPlatz() < 0);
  }

  public void printTable() {
    System.out.println(StundenplanEintrag.printAufbau());
    for(StundenplanEintrag eintrag : this.eintraege) {
      if(eintrag != null) {
        System.out.println(eintrag.toString());
      }
    }
  }

  private String getLineSeperator() {
    return "\r\n";
  }

  public String toString() {
    String toReturn = StundenplanEintrag.printAufbau() + this.getLineSeperator();
    for(StundenplanEintrag eintrag : this.eintraege) {
      if(eintrag != null) {
       toReturn +=  eintrag.toString() + this.getLineSeperator();
      }
    }
    return toReturn;
  }

}