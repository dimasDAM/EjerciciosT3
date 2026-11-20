import java.util.Scanner;

public class Adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina edat tens?");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Ets matjor d'edat");
        }
        else if (edad > 0 && edad < 18) {
            System.out.println("Ets menor d'edat");
        } 
        else {
            System.out.println("Error: edat inválida");
        }

        sc.close();
    }
}
