import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

      public class Inventario {
          ArrayList<Producto> productos = new ArrayList<>();

          public void agregarProducto(Producto p) {
              productos.add(p);
          }

          public void listarProductos() {
              for (Producto p : productos) {
                  p.mostrarInfo();
              }
          }

          public Producto buscarProductoPorId(String id) {
              for (Producto p : productos) {
                  if (p.getId().equalsIgnoreCase(id)) {
                      return p;
                  }
              }
              return null;
          }

          public void eliminarProducto(String id) {
              Producto p = buscarProductoPorId(id);
              if (p != null) {
                  productos.remove(p);
                  System.out.println("Producto eliminado correctamente. ");
              } else {
                  System.out.println("Productoo no encontradoo. ");
              }
          }

          public void actualizarStock(String id, int nuevaCantidad) {
              Producto p = buscarProductoPorId(id);
              if (p != null) {
                  p.setCantidad(nuevaCantidad);
                  System.out.println("Stock actualizado. ");
              } else {
                  System.out.println("Producto no encontrado. ");
              }
          }

          public void mostrarPorCategoria(CategoriaProducto categoria) {
              for (Producto p : productos) {
                  if (p.getCategoria() == categoria) {
                      p.mostrarInfo();
                  }
              }
          }

          public void obtenerTotalStock() {
              int contadorProducto = 0;
              for (Producto p : productos) {
                  if (p != null) {
                      contadorProducto = contadorProducto + 1;
                  }
              }
              System.out.println("La cantidad de productos en el inventario es de: " + contadorProducto);
          }

          public void obetenerProductoConMayorStock() {
              if (productos.isEmpty()) {
                  System.out.println("No hay productos en el inventario. ");
              }

              Producto mayorStock = productos.get(0); //Asumimos que el primer producto es el mas grande y mayorStock "hereda" los atributos de p1

              for (Producto p : productos) {
                  if (p.getCantidad() > mayorStock.getCantidad()) {
                      mayorStock = p;
                  }
              }
              System.out.println("El producto con mayor stock es: ");
              mayorStock.mostrarInfo();
          }

          public void filtrarProductosPorPrecio(double min, double max) {

              for (Producto p : productos) {
                  if (p.getPrecio() >= min && p.getPrecio() <= max) {
                      p.mostrarInfo();
                  }
              }
          }

          public void mostrarCategoriasDisponibles() {
              System.out.println(" Categorias disponibles: ");
              for (CategoriaProducto categoria : CategoriaProducto.values()) {
                  System.out.println(" - " + categoria.name() + ": " + categoria.getDescripcion());
              }
          }
      }


