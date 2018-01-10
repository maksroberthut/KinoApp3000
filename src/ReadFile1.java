import java.io.*;

class ReadFile1 {

    public static void main(String[] args) {

        try{
            BufferedReader bReader = new BufferedReader(new FileReader("test.txt"));


            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Gib einen Begriff ein: ");
            String eingabe = br.readLine();


            String sZeile = bReader.readLine();
            while(sZeile != null){
                sZeile = bReader.readLine();
                if (sZeile.contains(eingabe)){
                    System.out.println(sZeile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
