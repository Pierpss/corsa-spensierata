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

        // Contatore array
        int contatoreArray = 0;

        // Ostacoli
        String ostacoli[] = { "strada", "buca", "muro", "piscina" };

        // Azioni da fare
        String azioni[] = { "corri", "salta", "arrampicati", "nuota" };

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
        System.out.println();
        int turno = 0;

        // Esce fuori dal while una volta finito tutti gli ostacoli
        while (lunghezzaPercorso != contatoreArray) {
            // Mostro il turno
            System.out.println("Turno n" + (turno + 1));
            // Creo un azione casuale
            int sceltaAzioni = scelta.nextInt(azioni.length);
            String azionepresa = azioni[sceltaAzioni];
            // Mostro l'azione
            System.out.println("l'azione presa per " + percorsoGenerato.get(contatoreArray) + " è " + azionepresa);

            // Controllo se l'azione è giusta
            if (percorsoGenerato.get(contatoreArray).equals("strada") && azionepresa.equals("corri")) {
                System.out.println("Il giocatore corre lungo la strada e supera l'ostacolo");
                contatoreArray++;
            } else if (percorsoGenerato.get(contatoreArray).equals("buca") && azionepresa.equals("salta")) {
                System.out.println("Il giocatore salta il buco e supera l'ostacolo");
                contatoreArray++;
            } else if (percorsoGenerato.get(contatoreArray).equals("muro") && azionepresa.equals("arrampicati")) {
                System.out.println("Il giocatore si arrampica sul muro e supera l'ostacolo");
                contatoreArray++;
            } else if (percorsoGenerato.get(contatoreArray).equals("piscina") && azionepresa.equals("nuota")) {
                System.out.println("Il giocatore nuota nella piscina e supera l'ostacolo");
                contatoreArray++;
            } else {
                System.out.println("Azione sbagliata, prova di nuovo!");
            }
            // Aumento il conteggio del turno
            turno++;
        }
        sc.close();
    }
}
