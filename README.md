# 19-Abgabe04-Khair-Dietinger
- [x] edit README

## TO-DO

- [x] Übertragen Angabe Taskliste in Markdown Readme
- [x]  Einspielen Queue Vorlage aus Repository: https://github.com/michaelulm/softwareconfiguration-management/tree/master/test-automation/Queue
- [ ] Taskergebnisse Schritt für Schritt auf Git stellen
    - [ ] Führrung Taskliste
    - [ ] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B. Testfälle geschrieben so wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Repository übertragen.
- [x] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
    - [x] Es befinden sich gesamt 3 Fehler im Source Code.
    
    **Fehler 1:** einmal wird maxsize und einmal maxSize verwendet. Weiters wurde das "this" bei this.maxSize = maxSize vergessen.
      Außerdem wird maxsize bereits davor gesetzt, was bedeutet, dass es auch einen default constructor geben sollte, welcher keine           maxsize mitübergibt. ![alt text](https://github.com/Thesi3107/19-Abgabe04-Khair-Dietinger/blob/master/media/bug1.PNG "bug1")
      
    **line 34:** element könnte nur entfernt werden, wenn size gleich null ist, was keinen Sinn macht.![alt text](https://github.com/Thesi3107/19-Abgabe04-Khair-Dietinger/blob/master/media/bug2.PNG "bug2")
    
    **line 43-46:** String element wird gesetzt. poll wird element zugewiesen, anschließend wird element wieder auf null gesetzt. Daher       macht die anschließende Abfrage ob element gleich null ist, keinen Sinn, da das Element immer null ist. ![alt text](https://github.com/Thesi3107/19-Abgabe04-Khair-Dietinger/blob/master/media/bug3.PNG "bug3")
    
    
    - [x] Bei Bedarf Optimieren Sie das Queue Beispiel.
    
    Eine Main-Klasse wurde erstellt, welche einige Funktionen aufruft.
    
    - [x] Ergänzen Sie das Beispiel nach eigenen Ermessen um es testen zu können.
    
    Die StringQueueTest wurde mit Methoden zum Testen befüllt (Code Coverage 100%)
    
- [ ] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
    - [ ] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report. 
- [x] Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
    - [x] Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
    - [x] JavaDoc Kommentare erstellen.
    - [ ] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [x] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
    - [x] EntwicklerInnen Informationen hinzufügen.
    - [x] Integration Logging Bibliothek log4j mittels Maven Dependencies.
- [ ] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
    - [x] Siehe aktualisiertes Stack Beispiel.
    - [x] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
    - [x] Konfigurieren Sie Logger über ein properties File.
    - [x] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
    - [x] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
    - [ ] Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen.
- [ ] Maven Site Dokumentation erstellen
    - [x] Inklusive Javadoc Code und Javadoc Test Klassen
    - [x] Inklusive Menü mit Verweis auf manuell erstellte Seite
        - [x] Seite erläutert Funktionsweise Queue
    - [ ] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
    
    ![alt text] (https://github.com/Thesi3107/19-Abgabe04-Khair-Dietinger/blob/master/media/queue.PNG "Seite von Queue")
        - [ ] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein 
- [ ] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
    - [ ] Übertragung Information aus Labreport Template.
    - [ ] Alle Schritte dieser Übung nachvollziehbar erläutern.
    - [ ] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java Source Code korrekt darstellt.
    - [ ] Korrekturlesen Dokumentation
    - [ ] PDF erstellen (zB Dillinger)
- [ ] Überprüfung Vollständigkeit der Abgabe
- [ ] Abgabe PDF Version der Abgabe
- [ ] Sich freuen :)


----------------------------------------------------------------------------------------------------------------------------------------

Python Code:

````python
def hello_world():
    if True:
        print("hello world")
````
Java Code:
````java
public void hello_world() {
    if (true) {
        System.out.println("hello world");
    }
}
````
