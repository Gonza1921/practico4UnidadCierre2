//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(1,"Gonzalo","Programador",70000 );
        Empleado e2 = new Empleado("Franco","Diseñadora");


        e1.actualizarSalario(10.0);
        e2.actualizarSalario(5000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Total empleados: "+ Empleado.mostrarTotalEmpleados());


    }
}