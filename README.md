Fortgeschrittene Programmierung (Java 2)

# Übung 9


Klonen Sie dieses Repository direkt in Eclipse und importieren Sie das Projekt. Legen Sie einen neuen Branch an, den Sie nach Ihrem GitHub-Benutzernamen benennen.


## Aufgabe 1

Machen Sie aus dem Projekt ein Maven-Projekt. Verwenden Sie dazu als `groupId` `idh.java` und als `artifactId` `exercise-09`, sowie die voreingestellte Versionsnummer `0.0.1-SNAPSHOT`.

Importieren Sie die Bibliothek [Apache Commons Collections](https://commons.apache.org/proper/commons-collections/) in Ihr Projekt. Apache Commons ist eine Sammlung verschiedener Java-Bibliotheken für verschiedene Zwecke, Commons Collections bietet Funktionen rund um Collections an. 

## Aufgabe 2

In der Bibliothek gibt es eine Klasse namens `TreeList`. Es handelt sich um eine Implementierung des `List`-Interfaces, das auf einem Baum basiert. Angeblich ist die Implementierung für Einfüge- und Lösch-Operationen besonders schnell. Das wollen wir in dieser Aufgabe überprüfen. 

Legen Sie eine neue Klasse im Package `idh.java` an, die Sie beliebig nennen können. In dieser Klasse wollen wir das folgende Experiment durchführen: Erzeugen Sie eine Liste mit 100000 Zufallszahlen. Fügen Sie dann, an zufälligen Stellen, 10000 weitere Zahlen ein. Messen Sie vor und nach dem Einfügen die Zeit und berechnen Sie die Dauer. Machen Sie dieses Experiment mit einer TreeList, einer LinkedList und einer ArrayList.

----

Wenn Sie fertig sind, committen Sie alle Ihre Änderungen, und pushen Sie den neuen Branch auf das remote namens `origin` (= GitHub). 