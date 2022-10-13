
package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestCompra {
    
    public static void main(String[] args) {
        
        Producto fideo = new Abarrote("Carozzi", 10, 1500, 1, "Espirales");
        Producto cerveza = new Liquido(7, 20, 1500, 1, "CORONA");
        Producto cloro = new Aseo("Baño", 30, 2000, 1, "CLORINDA");
        Producto helado = new Congelado(-18, 40, 1500, 2, "CRAZY");
        Oferta arroz = new Oferta(10, 50, 1500, 2, "TUCAPEL");
        
        Coleccion col = new Coleccion();
        
        col.agregarProductos(fideo);
        col.agregarProductos(cerveza);
        col.agregarProductos(cloro);
        col.agregarProductos(helado);
        col.agregarProductos(arroz);
        
        col.listaCompra(arroz);
        
        
    }
    
}
