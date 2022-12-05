## Guida per l'esecuzione

### Prerequisiti

* JDK 11 o superiore (https://www.oracle.com/java/technologies/downloads/)
* SDK (https://gluonhq.com/products/javafx/)

### Istruzioni

1. Impostare il valore della variabile d'ambiente JAVA_HOME al percorso di installazione del JDK nel proprio PC (https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux)
2. Eseguire il seguente comando nel Prompt dei Comandi (Windows) o nel Terminale (Linux, MacOS)
```shell
java --module-path /path/to/sdk/lib --add-modules javafx.controls,javafx.fxml 
--enable-preview -jar /path/to/jar
```
* /path/to/sdk/lib è il percorso alla cartella lib (contenuta nel SDK) nel proprio PC
* /path/to/jar è il percorso al file jar nel proprio PC

**N.B.** Su Windows il /path/to/sdk/lib deve essere tra virgolette
