package model;
public class Buchung {
    //Variablendeklaration
    String _zeitraum;
    int _gruppengroesse;
    Gruppenleiter _gruppenleiter;
    int _juengstesalter;
    Raum _raum;
    //Constructor 
    public Buchung(String zeitraum, int gruppengroesse, Gruppenleiter gruppenleiter, int juengstesalter, Raum raum){
        setGruppengroesse(gruppengroesse);
        setRaum(raum);
        setZeitraum(zeitraum);
        setGruppenleiter(gruppenleiter);
        setJuengstesalter(juengstesalter);
    }
    

    /**
     * 
     * SETTER UND GETTER
     */
    public void setRaum(Raum raum) {
        this._raum = raum;
    }
    public void setGruppengroesse(int gruppengroesse) {
        this._gruppengroesse = gruppengroesse;
    }
    public void setZeitraum(String zeitraum) {
        this._zeitraum = zeitraum;
    }
    public void setGruppenleiter(Gruppenleiter gruppenleiter) {
        this._gruppenleiter = gruppenleiter;
    }
    public void setJuengstesalter(int juengstesalter) {
        this._juengstesalter = juengstesalter;
    }
    public int getGruppengroesse() {
        return _gruppengroesse;
    }
    public String getZeitraum() {
        return _zeitraum;
    }
    public Raum getRaum() {
        return _raum;
    }
    public Gruppenleiter getGruppenleiter() {
        return _gruppenleiter;
    }
    public int getJuengstesalter() {
        return _juengstesalter;
    }



}
