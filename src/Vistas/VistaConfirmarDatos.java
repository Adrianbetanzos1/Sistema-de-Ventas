package Vistas;

import Modelo.MetodosSQL;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Sucursal;
import javax.swing.JOptionPane;

public class VistaConfirmarDatos extends javax.swing.JFrame {
    
    public VistaConfirmarDatos(Producto producto, Pedido pedido, Proveedor proveedor, Sucursal sucursal) {
        initComponents();
        this.setLocationRelativeTo(null);
        setProductoLabel.setText(producto.getNombre());
        setTipoLabel.setText(producto.getTipo());
        String cantidad = String.valueOf(pedido.getCantidad());
        setCantidadLabel.setText(cantidad);
        setProveedorLabel.setText(proveedor.getNombre());
        setSucursalLabel.setText(sucursal.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        fondoEncabezado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fondoTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        carro = new javax.swing.JLabel();
        tipoProductoLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        proveedorLabel = new javax.swing.JLabel();
        secursalLabel = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        nombreProductoLabel1 = new javax.swing.JLabel();
        setProductoLabel = new javax.swing.JLabel();
        setSucursalLabel = new javax.swing.JLabel();
        setTipoLabel = new javax.swing.JLabel();
        setCantidadLabel = new javax.swing.JLabel();
        setProveedorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(249, 196, 73));
        fondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoEncabezado.setBackground(new java.awt.Color(242, 76, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaCompras\\src\\Imagenes\\MiTienda Logo.png")); // NOI18N

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

        fondo.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        fondoTitulo.setBackground(new java.awt.Color(197, 198, 200));

        titulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        titulo.setText("SOLICITAR MERCANCÍA");

        javax.swing.GroupLayout fondoTituloLayout = new javax.swing.GroupLayout(fondoTitulo);
        fondoTitulo.setLayout(fondoTituloLayout);
        fondoTituloLayout.setHorizontalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(titulo)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        fondoTituloLayout.setVerticalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo))
        );

        fondo.add(fondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        carro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaCompras\\src\\Imagenes\\Carro.png")); // NOI18N
        fondo.add(carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 349, -1, -1));

        tipoProductoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        tipoProductoLabel.setText("TIPO DE PRODUCTO:");
        fondo.add(tipoProductoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 335, -1, -1));

        cantidadLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        cantidadLabel.setText("CANTIDAD:");
        fondo.add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 422, -1, -1));

        proveedorLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        proveedorLabel.setText("PROVEEDOR:");
        fondo.add(proveedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 510, -1, -1));

        secursalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secursalLabel.setText("SUCURSAL (es):");
        fondo.add(secursalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        enviarBtn.setBackground(new java.awt.Color(242, 76, 61));
        enviarBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        enviarBtn.setText("ENVIAR");
        enviarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });
        fondo.add(enviarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 740, 153, 48));

        cancelarBtn.setBackground(new java.awt.Color(242, 76, 61));
        cancelarBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cancelarBtn.setText("CANCELAR");
        cancelarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        fondo.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 740, -1, 48));

        nombreProductoLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        nombreProductoLabel1.setText("NOMBRE DEL PRODUCTO:");
        fondo.add(nombreProductoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 246, -1, -1));

        setProductoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        setProductoLabel.setText(".");
        fondo.add(setProductoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, -1, 50));

        setSucursalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        setSucursalLabel.setText(".");
        fondo.add(setSucursalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, 50));

        setTipoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        setTipoLabel.setText(".");
        fondo.add(setTipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, -1, 50));

        setCantidadLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        setCantidadLabel.setText(".");
        fondo.add(setCantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, -1, 50));

        setProveedorLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        setProveedorLabel.setText(".");
        fondo.add(setProveedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, -1, 50));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        MetodosSQL metodos = new MetodosSQL();
       
        VistaComprobante comprobante = new VistaComprobante();
        comprobante.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_enviarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VistaConfirmarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConfirmarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConfirmarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConfirmarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VistaConfirmarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JLabel carro;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoEncabezado;
    private javax.swing.JPanel fondoTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombreProductoLabel1;
    private javax.swing.JLabel proveedorLabel;
    private javax.swing.JLabel secursalLabel;
    private javax.swing.JLabel setCantidadLabel;
    private javax.swing.JLabel setProductoLabel;
    private javax.swing.JLabel setProveedorLabel;
    private javax.swing.JLabel setSucursalLabel;
    private javax.swing.JLabel setTipoLabel;
    private javax.swing.JLabel tipoProductoLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
