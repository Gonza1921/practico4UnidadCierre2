import java.util.Scanner;

public class ejercicioDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        int horasExtras;
        double precioHora;
        double finalSalario;
        double valorHoraExtra;

        System.out.println("Ingrese su salario: ");
        salario = scanner.nextDouble();

        precioHora = salario / 160;

        System.out.println("Ingrese la cantidad de horas extras trabajadas: ");
        horasExtras = scanner.nextInt();
        valorHoraExtra = horasExtras * 1.5;



        finalSalario = salario + (horasExtras * valorHoraExtra);

        System.out.println("Su salio final sera de: " +finalSalario);





    }
}
