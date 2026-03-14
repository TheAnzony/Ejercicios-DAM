/**
 * Clase que representa un item en el carrito.
 */
public class Item {
    private String nombre;
    private double precio;

    /**
     * Constructor del item.
     * @param nombre El nombre del item.
     * @param precio El precio del item.
     * @throws IllegalArgumentException si el precio es negativo o mayor que PRECIO_MAX.
     */
    public Item(String nombre, double precio) {
        if (precio < 0 || precio > CarritoDeCompras.PRECIO_MAX) {
            throw new IllegalArgumentException("Precio inválido: debe ser entre 0 y " + CarritoDeCompras.PRECIO_MAX);
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del item.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del item.
     * @param nombre El nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del item.
     * @return El precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del item.
     * @param precio El precio.
     * @throws IllegalArgumentException si el precio es negativo o mayor que PRECIO_MAX.
     */
    public void setPrecio(double precio) {
        if (precio < 0 || precio > CarritoDeCompras.PRECIO_MAX) {
            throw new IllegalArgumentException("Precio inválido: debe ser entre 0 y " + CarritoDeCompras.PRECIO_MAX);
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + CarritoDeCompras.MONEDA;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Double.compare(item.precio, precio) == 0 && nombre.equals(item.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + Double.hashCode(precio);
    }
}