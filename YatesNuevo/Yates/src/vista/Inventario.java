package vista;

import controlador.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Tienda;
import modelo.Yate;

public class Inventario extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    controlador.Controlador control;
    boolean usadolalala = false;
    int disponiblelalala;

    public Inventario(controlador.Controlador c) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        control = c;
        usado.addActionListener(this);
        alquiler.addActionListener(this);
        venta.addActionListener(this);
        jList1.addListSelectionListener(this);
        this.refreshLista();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        TxMotor = new javax.swing.JTextField();
        TxCapTan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxAncho = new javax.swing.JTextField();
        usado = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        TxCapA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        agregarYate = new javax.swing.JButton();
        Txtipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxHorasUso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxAlto = new javax.swing.JTextField();
        TxVC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxVM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxCam = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        alquiler = new javax.swing.JCheckBox();
        venta = new javax.swing.JCheckBox();
        TxValor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxModelo = new javax.swing.JTextField();
        TxAño = new javax.swing.JTextField();
        TxMarca = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buscarPorModelo = new javax.swing.JButton();
        ordenarPorValor = new javax.swing.JButton();
        ordenarPorAño = new javax.swing.JButton();
        MasCam = new javax.swing.JButton();
        MasBarato = new javax.swing.JButton();
        buscarPorAño = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel9 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alquiler y venta de yates");

        jScrollPane1.setViewportView(jList1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar"));

        TxMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMotorActionPerformed(evt);
            }
        });

        TxCapTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapTanActionPerformed(evt);
            }
        });

        jLabel4.setText("Motor:");

        jLabel8.setText("Cap Tanque:");

        TxAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAnchoActionPerformed(evt);
            }
        });

        usado.setText("Usado");
        usado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Alto");

        TxCapA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapAActionPerformed(evt);
            }
        });

        jLabel6.setText("Cap Agua:");

        agregarYate.setText("Agregar Yate");
        agregarYate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarYateActionPerformed(evt);
            }
        });

        Txtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        jLabel2.setText("Marca:");

        TxHorasUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxHorasUsoActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo:");

        jLabel7.setText("Horas Uso:");

        TxAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAltoActionPerformed(evt);
            }
        });

        TxVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxVCActionPerformed(evt);
            }
        });

        jLabel12.setText("V Crucero:");

        TxVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxVMActionPerformed(evt);
            }
        });

        jLabel13.setText("V Máxima:");

        TxCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCamActionPerformed(evt);
            }
        });

        jLabel14.setText("# Camarotes:");

        alquiler.setText("Alquiler");
        alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerActionPerformed(evt);
            }
        });

        venta.setText("Venta");
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });

        TxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxValorActionPerformed(evt);
            }
        });

        jLabel15.setText("Valor:");

        jLabel5.setText("Año:");

        TxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxModeloActionPerformed(evt);
            }
        });

        TxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAñoActionPerformed(evt);
            }
        });

        TxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMarcaActionPerformed(evt);
            }
        });

        jLabel29.setText("Ancho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxHorasUso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxAño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxCapTan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxCapA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(alquiler)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(venta)
                            .addComponent(TxVC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxVM, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxCam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(agregarYate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(usado)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxHorasUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxCapA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxCapTan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TxAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alquiler)
                    .addComponent(venta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarYate))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar"));

        buscarPorModelo.setText("Buscar por Modelo");
        buscarPorModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPorModeloActionPerformed(evt);
            }
        });

        ordenarPorValor.setText("Ordenar lista por valor");
        ordenarPorValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorValorActionPerformed(evt);
            }
        });

        ordenarPorAño.setText("Ordenar lista por año");
        ordenarPorAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorAñoActionPerformed(evt);
            }
        });

        MasCam.setText("Yate con mas camarotes");
        MasCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasCamActionPerformed(evt);
            }
        });

        MasBarato.setText("Yate mas barato");
        MasBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasBaratoActionPerformed(evt);
            }
        });

        buscarPorAño.setText("Buscar por año");
        buscarPorAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPorAñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MasCam)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(MasBarato))
                                .addComponent(ordenarPorValor)
                                .addComponent(ordenarPorAño))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buscarPorAño))
                            .addComponent(buscarPorModelo))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarPorModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarPorAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordenarPorValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordenarPorAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MasCam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MasBarato)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxAncho1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel22))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel25))))
                                .addGap(31, 31, 31)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxCam1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxAlto1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxHorasUso1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TxModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TxAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxMotor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TxHorasUso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TxCapA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TxCapTan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxAncho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(TxAlto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TxCam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxVM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(TxVC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("MODELOS");

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(atras)
                .addGap(34, 34, 34))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Información");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    Checkbox de alquiler, venta y usado.
    public void actionPerformed(ActionEvent e) {

        usadolalala = usado.isSelected();

        if (alquiler.isSelected() && !venta.isSelected()) {
            disponiblelalala = 1;
        } else if (!alquiler.isSelected() && venta.isSelected()) {
            disponiblelalala = 2;

        } else if (alquiler.isSelected() && venta.isSelected()) {
            disponiblelalala = 3;
        } else {
            disponiblelalala = 4;
        }
    }

//   Agrega un yate a la tienda.
    private void agregarYateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarYateActionPerformed

        try {
            int año = Integer.parseInt(TxAño.getText());
            String tipo = Txtipo.getText();
            String marca = TxMarca.getText();
            String modelo = TxModelo.getText();
            int motor = Integer.parseInt(TxMotor.getText());
            int horasUso = Integer.parseInt(TxHorasUso.getText());
            double capAgua = Double.parseDouble(TxCapA.getText());
            double capTanque = Double.parseDouble(TxCapTan.getText());
            double ancho = Double.parseDouble(TxAncho.getText());
            double alto = Double.parseDouble(TxAlto.getText());
            int numCam = Integer.parseInt(TxCam.getText());
            double VMax = Double.parseDouble(TxVM.getText());
            double VCru = Double.parseDouble(TxVC.getText());
            double valor = Double.parseDouble(TxValor.getText());

            if (disponiblelalala != 4) {

                control.crearYate(modelo, año, tipo, marca, motor, usadolalala, horasUso, capAgua, capTanque, ancho, alto, numCam, VMax, VCru, valor, disponiblelalala);
                this.refreshLista();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar alquiler o venta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos correctamente");
        }
    }//GEN-LAST:event_agregarYateActionPerformed

//    Actualiza la lista con los nuevos yates agregados.
    public void refreshLista() {
        Tienda tienda = control.getTienda();
        DefaultListModel modeloLista = new DefaultListModel();

        jList1.removeAll();

        int i = 0;
        for (Yate yate : tienda.getLista()) {
            modeloLista.add(i, yate.getModelo());
            i++;

        }
        jList1.setModel(modeloLista);
    }
    private void TxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtipoActionPerformed

    private void TxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMarcaActionPerformed

    private void TxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxModeloActionPerformed

    private void TxMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMotorActionPerformed

    private void TxCapAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapAActionPerformed

    private void TxHorasUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxHorasUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxHorasUsoActionPerformed

    private void TxCapTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapTanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapTanActionPerformed

    private void TxAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAnchoActionPerformed

    private void TxAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAltoActionPerformed

    private void TxVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxVCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxVCActionPerformed

    private void TxVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxVMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxVMActionPerformed

    private void TxCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCamActionPerformed

    private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaActionPerformed

    private void usadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usadoActionPerformed

    private void TxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxValorActionPerformed

    private void buscarPorModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPorModeloActionPerformed
        String modelo = (JOptionPane.showInputDialog("Ingrese el modelo a buscar"));
        for (Yate yate : control.getTienda().getLista()) {
            if (modelo.equalsIgnoreCase(yate.getModelo())) {
                JOptionPane.showMessageDialog(null, yate.toString());
            }
        }
    }//GEN-LAST:event_buscarPorModeloActionPerformed

    private void ordenarPorValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorValorActionPerformed
        control.ordenarPorValor();
        this.refreshLista();
    }//GEN-LAST:event_ordenarPorValorActionPerformed

    private void ordenarPorAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorAñoActionPerformed
        control.ordenarPorAño();
        this.refreshLista();
    }//GEN-LAST:event_ordenarPorAñoActionPerformed

