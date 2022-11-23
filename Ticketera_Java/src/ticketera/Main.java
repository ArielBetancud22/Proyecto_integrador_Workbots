
package ticketera;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {
    public static Producto solicitarProducto() {
        
        String descripcion = JOptionPane.showInputDialog("Ingresa descripcion: ");
        double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
        double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa precio: "));
        
        return new Producto(precio, descripcion, cantidad);
    }

    public static void agregarProducto(ArrayList<Producto> productos) {
        productos.add(solicitarProducto());
    }

    public static int solicitarIndice() {
        
        return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de producto: "));
    }

    public static void cambiarCantidad(ArrayList<Producto> productos) {
        int indice = solicitarIndice();
        Producto p = productos.get(indice);
        
        
        double nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva Cantidad: "));
        p.setCantidad(nuevaCantidad);
        productos.set(indice, p);
    }

    public static void quitarProducto(ArrayList<Producto> productos) {
        int indice = solicitarIndice();
        if (indice < productos.size()) {
            productos.remove(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Numero erroneo, intente nuevamente");
        }
    }

    public static void mostrarTicketEfe(ArrayList<Producto> productos) {
        Date fecha = new Date();
        System.out.println("-".repeat(106));
        System.out.println("                                                        Supermercados");
        System.out.println("   *        *       *    * * *     * * * *      *    *         * * *      * * *    * * * * *    * * *     ");
        System.out.println("    *     *  *     *    *     *    *       *    *   *          *     *   *     *       *       *          ");
        System.out.println("     *   *    *   *     *     *    * * *  *     * *            * * * *   *     *       *        * * *     ");
        System.out.println("      * *      * *      *     *    *       *    *   *          *     *   *     *       *              *   ");
        System.out.println("       *        *        * * *     *       *    *    *         * * *      * * *        *        * * *     ");
        System.out.println(" ");
        System.out.println("Workbots S. A.");
        System.out.println("CUIT: 30-123456789-0");
        System.out.println("Domicilio comercial: Av. J. J. Urquiza 314, San Rafael, Mendoza");
        System.out.println("IVA Responsable inscripto");
        System.out.println(" ");
        System.out.println("-".repeat(106));
        System.out.printf("Fecha: "+ fecha);
        System.out.println("Condicion de venta: Efectivo");
        System.out.println("-".repeat(106));
        System.out.println("Ticket factura B");
        System.out.println("Consumidor final");
        System.out.println("-".repeat(106));
        System.out.println(" ");
            
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Descripción", "Precio", "Cantidad", "Subtotal");
        System.out.println("-".repeat(85));
        double total = 0;
        for (Producto p : productos) {
            System.out.printf("|%-20s|%-20f|%-20f|%-20f|\n", p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());
            total += p.getSubtotal();
        }
        
        System.out.println("-".repeat(85));
        System.out.printf("|%83s|\n", "Total: " + total);
        System.out.printf("|%83s|\n", "Impuestos: " + (total-total/1.21));
        
    }

    
    public static void mostrarTicketDebit(ArrayList<Producto> productos) {
        Date fecha = new Date();
        System.out.println("-".repeat(106));
        System.out.println("                                                        Supermercados");
        System.out.println("   *        *       *    * * *     * * * *      *    *         * * *      * * *    * * * * *    * * *     ");
        System.out.println("    *     *  *     *    *     *    *       *    *   *          *     *   *     *       *       *          ");
        System.out.println("     *   *    *   *     *     *    * * *  *     * *            * * * *   *     *       *        * * *     ");
        System.out.println("      * *      * *      *     *    *       *    *   *          *     *   *     *       *              *   ");
        System.out.println("       *        *        * * *     *       *    *    *         * * *      * * *        *        * * *     ");
        System.out.println(" ");
        System.out.println("Workbots S. A.");
        System.out.println("CUIT: 30-123456789-0");
        System.out.println("Domicilio comercial: Av. J. J. Urquiza 314, San Rafael, Mendoza");
        System.out.println("IVA Responsable inscripto");
        System.out.println(" ");
        System.out.println("-".repeat(106));
        System.out.printf("Fecha: "+ fecha);
        System.out.println("Condicion de venta: Tarjeta de debito");
        System.out.println("-".repeat(106));
        System.out.println("Ticket factura B");
        System.out.println("Consumidor final");
        System.out.println("-".repeat(106));
        System.out.println(" ");
        
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Descripción", "Precio", "Cantidad", "Subtotal");
        System.out.println("-".repeat(85));
        double total = 0;
        for (Producto p : productos) {
            System.out.printf("|%-20s|%-20f|%-20f|%-20f|\n", p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());
            total += p.getSubtotal();
        }
        System.out.println("-".repeat(85));
        System.out.printf("|%83s|\n", "Total: " + total);
        System.out.printf("|%83s|\n", "Impuestos: " + (total-total/1.21));
    }
    public static void mostrarTicketCred(ArrayList<Producto> productos) {
        Date fecha = new Date();
        System.out.println("-".repeat(106));
        System.out.println("                                                        Supermercados");
        System.out.println("   *        *       *    * * *     * * * *      *    *         * * *      * * *    * * * * *    * * *     ");
        System.out.println("    *     *  *     *    *     *    *       *    *   *          *     *   *     *       *       *          ");
        System.out.println("     *   *    *   *     *     *    * * *  *     * *            * * * *   *     *       *        * * *     ");
        System.out.println("      * *      * *      *     *    *       *    *   *          *     *   *     *       *              *   ");
        System.out.println("       *        *        * * *     *       *    *    *         * * *      * * *        *        * * *     ");
        System.out.println(" ");
        System.out.println("Workbots S. A.");
        System.out.println("CUIT: 30-123456789-0");
        System.out.println("Domicilio comercial: Av. J. J. Urquiza 314, San Rafael, Mendoza");
        System.out.println("IVA Responsable inscripto");
        System.out.println(" ");
        System.out.println("-".repeat(106));
        System.out.printf("Fecha: "+ fecha);
        System.out.println("Condicion de venta: Tarjeta de credito");
        System.out.println("-".repeat(106));
        System.out.println("Ticket factura B");
        System.out.println("Consumidor final");
        System.out.println("-".repeat(106));
        System.out.println(" ");
        
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Descripción", "Precio", "Cantidad", "Subtotal");
        System.out.println("-".repeat(85));
        double total = 0;
        for (Producto p : productos) {
            System.out.printf("|%-20s|%-20f|%-20f|%-20f|\n", p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());
            total += p.getSubtotal();
        }
        System.out.println("-".repeat(85));
        System.out.printf("|%83s|\n", "Total: " + total);
        System.out.printf("|%83s|\n", "Impuestos: " + (total-total/1.21));
    }
    
}