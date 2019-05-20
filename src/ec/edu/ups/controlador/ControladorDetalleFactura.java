package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleFactura;
import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

public class ControladorDetalleFactura {
  
 
    private Set<DetalleFactura> lista;
    private int codigo;
    ControladorProducto controladorProducto;
    DetalleFactura detalle;
    
    
    

    public ControladorDetalleFactura() {
    
        lista=new HashSet<>();
        controladorProducto=new ControladorProducto();
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
    
        factura.setCodigod(codigo);
        lista.add(factura);
        codigo++;
        System.out.println(lista);
    }
    
    public void llenarTabla(int codigo){
    
        detalle.setDescripcion(controladorProducto.read(codigo).getNombre());
        detalle.setSubTotal(controladorProducto.read(codigo).getCosto());
        cread(detalle);
    }
    
    public DetalleFactura read(int codigo){
    
        for (DetalleFactura factura : lista) {
            
            if (factura.getCodigod()==codigo){
            
                return factura;
            }
        }
        return null;
    }
}
