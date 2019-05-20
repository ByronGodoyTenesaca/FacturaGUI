package ec.edu.ups.modelo;


public class DetalleFactura {
 
    private int codigod;
    private double subTotal;
    private String descripcion;
    
    public DetalleFactura() {
    }


    public int getCodigod() {
        return codigod;
    }

    public void setCodigod(int codigo) {
        this.codigod = codigo;
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

   

    
    @Override
    public String toString() {
        return "DetalleFactura{" + "codigo=" + codigod + ", cantidadCompra="  + ", subTotal=" + subTotal + ", descripcion=" + descripcion  +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigod;
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
        if (this.codigod != other.codigod) {
            return false;
        }
        return true;
    }

   
    
    
    
    
}
