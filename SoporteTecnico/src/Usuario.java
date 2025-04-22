public class Usuario {

    //Atributos

    private int id;
    private String nombre;
    private String email;

    public Usuario(int id,String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
