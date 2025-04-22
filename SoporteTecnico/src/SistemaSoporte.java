import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {

    private List<TicketSoporte> tickets;

    public SistemaSoporte(){
        this.tickets = new ArrayList<>();
    }

    public void crearTicket (String descripcion, Usuario usuario){
        TicketSoporte nuevoTicket = new TicketSoporte(descripcion,usuario);
        tickets.add(nuevoTicket); //Va a agregar el elemento que le llegue a nuevoTicker y lo almacena en el final de la lista.
    }

    public void asignarTecnicoATicket(int ticketId, Tecnico tecnico){
        for (TicketSoporte t : tickets){
            if (t.getId() == ticketId){
                t.asignarTecnico(tecnico.toString());
                break;
            }
        }
    }

    //metodo para listar todos los tickets abiertos
    public void listarTicketsAbiertos(){
        System.out.println("=== Tickets Abiertos ===");

        for(TicketSoporte t : tickets){
            if ("Abierto".equals(t.getEstado())){
                System.out.println(t.mostrarDetalle());

            }
        }
    }

    public void listarTicketsCerrados(){
        System.out.println("=== Tickets Cerrados === ");

        for (TicketSoporte t : tickets){
            if("Cerrado".equals(t.getEstado())){
                System.out.println(t.mostrarDetalle());
            }
        }
    }

    public void listarTodosLosTickets(){
        System.out.println("=== Todos los tickets ===");
        for(TicketSoporte t : tickets){
            System.out.println(t.mostrarDetalle());
        }
    }

    @Override
    public String toString() {
        return "SistemaSoporte{" +
                "tickets=" + tickets.size() +
                '}';
    }
}
