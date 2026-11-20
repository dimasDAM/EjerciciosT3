// Exercicis - Nivell avançat
// Exercici 6
// Una botiga ven banderes personalitzades de la màxima qualitat i ens ha demanat fer 
// un configurador que calcule el 
// preu segons alt i ample. 
// El preu base d'una bandera és d'un cèntim d'euro el centímetre quadrat. 
// Si la volem amb un escut brodat, el preu s'incrementa en 2,50 € independentment de l'escut. 
// Les despeses d'enviament són 3,25€. 
// L'IVA ja està inclòs a totes les tarifes.

// Exemple:

import java.util.Scanner;

public class Banderes {
    public static void main(String[] args) {

        final float PREU_BASE = 0.01f;
        final float ESCUT = 2.50f;
        final float ENVIO = 3.25f;
        float amplada = 0f;
        float alçada = 0f;
        float grandaria = 0f;
        float preuBandera = 0f;
        float total = 0f;
        

        Scanner sc = new Scanner(System.in);

        System.out.print( "\nIntroduïu l'alçada de la bandera en cm: ");
        alçada = sc.nextFloat();

        System.out.print("Ara introduïu l'amplada: ");
        amplada = sc.nextFloat();
        sc.nextLine(); //Vaciamos buffer despues de float
        System.out.print("Vol escut brodat? (s/n): ");
        String resposta = sc.nextLine();

        grandaria = alçada * amplada;
        preuBandera = grandaria * PREU_BASE;
        total = preuBandera + ENVIO;

        System.out.printf("%n%-25s %n","Gràcies. Aquí teniu el desglossament de la vostra compra.");
        String etiquetaBandera = String.format("Bandera de %.0f cm2:", grandaria);
        System.out.printf("%n%-25s %.2f $", etiquetaBandera, preuBandera);

        if (resposta == "s") {
            total = total + ESCUT;
            System.out.printf("%n%-25s %.2f %n", "Amb escut: ", ESCUT);
        } else {
            System.out.printf("%n%-25s %.2f $", "Sense escut: ", 0.0f);
        }
        System.out.printf("%n%-25s %.2f $", "Despeses d'enviament: ", ENVIO);
        System.out.printf("%n%-25s %.2f $%n%n", "Total: ", total);
        sc.close();
    }

}
