
package ticketera;


class Producto {
    private double precio, cantidad;
    private String descripcion;

    public Producto(double precio, String descripcion,double cantidad) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getSubtotal() {
        return cantidad * precio;
    }

    public double getPrecio() {
        return precio;
    }


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
