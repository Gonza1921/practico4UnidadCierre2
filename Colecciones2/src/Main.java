
public class Main {
    public static void main(String[] args) {


        //1.Agregar cuatro productos con distintas categorías al inventario
        Producto p1 = new Producto("01","Arroz",150.0,100,CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("02","Televisor",100000.0,10,CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("03","Remera",8000.0,20,CategoriaProducto.ROPA);
        Producto p4 = new Producto("04","Sofa",50000.0,5,CategoriaProducto.HOGAR);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        //2. Buscar un producto por su ID y mostrar su información.
        Producto encontrado = inventario.buscarProductoPorId("03");
        if (encontrado != null){
            encontrado.mostrarInfo();
        }else{
            System.out.println("Producto no encontrado. ");
        }
        // 3.Filtrar los productos que pertenezcan a la categoría ELECTRONICA y listarlos.
        inventario.mostrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 4. Eliminar un producto por su ID y listar los productos restantes.
        inventario.eliminarProducto("03");
        inventario.listarProductos();









    }
}