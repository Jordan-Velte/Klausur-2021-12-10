package model;

public class Raum {
    //Variablendeklaration
    String _name;
    int _maxpersonen;
    int _schwierigkeitsgrad;
    String _loesung;
    int _dauerinminuten;
    int _mindestalter;
    //Constructor 
    public Raum(String name, int maxpersonen, int schwierigkeitsgrad, String loesung, int dauerinminuten, int mindestalter){
        setDauerinminuten(dauerinminuten);
        setLoesung(loesung);
        setMaxpersonen(maxpersonen);
        setMindestalter(mindestalter);
        setName(name);
        setSchwierigkeitsgrad(schwierigkeitsgrad);
    }
    /**
     * 
     * SETTER UND GETTER
     */
    public void setDauerinminuten(int dauerinminuten) {
        this._dauerinminuten = dauerinminuten;
    }
    public void setLoesung(String loesung) {
        this._loesung = loesung;
    }
    public void setMaxpersonen(int maxpersonen) {
        this._maxpersonen = maxpersonen;
    }
    public void setMindestalter(int mindestalter) {
        this._mindestalter = mindestalter;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setSchwierigkeitsgrad(int schwierigkeitsgrad) {
        this._schwierigkeitsgrad = schwierigkeitsgrad;
    }
    public int getDauerinminuten() {
        return _dauerinminuten;
    }
    public String getLoesung() {
        return _loesung;
    }
    public int getMaxpersonen() {
        return _maxpersonen;
    }
    public int getMindestalter() {
        return _mindestalter;
    }
    public String getName() {
        return _name;
    }
    public int getSchwierigkeitsgrad() {
        return _schwierigkeitsgrad;
    }



}
