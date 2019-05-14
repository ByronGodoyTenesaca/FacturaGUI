package ec.edu.ups.modelo;

import java.util.HashSet;
import java.util.Set;

public class DetalleFactura {
 
    private int codigo;
    private int cantidadCompra;
    private double subTotal;
    private String descripcion;
    private Set<Producto> lista;
   

    public DetalleFactura() {
   
        lista=new HashSet<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Producto> getLista() {
        return lista;
    }

    public void setLista(Set<Producto> lista) {
        this.lista = lista;
    }

    
    @Override
    public String toString() {
        return "DetalleFactura{" + "codigo=" + codigo + ", cantidadCompra=" + cantidadCompra + ", subTotal=" + subTotal + ", descripcion=" + descripcion + ", lista=" + lista +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleFactura other = (DetalleFactura) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

   
    
    
    
    
}
