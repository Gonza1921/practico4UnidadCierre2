import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;

        System.out.println("Ingrese su nombre: ");
        nombre= scanner.next();

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.next();

        System.out.println("Su nombre completo es: "+nombre +apellido);




    }
}
