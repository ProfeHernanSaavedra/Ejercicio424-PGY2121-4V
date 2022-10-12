
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Abarrote extends Producto{
    
    private String nombre;

    public Abarrote() {
    }

    public Abarrote(String nombre, int codigo, int precio, int cantidad, String descricpion) {
        super(codigo, precio, cantidad, descricpion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ " Abarrote{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
