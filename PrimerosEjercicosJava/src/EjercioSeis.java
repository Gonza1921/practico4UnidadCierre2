import java.util.Scanner;
public class EjercioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Ingrese un numero: ");
        n1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        n2 = scanner.nextInt();

        if (n1>n2){
            System.out.println(n1+ " Es mayor a " + n2);
        }else {
            if (n1<n2){
                System.out.println(n2+ " Es mayor a " +n1);
            }else {
                System.out.println("Los numeros ingresados son iguales.");
            }
        }


    }
}
