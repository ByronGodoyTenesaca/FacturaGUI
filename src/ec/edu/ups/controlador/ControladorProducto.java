package ec.edu.ups.controlador;


import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

public class ControladorProducto {

    private Set<Producto> lista;
    private int codigo;
    

    public ControladorProducto() {
    
        lista=new HashSet<>();
        codigo=1;
      
    }

    public Set<Producto> getLista() {
        return lista;
    }

    
    public int getCodigo() {
        return codigo;
    }
    
    public void cread(Producto producto){
    
        producto.setCodigo(codigo);
        lista.add(producto);
        codigo++;
    }
    
    public Producto read(int codigo){
    
        for (Producto producto : lista) {
            
            if (producto.getCodigo()==codigo){
            
                return producto;
            }
        }
        return null;
    }
    
    public void update(Producto producto){
    
        if (lista.contains(producto)){
        
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
    public void delete(int codigo){
    
        for (Producto producto : lista) {
            if (producto.getCodigo()==codigo){
            
                lista.remove(producto);
                break;
            }
        }
    }
    
   
    
    public void printAll(){
    
        for (Producto producto : lista) {
            System.out.println(producto);
        }
    }
}
