public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Indumentaria y accesorios"),
    HOGAR("Articulos para el hogar");

    private final String descripcion;

    //constructor del enum
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
}