//    Busca el yate con más camarotes.
    private void MasCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasCamActionPerformed
        ArrayList<Yate> yates = control.getTienda().getLista();
        Yate ya = new Yate();
        ya.setNumCamarotes(0);

        for (Yate y : yates) {
            if (y.getNumCamarotes() > ya.getNumCamarotes()) {
                ya = y;
            }
        }
        JOptionPane.showMessageDialog(null, ya);
    }//GEN-LAST:event_MasCamActionPerformed

    //    Busca el yate más barato.
    private void MasBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasBaratoActionPerformed
        ArrayList<Yate> yates = control.getTienda().getLista();
        Yate ya = new Yate();
        ya.setValor(999999);

        for (Yate y : yates) {
            if (y.getValor() < ya.getValor()) {
                ya = y;
            }
        }
        JOptionPane.showMessageDialog(null, ya);
    }//GEN-LAST:event_MasBaratoActionPerformed

    private void alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alquilerActionPerformed

    private void buscarPorAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPorAñoActionPerformed
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año a buscar"));
        for (Yate yate : control.getTienda().getLista()) {
            if (año == yate.getAño()) {
                JOptionPane.showMessageDialog(null, yate.toString());
            }
        }
    }//GEN-LAST:event_buscarPorAñoActionPerformed

    private void TxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAñoActionPerformed

