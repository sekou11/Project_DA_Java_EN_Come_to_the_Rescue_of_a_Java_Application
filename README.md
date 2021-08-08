Dans un répértoire racine contenant:

Au moins les fichiers suivant:

> git ls -R .
.:
README.md  result.out  src  symptoms.txt

./src:
com

./src/com:
hemebiotech

./src/com/hemebiotech:
analytics

./src/com/hemebiotech/analytics:
AnalyticsCounter.java  NumberOfOccurrences.java         WriteSymptoms.java
ISymptomReader.java    ReaderSymptomsDataFromFile.java

pour compiler
src : les sources bin : Les classes générées

pour vérifier l'existance de java

> java -version
Dans le répértoire racide de src, il y a au moins ce README.md et symptoms.txt et le répertoire src

Environnement windows
Compiler
> javac -d .\bin\ -cp .\src .\src\com\hemebiotech\analytics\AnalyticsCounter.java
Tester
Lancer le programme si tous va bien

java -cp .\bin\ com.hemebiotech.analytics.AnalyticsCounter

Environnment Linux

Compiler
> javac -d bin/ -cp src/ ./src/com/hemebiotech/analytics/AnalyticsCounter.java

Tester
Lancer le programme si tous va bien

> java -cp bin/ com.hemebiotech.analytics.AnalyticsCounter ./symptoms.txt
