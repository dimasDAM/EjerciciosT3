import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {

        //////// CONSTANTES /////////////:

        double TRAM1 = 0.25; // Impuestos sobre los siguientes 400€ despues de 500
        double TRAM2 = 0.45; // Impuestos sobre lo que pase de 900€
        int HORAS_NORMALES = 35;

        ////VARIABLES////

        double impostosTotal = 0;
        double salariNet = 0;
        double salarioExtrasBrutas = 0;
        double impostosTram1 = 0;
        double impostosTram2 = 0;

        ///////// Pedimos datos e iniciamos variables

        Scanner sc = new Scanner(System.in);

        System.out.println("Introuïx el nom: ");
        String nom = sc.nextLine();

        System.out.println("Introuïr hores treballades: ");
        double horas = sc.nextDouble();
        System.out.println("Introuïr tarifa per hora: ");
        double tarifa = sc.nextDouble();

        //////////// Cálculos y variables

        double precioExtra = 1.5 * tarifa;
        double horasExtras = (horas - HORAS_NORMALES);
        double salariBrutSenseExtras = tarifa * HORAS_NORMALES;

        ///////// Horas extras

        if (horasExtras > 0) {
            salarioExtrasBrutas = horasExtras * precioExtra;
        } else {
            horasExtras = 0; // Nos aseguramos que si se trabajan menos de 35h las hora se queden a 0
        }

        double brutTotal = salariBrutSenseExtras + salarioExtrasBrutas; // Calculamos bruto Total

        /////// Impuestos por tramo

        if (brutTotal > 500 && brutTotal < 900) { // Si está entre 500 y 900
            impostosTram1 = (brutTotal - 500) * TRAM1; // Le restamos el tramo libre y le aplicamos impuestos a los 400

        } else if (brutTotal > 900) { // Si es mayor de 900 tenemos que sacar los tramos de 400 y de 900

            impostosTram2 = (brutTotal - 900) * TRAM2; // Aplicamos impuestos a lo que sobrepase de 900
            impostosTram1 = 400 * TRAM1; // Si es mayor a 900 el tramo de 400 es entero si o si
        }
        impostosTotal = impostosTram2 + impostosTram1;

        //// Salidass por pantalla

        salariNet = brutTotal - impostosTotal;


        /////////// Alinear texto ///////////////
        ///
        /// %-14s
        // (-)Justificado a la izquierda [sin - a derecha]
        // (14) N caracteres que se desplaza
        // (s)Cadena de texto
        // (.2) Precision o cantidad de decimales
        // (f) Double, (s) String, (d) Int, (b) boolean
        //
        ///// LA ESTRUCTURA DEBE COINCIDIR CON LO QUE QUEREMOS MOSTRAR
        System.out.printf("%n%-14s %s%n", "Nom:", nom);
        System.out.printf("%-14s %.2f \u20AC%n", "Salari Brut:", brutTotal);
        System.out.printf("%-14s %.2f €%n", "Impostos:", impostosTotal);
        System.out.printf("%-14s %.2f €%n%n", "Salari Net:", salariNet);

        sc.close();
    }
}
