import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();
        double suma = a + b;
        System.out.println("Resultado: " + suma);
        sc.close();
    }
}

