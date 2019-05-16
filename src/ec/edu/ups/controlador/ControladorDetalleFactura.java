package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleFactura;
import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

public class ControladorDetalleFactura {
  
 
    private Set<DetalleFactura> lista;
    private int codigo;
    ControladorProducto buscar;
    DetalleFactura detalle;

    

    public ControladorDetalleFactura() {
    
        lista=new HashSet<>();
        buscar=new ControladorProducto();
        detalle=new DetalleFactura();
        codigo=1;
    }

        public Set<DetalleFactura> getLista() {
            return lista;
        }

    
    public int getCodigo() {
        return codigo;
    }
    
    public void cread(DetalleFactura factura){
    
        factura.setCodigo(codigo);
        lista.add(factura);
        codigo++;
    }
    
    public DetalleFactura read(int codigo){
    
        for (DetalleFactura factura : lista) {
            
            if (factura.getCodigo()==codigo){
            
                return factura;
            }
        }
        return null;
    }
    
    
   
    
    
    public void buscarProducto(int codigo){
    
        DetalleFactura detalleFactura=new DetalleFactura();
        Producto producto= buscar.read(codigo);
        detalleFactura.setDescripcion(producto.getNombre());
        detalleFactura.setSubTotal(producto.getCosto());
        detalleFactura.setCantidadCompra(producto.getCantidad());
        
        cread(detalleFactura);
        
    
    }
    
}
