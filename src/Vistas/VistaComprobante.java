package Vistas;

public class VistaComprobante extends javax.swing.JFrame {

    public VistaComprobante() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        secursalLabel = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(528, 528, 528))
        );
        fondoTituloLayout.setVerticalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo))
        );

        fondo.add(fondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        carro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaCompras\\src\\Imagenes\\Carro.png")); // NOI18N
        fondo.add(carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        secursalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secursalLabel.setText("PEDIDO REALIZADO CON ÉXITO");
        fondo.add(secursalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        salirBtn.setBackground(new java.awt.Color(242, 76, 61));
        salirBtn.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        salirBtn.setText("SALIR");
        salirBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        fondo.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 710, -1, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VistaComprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaComprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaComprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaComprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaComprobante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carro;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoEncabezado;
    private javax.swing.JPanel fondoTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel secursalLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
