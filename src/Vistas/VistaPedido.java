package Vistas;

import Modelo.Conexion;
import Modelo.MetodosSQL;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class VistaPedido extends javax.swing.JFrame {

    public VistaPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodosSQL metodos = new MetodosSQL();
        metodos.cargarTipoProductos(productoComboBox);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoProveedor = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        fondoEncabezado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fondoTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        carro = new javax.swing.JLabel();
        nombreProductoLabel = new javax.swing.JLabel();
        tipoProductoLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        proveedorLabel = new javax.swing.JLabel();
        secursalLabel = new javax.swing.JLabel();
        nombreProductoTxt = new javax.swing.JTextField();
        cantidadTxt = new javax.swing.JTextField();
        productoComboBox = new javax.swing.JComboBox<>();
        borrarBtn = new javax.swing.JButton();
        confirmarBtn = new javax.swing.JButton();
        nestleRbtn = new javax.swing.JRadioButton();
        minatitlanCBox = new javax.swing.JCheckBox();
        bimboRbtn = new javax.swing.JRadioButton();
        lalaRbtn = new javax.swing.JRadioButton();
        cocaColaRbtn = new javax.swing.JRadioButton();
        frutosRbtn = new javax.swing.JRadioButton();
        avenidaNorteCBox = new javax.swing.JCheckBox();
        coatzacoalcosCBox = new javax.swing.JCheckBox();
        olmecaCBox = new javax.swing.JCheckBox();
        regresarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 196, 73));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoEncabezado.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout fondoEncabezadoLayout = new javax.swing.GroupLayout(fondoEncabezado);
        fondoEncabezado.setLayout(fondoEncabezadoLayout);
        fondoEncabezadoLayout.setHorizontalGroup(
            fondoEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoEncabezadoLayout.setVerticalGroup(
            fondoEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        fondo.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1463, -1));

        fondoTitulo.setBackground(new java.awt.Color(255, 0, 0));

        titulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("SOLICITAR MERCANCÍA");

        javax.swing.GroupLayout fondoTituloLayout = new javax.swing.GroupLayout(fondoTitulo);
        fondoTitulo.setLayout(fondoTituloLayout);
        fondoTituloLayout.setHorizontalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(titulo)
                .addContainerGap(553, Short.MAX_VALUE))
        );
        fondoTituloLayout.setVerticalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo))
        );

        fondo.add(fondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1463, -1));
        fondo.add(carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        nombreProductoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        nombreProductoLabel.setText("NOMBRE DEL PRODUCTO:");
        fondo.add(nombreProductoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 248, -1, -1));

        tipoProductoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        tipoProductoLabel.setText("TIPO DE PRODUCTO:");
        fondo.add(tipoProductoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 392, -1, -1));

        cantidadLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        cantidadLabel.setText("CANTIDAD:");
        fondo.add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 543, -1, -1));

        proveedorLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        proveedorLabel.setText("SELECIONAR PROVEEDOR:");
        fondo.add(proveedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 248, -1, -1));

        secursalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secursalLabel.setText("SELECCIONAR SUCURSAL:");
        fondo.add(secursalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, -1, -1));

        nombreProductoTxt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        fondo.add(nombreProductoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 304, 417, 54));

        cantidadTxt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        fondo.add(cantidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 605, 417, 54));

        productoComboBox.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        fondo.add(productoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 448, 417, 54));

        borrarBtn.setBackground(new java.awt.Color(255, 0, 0));
        borrarBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        borrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        borrarBtn.setText("BORRAR DATOS");
        borrarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        fondo.add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, -1, 48));

        confirmarBtn.setBackground(new java.awt.Color(255, 0, 0));
        confirmarBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        confirmarBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmarBtn.setText("CONFIRMAR DATOS");
        confirmarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBtnActionPerformed(evt);
            }
        });
        fondo.add(confirmarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 750, -1, 48));

        grupoProveedor.add(nestleRbtn);
        nestleRbtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        nestleRbtn.setText("Nestlé");
        fondo.add(nestleRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        minatitlanCBox.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        minatitlanCBox.setText("Minatitlán");
        fondo.add(minatitlanCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, -1, -1));

        grupoProveedor.add(bimboRbtn);
        bimboRbtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        bimboRbtn.setText("Bimbo");
        fondo.add(bimboRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, -1, -1));

        grupoProveedor.add(lalaRbtn);
        lalaRbtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lalaRbtn.setText("Lala");
        fondo.add(lalaRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, -1, -1));

        grupoProveedor.add(cocaColaRbtn);
        cocaColaRbtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cocaColaRbtn.setText("Coca cola");
        fondo.add(cocaColaRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 350, -1, -1));

        grupoProveedor.add(frutosRbtn);
        frutosRbtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        frutosRbtn.setText("Frutos con sabor a México");
        fondo.add(frutosRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 400, -1, -1));

        avenidaNorteCBox.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        avenidaNorteCBox.setText("Avenida Norte");
        fondo.add(avenidaNorteCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        coatzacoalcosCBox.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        coatzacoalcosCBox.setText("Coatzacoalcos");
        fondo.add(coatzacoalcosCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 550, -1, -1));

        olmecaCBox.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        olmecaCBox.setText("Olméca");
        fondo.add(olmecaCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 600, -1, -1));

        regresarBtn.setBackground(new java.awt.Color(255, 0, 0));
        regresarBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("REGRESAR");
        regresarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        fondo.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, -1, 48));
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro.png"))); // NOI18N
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        nombreProductoTxt.setText("");
        productoComboBox.setSelectedItem("Seleccione una opción");
        cantidadTxt.setText("");
        grupoProveedor.clearSelection();
        minatitlanCBox.setSelected(false);
        coatzacoalcosCBox.setSelected(false);
        olmecaCBox.setSelected(false);
        avenidaNorteCBox.setSelected(false);
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void confirmarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBtnActionPerformed
        try{
        Proveedor proveedor = new Proveedor();
        Producto producto = new Producto();
        Pedido pedido = new Pedido();
        Sucursal sucursal = new Sucursal();
        MetodosSQL metodos = new MetodosSQL();
            if(nombreProductoTxt.getText().isEmpty()){            
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de producto", "Nombre de producto", JOptionPane.ERROR_MESSAGE);
                nombreProductoTxt.requestFocus();
            }else if(productoComboBox.getSelectedItem().equals("Seleccione una opción")){    
                JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de producto", "Tipo de producto", JOptionPane.ERROR_MESSAGE);                
            }else if(cantidadTxt.getText().isEmpty()){    
                JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad de producto", "Cantidad de producto", JOptionPane.ERROR_MESSAGE);      
                cantidadTxt.requestFocus();
            }else{                
                producto.setNombre(nombreProductoTxt.getText());
                String tipoProducto = productoComboBox.getSelectedItem().toString();
                producto.setTipo(tipoProducto);                                                       
                
                if(nestleRbtn.isSelected()){
                    proveedor.setNombre(nestleRbtn.getText());
                }else if(cocaColaRbtn.isSelected()){
                    proveedor.setNombre(cocaColaRbtn.getText());
                }else if (frutosRbtn.isSelected()){
                    proveedor.setNombre(frutosRbtn.getText());
                }else if (lalaRbtn.isSelected()){
                    proveedor.setNombre(lalaRbtn.getText());
                }else if (bimboRbtn.isSelected()){
                     proveedor.setNombre(bimboRbtn.getText());
                }else{
                    JOptionPane.showMessageDialog(this, "Debe seleccionar un proveedor", "Error de proveedor", JOptionPane.ERROR_MESSAGE);           
                }                             
                
                String nombreSucursal = "";
                String s = "";
                if(minatitlanCBox.isSelected()){
                    nombreSucursal = minatitlanCBox.getText();
                    if(s == ""){
                        s = nombreSucursal + s;
                    }else{
                        s = nombreSucursal + ", " + s;
                    }                    
                }
                if(coatzacoalcosCBox.isSelected()){
                    nombreSucursal = coatzacoalcosCBox.getText();
                    if(s == ""){
                        s = nombreSucursal + s;
                    }else{
                        s = nombreSucursal + ", " + s;
                    }                    
                }
                if(avenidaNorteCBox.isSelected()){
                    nombreSucursal = avenidaNorteCBox.getText();
                    if(s == ""){
                        s = nombreSucursal + s;
                    }else{
                        s = nombreSucursal + ", " + s;
                    }                    
                }
                if(olmecaCBox.isSelected()){
                    nombreSucursal = olmecaCBox.getText();
                    if(s == ""){
                        s = nombreSucursal + s;
                    }else{
                        s = nombreSucursal + ", " + s;
                    }                    
                }
                
                sucursal.setNombre(s);
                
                int cantidad = Integer.parseInt(cantidadTxt.getText());
                if(cantidad <= 0){
                    JOptionPane.showMessageDialog(this, "La cantidad no puede ser igual o menor que 0", "Error de cantidad", JOptionPane.ERROR_MESSAGE);  
                    cantidadTxt.requestFocus();
                }else if(cantidadTxt.getText().contains(".")){
                    JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad entero", "Error de cantidad", JOptionPane.ERROR_MESSAGE);
                    cantidadTxt.requestFocus();
                }else{
                    pedido.setCantidad(cantidad);                                                        
                    if(metodos.buscarProducto(producto)){                        
                        if(metodos.validarProveedor(proveedor)){                                
                            if(metodos.validarSucursal(sucursal)){                                
                                VistaConfirmarDatos confirmarDatos = new VistaConfirmarDatos(producto, pedido, proveedor, sucursal);
                                confirmarDatos.setVisible(true);
                                this.setVisible(false);                                 
                            }else{
                                JOptionPane.showMessageDialog(this, "La sucursal que seleccionó no se encuentra disponible o no exite en la base de datos", "Sucursal no encontrado", JOptionPane.ERROR_MESSAGE);           
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "El proveedor que seleccionó no se encuentra disponible o no existe en la base de datos", "Proveedor no encontrado", JOptionPane.ERROR_MESSAGE);           
                        }    
                    }else{
                        JOptionPane.showMessageDialog(this, "El producto que ingreso no se encuentra disponible o no existe en la base de datos","Producto no encontrado", JOptionPane.ERROR_MESSAGE);
                    } 
                }                                               
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad de producto");       
        }                       
    }//GEN-LAST:event_confirmarBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        VistaMenu menu = new VistaMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedido().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox avenidaNorteCBox;
    private javax.swing.JRadioButton bimboRbtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JLabel carro;
    private javax.swing.JCheckBox coatzacoalcosCBox;
    private javax.swing.JRadioButton cocaColaRbtn;
    private javax.swing.JButton confirmarBtn;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoEncabezado;
    private javax.swing.JPanel fondoTitulo;
    private javax.swing.JRadioButton frutosRbtn;
    private javax.swing.ButtonGroup grupoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton lalaRbtn;
    private javax.swing.JCheckBox minatitlanCBox;
    private javax.swing.JRadioButton nestleRbtn;
    private javax.swing.JLabel nombreProductoLabel;
    private javax.swing.JTextField nombreProductoTxt;
    private javax.swing.JCheckBox olmecaCBox;
    private javax.swing.JComboBox<String> productoComboBox;
    private javax.swing.JLabel proveedorLabel;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JLabel secursalLabel;
    private javax.swing.JLabel tipoProductoLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
