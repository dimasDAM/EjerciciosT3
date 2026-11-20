// Implementa el joc pedra, paper y tisora. 
// Primer, l'usuari 1 introdueix la seua jugada 
// després l'usuari 2.

//SALIDA

// Torn del jugador 1 (introdueix pedra, paper o tisora): paper
// Torn del jugador 2 (introdueix pedra, paper o tisora): paper
// // Empat
import java.util.Scanner;

public class Xoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Torn del jugador 1 (introdueix pedra, paper o tisora):  ");
        String jugada1 = sc.nextLine();
        System.out.print("Torn del jugador 2 (introdueix pedra, paper o tisora):  ");
        String jugada2 = sc.nextLine();

        if (jugada1.equals(jugada2)) {
            System.out.println("Empate");
        }

        switch (jugada1) {
            case "pedra":
                if (jugada2.equals("paper")) {
                    System.out.println("Guanya el jugador 2");
                } else if (jugada2.equals("tisora")) {
                    System.out.println("Guanya el jugador 1");
                }
                break;

            case "paper":
                if (jugada2.equals("tisora")) {
                    System.out.println("Guanya el jugador 2");
                } else if (jugada2.equals("pedra")) {
                    System.out.println("Guanya el jugador 1");
                }
                break;

            case "tisora":
                if (jugada2.equals("pedra")) {
                    System.out.println("Guanya el jugador 2");
                } else if (jugada2.equals("paper")) {
                    System.out.println("Guanya el jugador 1");
                }
                break;
        }
        sc.close();
    }
}
