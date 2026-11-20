import java.util.Scanner;

public class Envio {

    public static void main(String[] args) {

        int PESO1 = 3;
        int PESO2 = 5;
        int PESO3 = 10;
        double ENVIO_I = 7.5;
        double preu_tot = 0;
        int preu_base = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce peso en kg: ");
        double peso = sc.nextDouble();

        if (peso < 1) {
            preu_tot += PESO1;
            preu_base = PESO1;
        } else if (peso >= 1 && peso <= 5) {
            preu_tot += PESO2;
            preu_base = PESO2;
        } else {
            preu_base = PESO3;
            preu_tot += PESO3;
        }

        sc.nextLine();
        System.out.print("Es un envio internacional: (s/n) ");
        String respuesta = sc.nextLine();
        System.out.println("Precio base por " + peso + " kg: " + preu_base);

        if (respuesta.equals("s")) {
            preu_tot += ENVIO_I;
            System.out.println("Suplemento de envio internacional: " + ENVIO_I); // (cortado a la derecha)
        }

        System.out.println("Total: " + preu_tot);
        sc.close();
    }
}