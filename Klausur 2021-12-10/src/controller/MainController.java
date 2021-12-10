package controller;

import model.*;
import view.Output;
import java.util.ArrayList;

public class MainController {
    Output o = new Output();
    ArrayList<Raum> raum = new ArrayList<Raum>();
    ArrayList<Gruppenleiter> gruppenleiter = new ArrayList<Gruppenleiter>();
    ArrayList<Buchung> buchung = new ArrayList<Buchung>();
    public MainController(){
        Raum raum1 = new Raum("Breaking Bad", 4, 1, "Schlüssel steckt im Zündschloss", 90, 12);
        Raum raum2 = new Raum("Walking Dead", 6, 3, "Schlüsselkarte in der Brust der Leiche", 120, 14);
        Raum raum3 = new Raum("Squid Game", 4, 2, "Schlüssel ist in schwarzen Maske", 140, 18);
        Raum raum4 = new Raum("American Horror Story", 6, 2, "Im Schuh der Leiche auf dem Sofa", 140, 18);
        raum.add(raum1);
        raum.add(raum2);
        raum.add(raum3);
        raum.add(raum4);
    }
    public void demoGruppenleiter(){
        Gruppenleiter g1 = new Gruppenleiter("Jordan", "Velte");
        Gruppenleiter g2 = new Gruppenleiter("Test", "Friedrich");
        Gruppenleiter g3 = new Gruppenleiter("test2", "Heinz");
        gruppenleiter.add(g1);
        gruppenleiter.add(g2);
        gruppenleiter.add(g3);

    }

    //Für jeden Raum zwei Demo-Buchungen!
    public void demobooking(){
        Buchung buchung1 = new Buchung("12.12.2033, 12 Uhr", 13, gruppenleiter.get(0), 12, raum.get(0));
        Buchung buchung2 = new Buchung("10.11.2045, 12 Uhr", 10, gruppenleiter.get(0), 18, raum.get(0));
        Buchung buchung3 = new Buchung("10.12.2033, 12 Uhr", 13, gruppenleiter.get(1), 12, raum.get(1));
        Buchung buchung4 = new Buchung("9.12.2033, 12 Uhr", 14, gruppenleiter.get(0), 13, raum.get(1));
        Buchung buchung5 = new Buchung("8.12.2033, 12 Uhr", 10, gruppenleiter.get(2), 12, raum.get(2));
        Buchung buchung6 = new Buchung("7.12.2033, 12 Uhr", 11, gruppenleiter.get(0), 12, raum.get(2));
        Buchung buchung7 = new Buchung("1.12.2033, 12 Uhr", 12, gruppenleiter.get(1), 12, raum.get(3));
        Buchung buchung8 = new Buchung("2.12.2033, 12 Uhr", 5, gruppenleiter.get(2), 12, raum.get(3));
        buchung.add(buchung1);
        buchung.add(buchung2);
        buchung.add(buchung3);
        buchung.add(buchung4);
        buchung.add(buchung5);
        buchung.add(buchung6);
        buchung.add(buchung7);
        buchung.add(buchung8);

    }

    //Buchungen ausgeben
    public void showdemobooking(){
        for(Buchung buchung : buchung){
            o.printData(buchung.getZeitraum() + " " + buchung.getGruppengroesse() + " " + buchung.getGruppenleiter().getVorname() + " " + buchung.getGruppenleiter().getNachname() + " " + buchung.getJuengstesalter() + " " + buchung.getRaum().getName());
        }
    }

    //Buchungsalter überprüfen --> For-Each-Schleife mit If-Bedingung
    public void checkbookingage(){
        for(Buchung buchung : buchung){
            if(buchung.getJuengstesalter() >= buchung.getRaum().getMindestalter()){
                o.printData("Die Buchung im Escape Room " + buchung.getRaum().getName() + " erfüllt die Kriterien für das Mindesalter aller Gruppenmitglieder. Das jüngste Gruppenmitglied ist " + buchung.getJuengstesalter() + " Jahr alt.");
            }
            else{
                o.printData("Die Buchung im Escape Room " + buchung.getRaum().getName() + " erfüllt nicht die Kriterien für das Mindesalter aller Gruppenmitglieder. Das jüngste Gruppenmitglied ist " + buchung.getJuengstesalter() + " Jahr alt.");
            }
        }
    }

}
