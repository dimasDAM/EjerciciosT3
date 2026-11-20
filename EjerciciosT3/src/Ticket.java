import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// CONSTANTES

        /// Creamos un Map con CLAVE/VALOR para despues
        /// consultarlo y acceder a los dataos de su relacion
        /// 
        /// Con .put INTRODUCIMOS los valores.

        Map<String, Double> tipoBebida = new HashMap<>();
        tipoBebida.put("cafe", 1.2);
        tipoBebida.put("te", 1.0);
        tipoBebida.put("chocolate", 1.5);

        Map<String, Double> tipoBollo = new HashMap<>();
        tipoBollo.put("croisant", 1.1);
        tipoBollo.put("ensaimada", 1.4);
        tipoBollo.put("muffin", 0.9);

        final double LLEVAR = 0.25;

        /// VARIABLES

        String bebidaElegida = "";
        String bolloElegido = "";
        String paraLlevar = "";
        double precioBebida = 0.0;
        double precioBollo = 0.0;
        double total = 0.0;

        // .containsKey() BUSCA DIRECTAMENTE EN EL Map
        // .get("valor") accedemos al valor del Map que coincida
        // con nuestra consulta
        // .trim() quita espacios delante-detrás y mantiene los del centro
        // .toLowerCase() Convierte los caracteres del Strin a minusculas

        /// BEBIDA

        do {
            System.out.print("Escoge bebida (cafe, te o chocolate): ");
            bebidaElegida = sc.nextLine().trim().toLowerCase();
            if (tipoBebida.containsKey(bebidaElegida)) {
                precioBebida = tipoBebida.get(bebidaElegida);
                total += precioBebida;
            } else {
                System.out.println("Bebida no válida.");
            }
        } while (!tipoBebida.containsKey(bebidaElegida));

        /// BOLLERIA

        do {
            System.out.print("Escoge bolleria (croisant, ensaimada o muffin): ");
            bolloElegido = sc.nextLine().trim().toLowerCase();
            if (tipoBollo.containsKey(bolloElegido)) {
                precioBollo = tipoBollo.get(bolloElegido);
                total += precioBollo;
            } else {
                System.out.println("Bollería no válida,");
            }
        } while (!tipoBollo.containsKey(bolloElegido));

        /// SERVICIO
        do {
            System.out.print("Para llevar?(s/n)");
            paraLlevar = sc.nextLine().trim().toLowerCase();
            if (paraLlevar.equals("s")) {
                total += LLEVAR;
            } else if (paraLlevar.equals("n")) {
            } else {
                System.out.println("Respuesta no válida!");
            }

        } while (!(paraLlevar.equals("s"))
                && !(paraLlevar.equals("n")));

        /// RESUMEN PEDIDO

        System.out.println("Bebida escogida: " + bebidaElegida + " (" + precioBebida + "€)");
        System.out.println("Bollo escogido: " + bolloElegido + " (" + precioBollo + "€)");

        if (paraLlevar.equals("s")) {
            System.out.println("Cargo para llevar: " + " (" + LLEVAR + "€)");
        }

        System.out.println("Total: " + total + "€");
        sc.close();
    }

}
