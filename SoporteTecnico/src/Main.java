//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ===== KATA 1.1 ===== //
        //Creo el ticket
        TicketSoporte ticket1 = new TicketSoporte("No puedo acceder al sistema");
        //Muestro el ticket
        System.out.println(ticket1.mostrarDetalle());
        //Cierro ticket
        ticket1.cerrarTicket();
        //Muestro el estado actual
        System.out.println(ticket1.mostrarDetalle());

        // ===== KATA 1.2 ===== //
        //Creo un usuario
        Usuario usuario1 = new Usuario(2,"Gonzalo Fracchia","gonzifracchia@gmail.com");
        //Creo un ticket asociado a este usuario
        TicketSoporte ticket2 = new TicketSoporte("No se puede acceder al sistema", usuario1);
        //Asigno a un tecnino
        ticket2.asignarTecnico("Tenico Mario");
        //Muestro los detalles
        System.out.println(ticket2.mostrarDetalle());
        //Cierro el ticket
        ticket2.cerrarTicket();
        //Muesto los detalles luego de haber cerrado el ticket
        System.out.println(ticket2.mostrarDetalle());

        // ===== KATA 1.3 ===== //

        //Creo una instacia del sistema de soporte

        SistemaSoporte sistema = new SistemaSoporte();

        //Creo dos usuarios
        Usuario usuario2 = new Usuario(3,"Gonzalo Fracchia","gonzifracchia@gmail.com");
        Usuario usuario3 = new Usuario (4,"Laura Gomez","laura@gmail.com");

        //Creo dos tickets de estos respectivos usuarios

        sistema.crearTicket("No se puede acceder al sistema",usuario2);
        sistema.crearTicket("Error al imprimir documentos",usuario3);

        //Creo dos tecnicos
        Tecnico tecnico2 = new Tecnico(2,"Mario","Redes");
        Tecnico tecnico3 = new Tecnico (3,"Carlos","Hardware");

        //Asigno a cada tecnico a tu ticker especifico
        sistema.asignarTecnicoATicket(3,tecnico2);
        sistema.asignarTecnicoATicket(4,tecnico3);

        System.out.println("Listado de tickets abiertos: ");
        sistema.listarTicketsAbiertos();

        System.out.println(sistema.toString());





    }
}