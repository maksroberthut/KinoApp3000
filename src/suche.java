import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class suche {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Malte\\Desktop\\Kino\\KinoListe.txt"));{

            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

            System.out.print ("Gib einen Begriff ein:");
            String eingabe = br1.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                if(line.contains(eingabe)) {
                    System.out.println ("Du kannst " +  line + " im Kino sehen");
                }
                if (!line.contains(eingabe)) {
                    System.out.println("Wir konnten kein Ergebnis für " + eingabe + " finden");
                }
            }				}													}
}