
package ticketera;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static ticketera.Main.agregarProducto;
import static ticketera.Main.cambiarCantidad;
import static ticketera.Main.mostrarTicketEfe;
import static ticketera.Main.mostrarTicketDebit;
import static ticketera.Main.mostrarTicketCred;
import static ticketera.Main.quitarProducto;


public class Ticketera {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String nombre = JOptionPane.showInputDialog("***¡¡Bienvenidos al supermecado WorkBots!!***\n"
                    + "\n"
                    + "Por favor, escriba su nombre.");
        while (true) {
            if (productos.size() > 0) {
                System.out.println("\n");
                System.out.println("-".repeat(106));
                System.out.printf("|%-22s|%-22s|%-22s|%-22s|\n", "Descripción", "Precio", "Cantidad", "Subtotal");
                System.out.println("-".repeat(106));
            }
            int contador = 0;
            for (Producto p : productos) {
                System.out.printf("|%-22s|%-22f|%-22f|%-22f|\n", p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());
                contador++;
            }
            if (productos.size() > 0) {
                System.out.println("-".repeat(106));
            }
            
            String eleccion = JOptionPane.showInputDialog("¡Bienvenido "+nombre+"!\n"
                    + "\n"+
                    "Elije tu opcion: \n"+
                    "1. Agregar producto\n" +
                    "2. Cambiar cantidad\n" +
                    "3. Quitar producto\n" +
                    "4. Mostrar ticket y terminar venta\n" +
                    "5. Salir\n" +
                    "Seleccione: ");
            if (eleccion.equals("1")) {
                agregarProducto(productos);
            } else if (eleccion.equals("2")) {
                cambiarCantidad(productos);
            } else if (eleccion.equals("3")) {
                quitarProducto(productos);
            } else if (eleccion.equals("4")) {
                String eleccionPago = JOptionPane.showInputDialog("Por favor, seleccione el metodo de pago\n"
                        + "Elije tu opcion: \n"
                        + "1. Efectivo\n"
                        + "2. Tarjeta debito\n"
                        + "3. Tarjeta credito\n"
                        + "4. Volver al menu anterior\n"
                        + "5. Salir\n"
                        + "Seleccione:");
                if (eleccionPago.equals("1")){
                    mostrarTicketEfe(productos);
                    System.out.printf("                     Gracias por su compra, "+nombre+"!!!");
                    break;
                    
                } else if (eleccionPago.equals("2")){
                    mostrarTicketDebit(productos);
                    System.out.printf("                     Gracias por su compra, "+nombre+"!!!");
                    break;
                } else if (eleccionPago.equals("3")){
                    mostrarTicketCred(productos);
                    System.out.printf("                     Gracias por su compra, "+nombre+"!!!");
                    break;
                }
                else if (eleccionPago.equals("4")){
                    JOptionPane.showMessageDialog(null, "Volviendo...");
                } else if(eleccionPago.equals("5")){
                    break;
                } else{
                    JOptionPane.showMessageDialog(null, "Opción no valida!");
                }
                                                
            } else if (eleccion.equals("5")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null,"Opción no válida");
            }
                        
        }
        String fin = JOptionPane.showInputDialog("¿Nuevo Cliente? ¿Desea continuar?\n"
                    + "1. Si\n"
                    + "2. No\n"
                    + "Seleccione");
            if (fin.equals("1")){
                productos.clear();
                
                JOptionPane.showMessageDialog(null, "Volviendo...");
            } else if(fin.equals("2")){
                JOptionPane.showMessageDialog(null, "Gracias por visitar el super WorkBots!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no valida");
            }
    }
}
}