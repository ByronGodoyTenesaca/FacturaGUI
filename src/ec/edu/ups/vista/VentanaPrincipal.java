
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorDetalleFactura;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;

public class VentanaPrincipal extends javax.swing.JFrame {

    ControladorCliente controladorcliente;
    ControladorProducto controladorProducto;
    ControladorDetalleFactura controladorDetalleFactura;
    ControladorFactura controladorFactura;
    
    static Locale localizacion;
    private ResourceBundle mensajes;
    
    public VentanaPrincipal() {
        initComponents();
        controladorcliente=new ControladorCliente();
        controladorProducto=new ControladorProducto();
        controladorDetalleFactura=new ControladorDetalleFactura();
        controladorFactura=new ControladorFactura();
        
        //System.out.println("localizacion por defecto: "+ Locale.getDefault().getLanguage());
        localizacion =new Locale("es", "EC");
        Locale.setDefault(localizacion);
        //System.out.println("localizacion forzada: "+ Locale.getDefault().getLanguage());
        
        /*mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        System.out.println("Mensaje");
        System.out.println(mensajes.getString("menu.item.crear"));*/
        cambiarIdioma();
        
    }
    
    public void cambiarIdioma(){
    
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",localizacion);
        fileMenu.setText(mensajes.getString("menu.cliente"));
        productoMenu.setText(mensajes.getString("menu.producto"));
        facturaMenu.setText(mensajes.getString("menu.factura"));
        idiomaMenu.setText(mensajes.getString("menu.idioma"));
        itemActualizar.setText(mensajes.getString("menu.item.actualizar"));
        itemActualizarP.setText(mensajes.getString("menu.item.actualizar"));
        itemBuscar.setText(mensajes.getString("menu.item.buscar"));
        itemBuscarC.setText(mensajes.getString("menu.item.buscar"));
        itemBuscarF.setText(mensajes.getString("menu.item.buscar"));
        itemCrear.setText(mensajes.getString("menu.item.crear"));
        itemCrearP.setText(mensajes.getString("menu.item.crear"));
        itemCrearF.setText(mensajes.getString("menu.item.crear"));
        itemEliminar.setText(mensajes.getString("menu.item.eliminar"));
        ItemEliminarP.setText(mensajes.getString("menu.item.eliminar"));
        itemEliminarF.setText(mensajes.getString("menu.item.eliminar"));
        itemListar.setText(mensajes.getString("menu.item.listar"));
        itemListarP.setText(mensajes.getString("menu.item.listar"));
        itemListarF.setText(mensajes.getString("menu.item.listar"));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemBuscarC = new javax.swing.JMenuItem();
        itemActualizar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        itemListar = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        itemCrearP = new javax.swing.JMenuItem();
        itemBuscar = new javax.swing.JMenuItem();
        itemActualizarP = new javax.swing.JMenuItem();
        ItemEliminarP = new javax.swing.JMenuItem();
        itemListarP = new javax.swing.JMenuItem();
        facturaMenu = new javax.swing.JMenu();
        itemCrearF = new javax.swing.JMenuItem();
        itemBuscarF = new javax.swing.JMenuItem();
        itemEliminarF = new javax.swing.JMenuItem();
        itemListarF = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        itemIngles = new javax.swing.JMenuItem();
        itemEspañol = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        itemCrear.setMnemonic('o');
        itemCrear.setText("Crear");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        fileMenu.add(itemCrear);

        itemBuscarC.setMnemonic('s');
        itemBuscarC.setText("buscar");
        itemBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarCActionPerformed(evt);
            }
        });
        fileMenu.add(itemBuscarC);

        itemActualizar.setMnemonic('a');
        itemActualizar.setText("Actualizar");
        itemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarActionPerformed(evt);
            }
        });
        fileMenu.add(itemActualizar);

        itemEliminar.setMnemonic('x');
        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        fileMenu.add(itemEliminar);

        itemListar.setText("Listar");
        itemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarActionPerformed(evt);
            }
        });
        fileMenu.add(itemListar);

        menuBar.add(fileMenu);

        productoMenu.setMnemonic('e');
        productoMenu.setText("Producto");

        itemCrearP.setMnemonic('t');
        itemCrearP.setText("Crear");
        itemCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearPActionPerformed(evt);
            }
        });
        productoMenu.add(itemCrearP);

        itemBuscar.setMnemonic('y');
        itemBuscar.setText("buscar");
        itemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarActionPerformed(evt);
            }
        });
        productoMenu.add(itemBuscar);

        itemActualizarP.setMnemonic('d');
        itemActualizarP.setText("Actualizar");
        itemActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarPActionPerformed(evt);
            }
        });
        productoMenu.add(itemActualizarP);

        ItemEliminarP.setMnemonic('p');
        ItemEliminarP.setText("Eliminar");
        ItemEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEliminarPActionPerformed(evt);
            }
        });
        productoMenu.add(ItemEliminarP);

        itemListarP.setText("Listar");
        itemListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarPActionPerformed(evt);
            }
        });
        productoMenu.add(itemListarP);

        menuBar.add(productoMenu);

        facturaMenu.setText("Factura");

        itemCrearF.setText("crear");
        itemCrearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearFActionPerformed(evt);
            }
        });
        facturaMenu.add(itemCrearF);

        itemBuscarF.setText("buscar");
        itemBuscarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarFActionPerformed(evt);
            }
        });
        facturaMenu.add(itemBuscarF);

        itemEliminarF.setText("eliminar");
        itemEliminarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarFActionPerformed(evt);
            }
        });
        facturaMenu.add(itemEliminarF);

        itemListarF.setText("listar");
        itemListarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarFActionPerformed(evt);
            }
        });
        facturaMenu.add(itemListarF);

        menuBar.add(facturaMenu);

        idiomaMenu.setText("Idioma");

        itemIngles.setText("ingles");
        itemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInglesActionPerformed(evt);
            }
        });
        idiomaMenu.add(itemIngles);

        itemEspañol.setText("español");
        itemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEspañolActionPerformed(evt);
            }
        });
        idiomaMenu.add(itemEspañol);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        VentanaEliminarCliente eliminar=new VentanaEliminarCliente(controladorcliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        eliminar.setVisible(true);
        desktopPane.add(eliminar);
        setSize(eliminar.getWidth()+20,eliminar.getHeight()+70);
        
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed
       VentanaCrearCliente crear=new VentanaCrearCliente(controladorcliente);
       this.desktopPane.removeAll();
       this.desktopPane.repaint();
       crear.setVisible(true);
       desktopPane.add(crear);
       setSize(crear.getWidth()+20,crear.getHeight()+70);
    }//GEN-LAST:event_itemCrearActionPerformed

    private void itemBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarCActionPerformed
        VentanaLeerCliente leer=new VentanaLeerCliente(controladorcliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        leer.setVisible(true);
        desktopPane.add(leer);
        setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_itemBuscarCActionPerformed

    private void itemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarActionPerformed
       VentanaActualizarCliente actualizar=new VentanaActualizarCliente(controladorcliente);
       this.desktopPane.removeAll();
        this.desktopPane.repaint();
       actualizar.setVisible(true);
       desktopPane.add(actualizar);
       setSize(actualizar.getWidth()+20,actualizar.getHeight()+70);
    }//GEN-LAST:event_itemActualizarActionPerformed

    private void itemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarActionPerformed
        VentanaListarCliente listar=new VentanaListarCliente(controladorcliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        listar.setVisible(true);
        desktopPane.add(listar);
        setSize(listar.getWidth()+20,listar.getHeight()+70);
    }//GEN-LAST:event_itemListarActionPerformed

    private void itemCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearPActionPerformed
        VentanaCrearProducto crear=new VentanaCrearProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crear.setVisible(true);
        desktopPane.add(crear);
        setSize(crear.getWidth()+20,crear.getHeight()+70);
    }//GEN-LAST:event_itemCrearPActionPerformed

    private void itemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarActionPerformed
        VentanaLeerProducto leer=new VentanaLeerProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        leer.setVisible(true);
        desktopPane.add(leer);
        setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_itemBuscarActionPerformed

    private void itemActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarPActionPerformed
        VentanaActualizarProducto actualizar=new VentanaActualizarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        actualizar.setVisible(true);
        desktopPane.add(actualizar);
        setSize(actualizar.getWidth()+20,actualizar.getHeight()+70);
    }//GEN-LAST:event_itemActualizarPActionPerformed

    private void ItemEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEliminarPActionPerformed
        VentanaEliminarProducto eliminar=new VentanaEliminarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        eliminar.setVisible(true);
        desktopPane.add(eliminar);
        setSize(eliminar.getWidth()+20,eliminar.getHeight()+70);
    }//GEN-LAST:event_ItemEliminarPActionPerformed

    private void itemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEspañolActionPerformed
        localizacion=new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itemEspañolActionPerformed

    private void itemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInglesActionPerformed
       localizacion=new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itemInglesActionPerformed

    private void itemCrearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearFActionPerformed
        VentanaFactura factura=new VentanaFactura(controladorcliente,controladorDetalleFactura,controladorFactura);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        factura.setVisible(true);
        desktopPane.add(factura);
        setSize(factura.getWidth()+20,factura.getHeight()+70);
    }//GEN-LAST:event_itemCrearFActionPerformed

    private void itemListarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarFActionPerformed
         VentanaListarFactura leer=new VentanaListarFactura( controladorFactura);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
         leer.setVisible(true);
        desktopPane.add(leer);
        setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_itemListarFActionPerformed

    private void itemListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarPActionPerformed
        VentanaListarProducto listarP=new VentanaListarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        listarP.setVisible(true);
        desktopPane.add(listarP);
        setSize(listarP.getWidth()+20,listarP.getHeight()+70);
    }//GEN-LAST:event_itemListarPActionPerformed

    private void itemBuscarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarFActionPerformed
       VentanaLeerFactura leer=new VentanaLeerFactura( controladorFactura);
       this.desktopPane.removeAll();
        this.desktopPane.repaint();
       leer.setVisible(true);
       desktopPane.add(leer);
       setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_itemBuscarFActionPerformed

    private void itemEliminarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarFActionPerformed
       VentanaEliminarFactura eliminar=new VentanaEliminarFactura(controladorFactura);
       this.desktopPane.removeAll();
        this.desktopPane.repaint();
       eliminar.setVisible(true);
       desktopPane.add(eliminar);
       setSize(eliminar.getWidth()+20,eliminar.getHeight()+70);
    }//GEN-LAST:event_itemEliminarFActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemEliminarP;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu facturaMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenuItem itemActualizar;
    private javax.swing.JMenuItem itemActualizarP;
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemBuscarC;
    private javax.swing.JMenuItem itemBuscarF;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenuItem itemCrearF;
    private javax.swing.JMenuItem itemCrearP;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemEliminarF;
    private javax.swing.JMenuItem itemEspañol;
    private javax.swing.JMenuItem itemIngles;
    private javax.swing.JMenuItem itemListar;
    private javax.swing.JMenuItem itemListarF;
    private javax.swing.JMenuItem itemListarP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu productoMenu;
    // End of variables declaration//GEN-END:variables

}
