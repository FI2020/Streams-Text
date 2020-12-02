import java.io.*;
//Einlesen eines Inputstreams
public class Main {


    public static void main(String[] args) {
        //Instanzierung des File Objektes
        File testFile = new File("Test.txt");
        //Initialisierung und Deklarierung und String pipeline geschrieben
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Deklarisierung und Initialisierung vom BufferedWriter mit dem Wert "null"
        BufferedWriter bw = null;
        //Deklaration und initialisierung von der Benutzereingabe Aufforderung
        String eingabeText = "Bitte schreibe dein Name und dein Geuburtsdatum.";
        String input = "";
        //Zugriff auf das Dateisystem, "try-block" geschrieben um Exceptions abzufangen
        try {
             //Ausgabe von Benutzereingabe Aufforderung
             System.out.println(eingabeText);
             //Der String "input" wird mit dem BufferedReader mit der Methode "readLine" gefüllt
             input = br.readLine();
             //BufferedWriter Objekt wird erzeugt, in der Parameterliste wird ein FileWriter Objekt erzeugt und
             //ihm wiederum wird das FileObjekt übergeben
             bw = new BufferedWriter(new FileWriter(testFile));
             //Der BufferedWriter bekommt den Input übergeben.
             bw.write(input);
             // WICHTIG! an die Toilettenspülung dran denken, und danach die Streams "closen"
             bw.flush();
             bw.close();
             br.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
            br.close();
            bw.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