//    boton atras.
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        Principal n = new Principal(control);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MasBarato;
    private javax.swing.JButton MasCam;
    private javax.swing.JTextField TxAlto;
    private javax.swing.JTextField TxAlto1;
    private javax.swing.JTextField TxAncho;
    private javax.swing.JTextField TxAncho1;
    private javax.swing.JTextField TxAño;
    private javax.swing.JTextField TxAño1;
    private javax.swing.JTextField TxCam;
    private javax.swing.JTextField TxCam1;
    private javax.swing.JTextField TxCapA;
    private javax.swing.JTextField TxCapA1;
    private javax.swing.JTextField TxCapTan;
    private javax.swing.JTextField TxCapTan1;
    private javax.swing.JTextField TxHorasUso;
    private javax.swing.JTextField TxHorasUso1;
    private javax.swing.JTextField TxMarca;
    private javax.swing.JTextField TxMarca1;
    private javax.swing.JTextField TxModelo;
    private javax.swing.JTextField TxModelo1;
    private javax.swing.JTextField TxMotor;
    private javax.swing.JTextField TxMotor1;
    private javax.swing.JTextField TxVC;
    private javax.swing.JTextField TxVC1;
    private javax.swing.JTextField TxVM;
    private javax.swing.JTextField TxVM1;
    private javax.swing.JTextField TxValor;
    private javax.swing.JTextField TxValor1;
    private javax.swing.JTextField Txtipo;
    private javax.swing.JTextField Txtipo1;
    private javax.swing.JButton agregarYate;
    private javax.swing.JCheckBox alquiler;
    private javax.swing.JButton atras;
    private javax.swing.JButton buscarPorAño;
    private javax.swing.JButton buscarPorModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ordenarPorAño;
    private javax.swing.JButton ordenarPorValor;
    private javax.swing.JCheckBox usado;
    private javax.swing.JCheckBox venta;
    // End of variables declaration//GEN-END:variables

    
//    Muestra datos del yate seleccionado de la lista en el Jpanel de datos.
    public void muestraCampos() {
        String modelo = jList1.getSelectedValue();

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
