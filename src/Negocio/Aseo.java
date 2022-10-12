
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Aseo extends Producto{
    
    private String tipo;

    public Aseo() {
    }

    public Aseo(String tipo, int codigo, int precio, int cantidad, String descricpion) {
        super(codigo, precio, cantidad, descricpion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Aseo{" + "tipo=" + tipo + '}';
    }
    
    
    
}
