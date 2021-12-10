package model;

public class Gruppenleiter {
    //Variablendeklaration
    String _vorname;
    String _nachname;
    
    //Constructor 
    public Gruppenleiter(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }
    /**
     * 
     * SETTER UND GETTER
     */
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }
}
