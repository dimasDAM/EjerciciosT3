import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        /// CONSTANTS
        double NATA = 2.50;
        double NOMBRE = 2.75;
        int PREU_NEGRE = 14;
        int PREU_BLANC = 15;
        int PREU_MADUIXA = 16;
        int PREU_POMA = 18;

        /// VARIABLES
        double total = 0; /// SU EXISTE ALGÚN double IMPLICADO EN LA OPERACIÓN
                          /// ESTA TAMBIÉN DEBER SER double
        double preuTipus = 0;
        String tipus_xoco = "";

        Scanner sc = new Scanner(System.in);


        ///// ELECCIONES Y CALCULOS ///////

        System.out.print("Trieu un sabor (poma, maduixa o xocolata): ");
        String tipus = sc.nextLine();

        if (tipus.equals("xocolata")) {
            System.out.print("Quin tipus de xocolata voleu? (negre o blanc): ");
            tipus_xoco = sc.nextLine();
            if (tipus_xoco.equals("negre")) {
                preuTipus = PREU_NEGRE;
                total = total + PREU_NEGRE;
            } else {
                preuTipus = PREU_BLANC;
                total = total + PREU_BLANC;
            }
        } else if (tipus.equals("maduixa")) {
            preuTipus = PREU_MADUIXA;
            total = total + PREU_MADUIXA;
        } else {
            preuTipus = PREU_POMA;
            total = total + PREU_POMA;
        }
        System.out.print("Vol nata? (si o no): ");
        String opcio = sc.nextLine();
        if (opcio.equals("si")) {
            total = total + NATA;
        }
        System.out.print("Voleu posar-hi un nom? (si o no): ");
        String nombre = sc.nextLine();
        if (nombre.equals("si")) {
            total = total + NOMBRE;
        }

        ///// RESUMEN DE COMPRA
        //// TIPO TARTA
        if (tipus.equals("xocolata")) {
            System.out.println("Pastís de " + tipus + " " + tipus_xoco + ": " + preuTipus + "€");
        } else {
            System.out.println("Pastís de " + tipus + ": " + preuTipus + "€");
        }
        ////CON O SIN NATA
        if (opcio.equals("si")) {
            System.out.println("Amb nata: " + NATA + "€");
        }
        ///CON O SIN NOMBRE
        if (nombre.equals("si")) {
            System.out.println("Amb nom: " + NOMBRE + "€");
        }
        ///TOTAL
        System.out.println("Total: " + total + "€");
        sc.close();
    }
}