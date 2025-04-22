public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoriaProducto;

    public Producto(String id,String nombre,double precio,int cantidad,CategoriaProducto categoriaProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaProducto = categoriaProducto;
    }

    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoriaProducto);
        System.out.println("--------------------------");
    }
}
