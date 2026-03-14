import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa un carrito de compras.
 * Maneja una colección de items con sus cantidades.
 */
public class CarritoDeCompras {
    /** Símbolo de la moneda */
    public static final String MONEDA = "$"; 
    /** Cabecera para la impresión del detalle */
    public static final String CABECERA = "Detalles del carrito de compras:";
    /** Precio máximo permitido para un item */
    public static final double PRECIO_MAX = 10000.0;

    private Map<Item, Integer> items;

    /**
     * Constructor del carrito de compras.
     */
    public CarritoDeCompras() {
        this.items = new HashMap<>();
    }

    /**
     * Agrega un item al carrito con la cantidad especificada.
     * @param item El item a agregar.
     * @param cantidad La cantidad a agregar.
     */
    public void agregarItem(Item item, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        items.put(item, items.getOrDefault(item, 0) + cantidad);
    }

    /**
     * Remueve un item del carrito.
     * @param item El item a remover.
     * @throws IllegalArgumentException si el item no existe en el carrito.
     */
    public void removerItem(Item item) {
        if (!items.containsKey(item)) {
            throw new IllegalArgumentException("El item no existe en el carrito.");
        }
        items.remove(item);
    }

    /**
     * Calcula el total del carrito.
     * @return El total del carrito.
     */
    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    /**
     * Imprime el detalle del carrito.
     */
    public void imprimirDetalle() {
        System.out.println(CABECERA);
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().toString() + " x" + entry.getValue());
        }
        System.out.println("Total: " + calcularTotal() + MONEDA);
    }
}