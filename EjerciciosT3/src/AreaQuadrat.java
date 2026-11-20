import java.util.Scanner; 

public class AreaQuadrat {
    public static void main(String[] args) throws Exception {
        System.out.println("L'area d'un quadrat de 5m es = " + (5*5) + "m2" );
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el costat conegut: ");
        int costat = sc.nextInt();
        int area = costat * costat;
        System.out.println("El area d'un quadrat de costat " + costat + "es = " + area + "m2");
        sc.close();
    }
}