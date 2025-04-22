//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creando productos

       Producto p1 = new Producto("01","Arroz",150.0,100,CategoriaProducto.ALIMENTOS);
       Producto p2 = new Producto("02","Televisor",100000.0,10,CategoriaProducto.ELECTRONICA);
       Producto p3 = new Producto("03","Remera",8000.0,20,CategoriaProducto.ROPA);

       Inventario inventario = new Inventario();

       inventario.agregarProducto(p1);
      inventario.agregarProducto(p2);
      inventario.agregarProducto(p3);

        inventario.listarProductos();



    }
}