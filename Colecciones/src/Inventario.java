import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void listarProductos(){
        for(Producto p : productos){
            p.mostrarInfo();
        }

    }
}
