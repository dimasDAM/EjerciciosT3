import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduïr nota: ");
        double nota = sc.nextDouble();

        sc.close();

        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Error: nota inválida");
        } else if (nota >= 0 && nota < 3) {
            System.out.println("Molt deficient");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficient");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Bé");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota == 10) {
            System.out.println("Felicitats! Tens matrícula d'honor!");
        } else {
            System.out.println("Excel·lent");
        }
    }
}
