//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Pruducto> void main(String[] args) {

        //1.Agregar cinco productos con distintas categorías al inventario
        Producto p1 = new Producto("01","Arroz",150.0,100,CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("02","Televisor",100000.0,10,CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("03","Remera",8000.0,20,CategoriaProducto.ROPA);
        Producto p4 = new Producto("04","Sofa",50000.0,5,CategoriaProducto.HOGAR);
        Producto p5 = new Producto("05","Heladera",200000.0,8,CategoriaProducto.ELECTRONICA);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //2.Mostrar el total de stock disponible.
        inventario.obtenerTotalStock();
        System.out.println("------------------------");

        //3.Obtener el producto con mayor stock y mostrarlo.
        inventario.obetenerProductoConMayorStock();
        System.out.println("------------------------");

        //4. Filtrar productos con precios entre $5000 y $60000.
        System.out.println(" === Los productos que tenemos dentro del rango que establecio  ===");
        inventario.filtrarProductosPorPrecio(5000.0,60000.0);
        System.out.println("------------------------");

        //5.Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();




    }
}