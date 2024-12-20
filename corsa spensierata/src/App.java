import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Dichiarazione scanner
        Scanner sc = new Scanner(System.in);
        
        // Dimensione percorso
        System.out.println("Scegli quanti ostacoli vuoi");
        int lunghezzaPercorso = sc.nextInt();
        
        // Ostacoli
        String ostacoli[] = { "strada", "buca", "muro", "piscina" };

        // Scelta con numeri casuali
        Random scelta = new Random();

        // Percorso generato
        ArrayList<String> percorsoGenerato = new ArrayList<>();

        // Creatore di percorso
        for (int i = 0; i < lunghezzaPercorso; i++) {
            int indicePercorso = scelta.nextInt(ostacoli.length);
            String ostacoloPescato = ostacoli[indicePercorso];
            percorsoGenerato.add(ostacoloPescato);
        }
        // Mostro il percorso
        for (int i = 0; i < percorsoGenerato.size(); i++) {
            System.out.print(percorsoGenerato.get(i) + " ");
        }


    }
}
