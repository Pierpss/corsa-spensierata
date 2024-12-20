import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int lunghezzaPercorso = sc.nextInt();

        String Percorso [] = {"strada", "buca", "muro", "piscina"};

        Random scelta = new Random();

        ArrayList <String> percorsoGenerato = new ArrayList<>();

        for (int i = 0; i < lunghezzaPercorso; i++) {
            int indicePercorso = scelta.nextInt(4);
            String ostacoloPescato = Percorso[indicePercorso];
        }
    }
}
