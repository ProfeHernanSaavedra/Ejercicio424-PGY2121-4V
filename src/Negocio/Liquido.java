
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Liquido extends Producto{
    
    private int gradosAlcohol;

    public Liquido() {
    }

    public Liquido(int gradosAlcohol, int codigo, int precio, int cantidad, String descricpion) {
        super(codigo, precio, cantidad, descricpion);
        this.gradosAlcohol = gradosAlcohol;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    @Override
    public String toString() {
        return super.toString() + " Liquido{" + "gradosAlcohol=" + gradosAlcohol + '}';
    }
    
    
    
}
