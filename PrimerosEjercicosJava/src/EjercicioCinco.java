import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Ingrese un numero: ");
        n = scanner.nextInt();

        if (n>=0){
            System.out.println("El numero: " + n + " Es positivo ");
        }else{
            System.out.println("El numero: " + n + " Es negativo ");

        }


    }
}
