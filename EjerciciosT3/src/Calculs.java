import java.util.Scanner;

public class Calculs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dona'm el primer nombre: ");
        double a = sc.nextDouble();

        System.out.println("Dona'm el segon nombre: ");
        double b = sc.nextDouble();

        sc.close();

        System.out.println("La suma es = " + (a + b));
        System.out.println("La resta es = " + (a - b));
        System.out.println("El producte es = " + (a * b));
        
        if (a == 0 || b == 0) {
            System.out.println("No es pot dividir per 0");
        } else
            System.out.println("La divisio es = " + (a / b));
    }

}
