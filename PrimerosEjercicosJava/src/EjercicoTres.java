import java.util.Scanner;

public class EjercicoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        int operacion;
        int suma;
        int resta;
        int multiplicacion;
        double divicion;


        System.out.println("Ingrese un numero: ");
        n1= scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        n2= scanner.nextInt();

        System.out.println("Ingrese que operacion matematica desea hacer: \n" +
                "1.Suma \n" +
                "2.Resta \n" +
                "3.Multiplicacion \n" +
                "4.Divicion \n ");

        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        divicion = n1 / n2;

        operacion = scanner.nextInt();

        if (operacion == 1){
            System.out.println("El resultado de la operacion SUMA es: " +suma);
        } else{
            if (operacion == 2){
                System.out.println("El resultado de la operacion RESTA es: " +resta);
            }else {
                if (operacion == 3){
                    System.out.println("El resultado de la operacion MULTIPLICACION es: " +multiplicacion);
                }else {
                    if (operacion == 4){
                        System.out.println("El resultado de la operacion DIVICION es: " +divicion);
                    }
                }
            }
        }
















    }
}
