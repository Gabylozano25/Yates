package vista;

import static java.awt.SystemColor.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.util.Collections.list;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Carro;
import modelo.Tienda;
import modelo.Yate;

public class Carrito extends javax.swing.JFrame implements ListSelectionListener {

    controlador.Controlador control;
    Carro car;

    public Carrito(controlador.Controlador c) {

        this.car = new Carro();
        initComponents();
        control = c;
        this.refreshLista();
        this.jList2.addListSelectionListener(this);
        this.presu.setText(car.getPresupuesto() + "");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        comprar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        TxMotor1 = new javax.swing.JTextField();
        TxCapTan1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxAncho1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxCapA1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Txtipo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxHorasUso1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TxAlto1 = new javax.swing.JTextField();
        TxVC1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TxVM1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TxCam1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TxValor1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TxModelo1 = new javax.swing.JTextField();
        TxAño1 = new javax.swing.JTextField();
        TxMarca1 = new javax.swing.JTextField();
        presupuesto = new javax.swing.JLabel();
        presu = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alquiler y venta de yates");

        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jLabel9.setText("MODELOS");

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        TxMotor1.setEnabled(false);
        TxMotor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMotor1ActionPerformed(evt);
            }
        });

        TxCapTan1.setEnabled(false);
        TxCapTan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapTan1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Motor:");

        jLabel16.setText("Cap Tanque:");

        TxAncho1.setEnabled(false);
        TxAncho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAncho1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Ancho");

        jLabel18.setText("Alto");

        TxCapA1.setEnabled(false);
        TxCapA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapA1ActionPerformed(evt);
            }
        });

        jLabel19.setText("Cap Agua:");

        Txtipo1.setEnabled(false);
        Txtipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtipo1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Tipo:");

        jLabel21.setText("Marca:");

        TxHorasUso1.setEnabled(false);
        TxHorasUso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxHorasUso1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Modelo:");

        jLabel23.setText("Horas Uso:");

        TxAlto1.setEnabled(false);
        TxAlto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAlto1ActionPerformed(evt);
            }
        });

        TxVC1.setEnabled(false);
        TxVC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxVC1ActionPerformed(evt);
            }
        });

        jLabel24.setText("V Crucero:");

        TxVM1.setEnabled(false);
        TxVM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxVM1ActionPerformed(evt);
            }
        });

        jLabel25.setText("V Máxima:");

        TxCam1.setEnabled(false);
        TxCam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCam1ActionPerformed(evt);
            }
        });

        jLabel26.setText("# Camarotes:");

        TxValor1.setEnabled(false);
        TxValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxValor1ActionPerformed(evt);
            }
        });

        jLabel27.setText("Valor:");

        jLabel28.setText("Año:");

        TxModelo1.setEnabled(false);
        TxModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxModelo1ActionPerformed(evt);
            }
        });

        TxAño1.setEnabled(false);
        TxAño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAño1ActionPerformed(evt);
            }
        });

        TxMarca1.setEnabled(false);
        TxMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMarca1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxAncho1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel22))
                                    .addGroup(panelDatosLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel25))))
                                .addGap(31, 31, 31)))
                        .addGap(10, 10, 10)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxCam1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxAlto1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxHorasUso1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(TxCapA1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxMotor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxMarca1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txtipo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxAño1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxCapTan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxModelo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxVM1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxVC1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TxModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TxAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxMotor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TxHorasUso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TxCapA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TxCapTan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxAncho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(TxAlto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TxCam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxVM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(TxVC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        presupuesto.setText("Presupuesto: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(comprar)
                                .addGap(61, 61, 61))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(presupuesto)
                                .addGap(18, 18, 18)
                                .addComponent(presu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(atras)
                        .addGap(108, 108, 108)))
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(presupuesto)
                            .addComponent(presu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comprar)
                        .addGap(18, 18, 18)
                        .addComponent(atras))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    boton atras.
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Principal n = new Principal(control);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    //    Iterator: permite recorrer una coleccion, obteniendo o quitando elementos.
    //    De acuerdo al yate seleccionado, lo quita de la lista y resta al presupuesto el valor del yate y aplica descuento.
    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed

        double valor = 0;
        String modelo = jList2.getSelectedValue();
        if (this.control.getTienda().getLista().size() > 0) {

            for (Iterator<Yate> iter = this.control.getTienda().getLista().iterator(); iter.hasNext();) {
                Yate element = iter.next();
                if (element.getModelo().equals(modelo)) {

                     valor += element.getValor();
                    if (valor >= 300000) {
                       
                        valor = valor * 0.9;
                        double presup = this.car.getPresupuesto() - valor;
                        this.presu.setText(presup + "");
                        this.control.getTienda().getLista().remove(element);
                         this.refreshLista();
                        JOptionPane.showMessageDialog(null, "Su compra menos el descuento del 10% fue de " + valor);
                      
                    } else {
                        double presup = this.car.getPresupuesto() - element.getValor();
                        this.presu.setText(presup + "");
                        this.control.getTienda().getLista().remove(element);
                        this.car.getInventario().add(element);
                        this.refreshLista();

                    }

                    JOptionPane.showMessageDialog(null, "Yate con modelo " + element.getModelo() + " se ha comprado");
                }

            }
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void TxMotor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMotor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMotor1ActionPerformed

    private void TxCapTan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapTan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapTan1ActionPerformed

    private void TxAncho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAncho1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAncho1ActionPerformed

    private void TxCapA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapA1ActionPerformed

    private void Txtipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtipo1ActionPerformed

    private void TxHorasUso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxHorasUso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxHorasUso1ActionPerformed

    private void TxAlto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAlto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAlto1ActionPerformed

    private void TxVC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxVC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxVC1ActionPerformed

    private void TxVM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxVM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxVM1ActionPerformed

    private void TxCam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCam1ActionPerformed

    private void TxValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxValor1ActionPerformed

    private void TxModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxModelo1ActionPerformed

    private void TxAño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAño1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAño1ActionPerformed

    private void TxMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMarca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMarca1ActionPerformed

//    actualiza la lista y quita los modelos comprados. 
    public void refreshLista() {
        Tienda tienda = control.getTienda();
        DefaultListModel modeloLista = new DefaultListModel();

        jList2.removeAll();

        int i = 0;
        for (Yate yate : tienda.getLista()) {
            modeloLista.add(i, yate.getModelo());
            i++;

        }
        jList2.setModel(modeloLista);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxAlto1;
    private javax.swing.JTextField TxAncho1;
    private javax.swing.JTextField TxAño1;
    private javax.swing.JTextField TxCam1;
    private javax.swing.JTextField TxCapA1;
    private javax.swing.JTextField TxCapTan1;
    private javax.swing.JTextField TxHorasUso1;
    private javax.swing.JTextField TxMarca1;
    private javax.swing.JTextField TxModelo1;
    private javax.swing.JTextField TxMotor1;
    private javax.swing.JTextField TxVC1;
    private javax.swing.JTextField TxVM1;
    private javax.swing.JTextField TxValor1;
    private javax.swing.JTextField Txtipo1;
    private javax.swing.JButton atras;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel presu;
    private javax.swing.JLabel presupuesto;
    // End of variables declaration//GEN-END:variables

    //    Muestra datos del yate seleccionado de la lista en el Jpanel de datos.
    public void muestraCampos() {
        String modelo = jList2.getSelectedValue();

        for (Yate y : this.control.getTienda().getLista()) {
            if (y.getModelo().equals(modelo)) {
                this.TxModelo1.setText(y.getModelo());
                this.TxAño1.setText(y.getAño() + "");
                this.Txtipo1.setText(y.getTipo());
                this.TxMarca1.setText(y.getMarca());
                this.TxMotor1.setText(y.getMotor() + "");
                this.TxHorasUso1.setText(y.getHorasUso() + "");
                this.TxCapA1.setText(y.getCapAgua() + "");
                this.TxCapTan1.setText(y.getCapTanque() + "");
                this.TxAncho1.setText(y.getAncho() + "");
                this.TxAlto1.setText(y.getAlto() + "");
                this.TxCam1.setText(y.getNumCamarotes() + "");
                this.TxVM1.setText(y.getVMax() + "");
                this.TxVC1.setText(y.getVCru() + "");
                this.TxValor1.setText(y.getValor() + "");
            }
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        this.muestraCampos();

    }
}
