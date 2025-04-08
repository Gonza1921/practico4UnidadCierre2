import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad>=18){
            System.out.println("Usted es adulto.");
        }else {
            if (edad>=13 && edad<=17){
                System.out.println("Usted es adolecente.");
            }else {
                if (edad>=0 && edad<=12){
                    System.out.println("Usted es un niño.");
                }
            }
        }


        
    }
}
