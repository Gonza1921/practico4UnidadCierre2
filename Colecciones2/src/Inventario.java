import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    public Producto buscarProductoPorId(String id){
        for (Producto p: productos){
            if(p.getId().equalsIgnoreCase(id)){
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            productos.remove(p);
            System.out.println("Producto eliminado correctamente. ");
        }else{
            System.out.println("Productoo no encontradoo. ");
        }
    }

    public void actualizarStock(String id,int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado. ");
        }else {
            System.out.println("Producto no encontrado. ");
        }
    }

    public void mostrarPorCategoria(CategoriaProducto categoria){
        for (Producto p: productos){
            if (p.getCategoria() == categoria){
                p.mostrarInfo();
            }
        }
    }


}
