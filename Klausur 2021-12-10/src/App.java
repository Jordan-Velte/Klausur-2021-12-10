import controller.MainController;

public class App {
    public static void main(String[] args) throws Exception {
        MainController mc = new MainController();
        mc.demobooking();
        mc.demoGruppenleiter();
        mc.showdemobooking();
        mc.checkbookingage();
    }
}


/*
Antwort auf E-Mail: 
Sehr geehrte Damen und Herren, 
im Folgenden erkläre ich Ihnen meine aufgesetzte Struktur für Ihren Auftrag.

Zunächst ist auf die MVC Struktur einzugehen, welchen den konzeptionellen Grundrahmen des Programms darbietet. Die verschiedenen Klassen sind hierbei in Ordnern unterteilt. In dem Model findet Sie üblichen Klassen, die Sie evtl. aus Ihren eigenen Programmen aus der Freizeit kennen --> hier wurden also alle objektorientierten Klassen erstellt, die in gewissermaßen die Realität abbilden sollen. Man könnte jenen Ordner somit auch als Input-Ordner betrachten. Der view-Ordner inklusive Output-Klasse gibt die Daten über eine Paremeterübergabe des Datentyps String aus (sozusagen der Output). Der Controller steht genau an der Schnittstelle jener beiden MVC-Konstrukte (siehe import!), sodass im Controller sowohl die Daten des Models überprüft, verglichen, etc. verglichen werden, bzw. die Instanzen erstellt werden und jene Daten des Modells der Ausgabemethode der Output-Klasse als Paremeter übergeben werden, was den Controller (=Steuerungselement), als Hauptschnittstelle zwischen Model und View untermalt. Somit herrscht niemals eine Interaktion zwischen Model und View, bzw. gilt eine Trennung zwischen dem Sehen, Speichern und Verbinden! Zentrale Vorteile sind u.a. die Unabhängigkeit der einzelnen Elemente der Ornder, sowie eine entsprechend größere Flexibilität.

Auf Basis jener Erklärung ist nun auf die einzelnen Inhalte der Ordner genauer einzugehen.

MODEL
Die gewünschten Räume habe ich für Sie als eine Klasse implementiert, da mir mehrere gemeinsame Variablen und Datentypen als Eigenschaften der von Ihnen genannten Räume aufgefallen sind. Diese werden somit als Instanzen der Klasse Raum in den Demodaten erstellt (vgl. Controller). Die Gruppenleiter werden zudem als Klasse implementiert --> so können wir theoretisch die Gruppenleiter einzeln in einer ArrayList ausgeben (mein Vorschlag an Sie :)!). 
In der Buchung wurden die von Ihnen gewünschten Variablen /u.a. auch die Klasse Gruppenleiter und Raum) deklariert. 

CONTROLLER
Im Controller finden Sie die initialisierten Demodaten, welche einer ArrayList hinzugefügt werden. Dies ist insbesondere dann nützlich, wenn man eine For-Each-Schleife in einer Dienstleistungsmethode nutzt, um einzelne Bedingungen an unterschiedlichen Elementen der ArrayList relativ einfach abfragen zu können (bzw. auszugeben).

VIEW
In der Output-Klasse habe ich eine Dienstleistungsmethode implementiert, welche den übergebenen String-Parameter in der Konsole für Sie ausgibt. Die diesbezügliche Parameterübergabe findet wie gesagt in dem Controller statt.

App.java
Durch das Erstellen einer Instanz des MainControllers werden die einzelnen Dienstleistungsmethoden per Punktnotation an der respektiven Instanz aufgerufen --> das Programm "läuft" dann, wenn Sie so wollen! Dieses Verfahren ist besonders nützlich, da so der Start eines Programmes relativ leicht umstrukturiert werden kann, bzw. einzelne Dienstleistungsmethoden individuell betrachtet/verändert werden können, ohne den Ablauf des restlichen Programms zu hindern. So sind langfristig Anpassungen möglich, die ich hoffentlich weiterhin als Ihr Ansprechpartner für Sie berücksichigen kann. 

Ich freue mich auf eine erfolgreiche weitere Zusammenarbeit!

Viele Grüße und ein schönes Wochenende
Jordan Velte

*/

/*
Klausur: 
Sehr geehrte Damen und Herren,
erstellen Sie bitte eine Buchungssoftware, die folgende Räume abbildet:
Raum 1 – Breaking Bad, max. vier Personen, Schwierigkeitsgrad eins, Lösung: Schlüssel steckt im
Zündschloss, Dauer 90 Minuten, Mindestalter 12
Raum 2 – Walking Dead, max. sechs Personen, Schwierigkeitsgrad drei, Lösung: Schlüsselkarte in der
Brust der Leiche Nr. 2, Dauer 120 Minuten, Mindestalter 14
Raum 3 – Squid Game, max. vier Personen, Schwierigkeitsgrad zwei, Lösung: Schlüssel ist in der
schwarzen Maske, Dauer 90 Minuten, Mindestalter 18
Raum 4 –American Horror Story, max. sechs Personen, Schwierigkeitsgrad zwei, Lösung: Im linken
Schuh der Leiche auf dem Sofa, Dauer 140 Minuten, Mindestalter 18
Es sollen später Räume dazukommen! Die Buchung selbst soll die folgenden Infos speichern: Zeitraum
(z.B. 13.09.2021, 12 Uhr), Gruppengröße, Gruppenleiter (Vor- und Nachname einzeln), Raum (direkte
Verbindung zum entsprechenden Raum), Alter des jüngsten Teilnehmers. (AFII 30%)
Toll wäre auch, wenn Sie uns in die Struktur der Software einweihen könnten und uns erläutern, wie
das alles funktioniert – vielleicht als Kommentar im Quellcode J ! Dabei würden wir auch gern,
sollten Sie sie nutzen, ein paar Fachbegriffe erläutert bekommen (wir programmieren manchmal
nämlich auch, sind aber sicher nicht so gut wie Sie J )! (AFI 20%)
Bitte erstellen Sie als erste Übersicht für jeden Raum mindestens zwei Demobuchungen, welche in der
Konsole ausgegeben werden! (AFI 10%, AFII 10%, AFIII 10%)
Da es bei uns manchmal drunter und drüber geht bitten wir Sie, bei der Buchung zu prüfen, wie alt
das jüngste Gruppenmitglied ist und ob das in der Altersbegrenzung des Raumes erlaubt ist. (AFIII
20%)
Wir freuen uns auf erste Programmvorschläge per Github! Unsere E-Mailadresse haben Sie ja J !
Vielen Dank
*/