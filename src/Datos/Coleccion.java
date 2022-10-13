package Datos;

import Negocio.IComentario;
import Negocio.Oferta;
import Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion implements IComentario{

    private ArrayList<Producto> listaProductos;

    public Coleccion() {

        listaProductos = new ArrayList<>();

    }

    public void agregarProductos(Producto prod) {
        if (buscarProducto(prod.getCodigo()) == false) {
            listaProductos.add(prod);
        } else {
            System.out.println("¡Producto ya existe!");
        }

    }

    public boolean buscarProducto(int codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    
    public int totalLista(){
        int total = 0;
        int totalP = 0;
        for (Producto producto : listaProductos) {
            totalP = producto.getPrecio()* producto.getCantidad();
            total += totalP; // total = total + totalP;
        }
        return total;
    }
    
     public int totalLista(Oferta of){
        int total = 0;
        int totalP = 0;
        for (Producto producto : listaProductos) {
            totalP = producto.getPrecio()* producto.getCantidad();
            total += totalP; // total = total + totalP;
            if (producto.getClass().getSimpleName().equals("Oferta")) {
                total = total - of.aPagar(producto.getCantidad());
            }
        }
        return total;
    }
     
     public void listaCompra(Oferta of)
     {
         int descuento = 0;
         System.out.println("CÓDIGO DESCRIPCIÓN\t\tCANTIDAD\tPRECIO UNITARIO\tTOTAL");
         System.out.println("===========================================================================");
         for (Producto producto : listaProductos) {
             System.out.println(producto.getCodigo()+"\t"+producto.getDescricpion()+"\t\t\t"+
                     producto.getCantidad()+"\t\t" + producto.getPrecio()+"\t\t"+
                     producto.getPrecio()*producto.getCantidad());
            descuento = of.aPagar(producto.getCantidad());
         }
         System.out.println("===========================================================================");
         System.out.println("\t\t\t\t\t\t\tTOTAL COMPRA $ : "+ this.totalLista());
         System.out.println("\t\t\t\t\t\t\tDESCUENTO $ : "+ descuento);
         System.out.println("\t\t\t\t\t\t\tTOTAL CON DESCUENTO $ : "+ this.totalLista(of));
         System.out.println("===========================================================================");
     }

    @Override
    public void comentarios(String comentario) {
        System.out.println("COMENTARIO: "+ comentario);
    }
}
