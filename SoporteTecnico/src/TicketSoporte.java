import java.time.LocalDate;

public class TicketSoporte {

    //Atributos
    private static int contador = 0;

    private int id;
    private String descripcion;
    private String estado;
    private LocalDate FechaCreacion;
    private Usuario usuario;
    private String tecnico;

//Constructores
    //Constructor sin usuario.

    public TicketSoporte(String descripcion){
        this.id = ++contador;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.FechaCreacion = LocalDate.now();
    }
    //Construcor con usuario.

    public TicketSoporte(String descripcion, Usuario usuario){
        this.id = ++contador;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.FechaCreacion = LocalDate.now();
        this.usuario = usuario;

    }

    //Metodo para cerrar el ticket

    public void cerrarTicket(){

        this.estado = "Cerrado";
    }

    //Metodo para mostrar detalle

    public String mostrarDetalle(){
        return "=== Detalle del ticket ===\n" +
                "ID: "+ id + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Estado: " + estado + "\n" +
                "Fecha de Creacion: " + FechaCreacion + "\n" +
                "Usuario: " + usuario + "\n" +
                "Tecnico : " + tecnico + "\n";

    }
    //Metoodo para asignarTecnico

    public void asignarTecnico(String tecnico){
        this.tecnico = tecnico;
    }

    public int getId(){
        return this.id;
    }

    public String getEstado(){
        return this.estado;
    }
}

