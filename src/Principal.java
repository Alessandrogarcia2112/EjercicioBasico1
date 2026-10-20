import java.util.Scanner;

public class Principal {
    static void main(){
        int limite_inf = 0;
        int limite_sup = 0;
        int numero = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("Introduce un número (se establecerá como límite inferior): ");
        limite_inf = a.nextInt();
            if (limite_inf<=0) {
                System.out.println("Número introducido debe ser mayor que 0");
            }else {
                Scanner b = new Scanner(System.in);
                System.out.println("Introduce un número (se establecerá como límite superior): ");
                limite_sup = b.nextInt();
                if (limite_inf >= limite_sup) {
                    System.out.println("El segundo número debe ser mayor que el límite inferior");
                } else {
                    Scanner c = new Scanner(System.in);
                    System.out.println("Introduce un número cualquiera: ");
                    numero = c.nextInt();
                    if (limite_inf<=numero && limite_sup>=numero) {
                        System.out.println("Número entre limites");
                    }else {
                        System.out.println("Número fuera de límites");
                    }
                }
            }
    }
}