import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Ingrese un numero: ");
        n1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        n2 = scanner.nextInt();

        if (n1 > 0 && n1>10 && n2 > 0 && n2 > 10){
            System.out.println("El numero: " + n1 +  " y el numero: " + n2 + " Son positivos mayores a 10.");

        }else{
            if (n1 > 0 && n1 < 10 && n2 > 0 && n2 <10){
                System.out.println("Ambos numeros: " + n1 + " y " + n2 + " ,son POSITIVOS ");
            }else{
                if (n1 < 0 && n2 < 0){
                    System.out.println("Ambos numeros: " + n1 + " y " + n2 + " ,NO son positivos ");
                }
            }
        }

    }
}
