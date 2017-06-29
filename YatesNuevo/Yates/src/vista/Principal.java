
package vista;

import controlador.Controlador;

public class Principal extends javax.swing.JFrame {
    
    controlador.Controlador control;
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        control = new Controlador();
    }
    
    public Principal(controlador.Controlador c) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        control = c;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inventario = new javax.swing.JButton();
        carrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        carrito.setText("Carrito");
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(inventario)
                .addGap(62, 62, 62)
                .addComponent(carrito)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inventario)
                    .addComponent(carrito))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    Muestra el inventario.
    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        Inventario n = new Inventario(control);
        this.setVisible(false);
    }//GEN-LAST:event_inventarioActionPerformed

    //    Muestra el carrito.
    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        Carrito n = new Carrito(control);
        this.setVisible(false);
    }//GEN-LAST:event_carritoActionPerformed

//main.
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrito;
    private javax.swing.JButton inventario;
    // End of variables declaration//GEN-END:variables
}
