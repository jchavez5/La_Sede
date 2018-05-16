/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ventana_administrador;
import objetos.usuarios;

/**
 *
 * @author Josechavez
 */
public class Ventana_Administrador extends javax.swing.JFrame {

    Controlador c = new Controlador();
    ventana_administrador cAdm=new  ventana_administrador();
    private final usuarios usuario = ventana_administrador.usuario;

    /**
     * Creates new form Ventana_Administrador
     */
    public Ventana_Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        cAdm.IniciarLogin(bienvenido,Fecha);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InicioAdm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        SdIniciAdm = new javax.swing.JPanel();
        AlquilerAdm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SdAlquilerAdm = new javax.swing.JPanel();
        lblAlquilerAdm1 = new javax.swing.JLabel();
        MovimientoAdm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMovimientoAdm = new javax.swing.JLabel();
        SdMovimientoAdm = new javax.swing.JPanel();
        ConsultaAdm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lvlConsultaADm = new javax.swing.JLabel();
        SdConsultaAdm = new javax.swing.JPanel();
        ReportAdm = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblReporteAdm = new javax.swing.JLabel();
        SdReporteAdm = new javax.swing.JPanel();
        CrearAdm = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblCrearAdm = new javax.swing.JLabel();
        SdCrearAdm = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NameTittle = new javax.swing.JLabel();
        SalirAdm = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        MostarAdm = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        bienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 216, 220));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(69, 90, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioAdm.setBackground(new java.awt.Color(69, 90, 100));
        InicioAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Home_32px.png"))); // NOI18N
        InicioAdm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblInicio.setBackground(new java.awt.Color(69, 90, 100));
        lblInicio.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
        });
        InicioAdm.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 170, 50));

        SdIniciAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdIniciAdmLayout = new javax.swing.GroupLayout(SdIniciAdm);
        SdIniciAdm.setLayout(SdIniciAdmLayout);
        SdIniciAdmLayout.setHorizontalGroup(
            SdIniciAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdIniciAdmLayout.setVerticalGroup(
            SdIniciAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        InicioAdm.add(SdIniciAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jPanel1.add(InicioAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 50));

        AlquilerAdm.setBackground(new java.awt.Color(69, 90, 100));
        AlquilerAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Wi-Fi_32px.png"))); // NOI18N
        AlquilerAdm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        SdAlquilerAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdAlquilerAdmLayout = new javax.swing.GroupLayout(SdAlquilerAdm);
        SdAlquilerAdm.setLayout(SdAlquilerAdmLayout);
        SdAlquilerAdmLayout.setHorizontalGroup(
            SdAlquilerAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdAlquilerAdmLayout.setVerticalGroup(
            SdAlquilerAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        AlquilerAdm.add(SdAlquilerAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblAlquilerAdm1.setBackground(new java.awt.Color(204, 204, 204));
        lblAlquilerAdm1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblAlquilerAdm1.setForeground(new java.awt.Color(255, 255, 255));
        lblAlquilerAdm1.setText("Alquilar habitacion");
        lblAlquilerAdm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlquilerAdm1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlquilerAdm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlquilerAdm1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAlquilerAdm1MousePressed(evt);
            }
        });
        AlquilerAdm.add(lblAlquilerAdm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 54));

        jPanel1.add(AlquilerAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 50));

        MovimientoAdm.setBackground(new java.awt.Color(69, 90, 100));
        MovimientoAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Money_32px.png"))); // NOI18N
        MovimientoAdm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblMovimientoAdm.setBackground(new java.awt.Color(204, 204, 204));
        lblMovimientoAdm.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblMovimientoAdm.setForeground(new java.awt.Color(255, 255, 255));
        lblMovimientoAdm.setText("Movimiento de caja");
        lblMovimientoAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovimientoAdmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMovimientoAdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMovimientoAdmMouseExited(evt);
            }
        });
        MovimientoAdm.add(lblMovimientoAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 54));

        SdMovimientoAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdMovimientoAdmLayout = new javax.swing.GroupLayout(SdMovimientoAdm);
        SdMovimientoAdm.setLayout(SdMovimientoAdmLayout);
        SdMovimientoAdmLayout.setHorizontalGroup(
            SdMovimientoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdMovimientoAdmLayout.setVerticalGroup(
            SdMovimientoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        MovimientoAdm.add(SdMovimientoAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(MovimientoAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        ConsultaAdm.setBackground(new java.awt.Color(69, 90, 100));
        ConsultaAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Document_32px.png"))); // NOI18N
        ConsultaAdm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lvlConsultaADm.setBackground(new java.awt.Color(204, 204, 204));
        lvlConsultaADm.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lvlConsultaADm.setForeground(new java.awt.Color(255, 255, 255));
        lvlConsultaADm.setText("Consultas");
        lvlConsultaADm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlConsultaADmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvlConsultaADmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvlConsultaADmMouseExited(evt);
            }
        });
        ConsultaAdm.add(lvlConsultaADm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 56));

        SdConsultaAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdConsultaAdmLayout = new javax.swing.GroupLayout(SdConsultaAdm);
        SdConsultaAdm.setLayout(SdConsultaAdmLayout);
        SdConsultaAdmLayout.setHorizontalGroup(
            SdConsultaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdConsultaAdmLayout.setVerticalGroup(
            SdConsultaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ConsultaAdm.add(SdConsultaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(ConsultaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 50));

        ReportAdm.setBackground(new java.awt.Color(69, 90, 100));
        ReportAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Print_32px.png"))); // NOI18N
        ReportAdm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 12, -1, -1));

        lblReporteAdm.setBackground(new java.awt.Color(204, 204, 204));
        lblReporteAdm.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblReporteAdm.setForeground(new java.awt.Color(255, 255, 255));
        lblReporteAdm.setText("Reportes");
        lblReporteAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReporteAdmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReporteAdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReporteAdmMouseExited(evt);
            }
        });
        ReportAdm.add(lblReporteAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 0, 162, 56));

        SdReporteAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdReporteAdmLayout = new javax.swing.GroupLayout(SdReporteAdm);
        SdReporteAdm.setLayout(SdReporteAdmLayout);
        SdReporteAdmLayout.setHorizontalGroup(
            SdReporteAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdReporteAdmLayout.setVerticalGroup(
            SdReporteAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ReportAdm.add(SdReporteAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(ReportAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        CrearAdm.setBackground(new java.awt.Color(69, 90, 100));
        CrearAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Male User_32px.png"))); // NOI18N
        CrearAdm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblCrearAdm.setBackground(new java.awt.Color(204, 204, 204));
        lblCrearAdm.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblCrearAdm.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearAdm.setText("Crear empleado");
        lblCrearAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearAdmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrearAdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrearAdmMouseExited(evt);
            }
        });
        CrearAdm.add(lblCrearAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 53));

        SdCrearAdm.setBackground(new java.awt.Color(69, 90, 100));

        javax.swing.GroupLayout SdCrearAdmLayout = new javax.swing.GroupLayout(SdCrearAdm);
        SdCrearAdm.setLayout(SdCrearAdmLayout);
        SdCrearAdmLayout.setHorizontalGroup(
            SdCrearAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SdCrearAdmLayout.setVerticalGroup(
            SdCrearAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        CrearAdm.add(SdCrearAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(CrearAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        jPanel2.setBackground(new java.awt.Color(117, 117, 117));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Minimize Window_32px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        NameTittle.setBackground(new java.awt.Color(204, 204, 204));
        NameTittle.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        NameTittle.setForeground(new java.awt.Color(255, 255, 255));
        NameTittle.setText("NombreDeLaAPP Version 1.0 [Español]");
        NameTittle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NameTittleMousePressed(evt);
            }
        });

        SalirAdm.setBackground(new java.awt.Color(255, 82, 82));
        SalirAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Cerrar Sesión");
        jLabel14.setToolTipText("");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        SalirAdm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        Fecha.setBackground(new java.awt.Color(204, 204, 204));
        Fecha.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("Fecha :");
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(NameTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalirAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));

        MostarAdm.setBackground(new java.awt.Color(207, 216, 220));
        MostarAdm.setForeground(new java.awt.Color(96, 125, 139));

        javax.swing.GroupLayout MostarAdmLayout = new javax.swing.GroupLayout(MostarAdm);
        MostarAdm.setLayout(MostarAdmLayout);
        MostarAdmLayout.setHorizontalGroup(
            MostarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        MostarAdmLayout.setVerticalGroup(
            MostarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(MostarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1080, 600));

        jPanel3.setBackground(new java.awt.Color(117, 117, 117));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1300, -1));

        bienvenido.setBackground(new java.awt.Color(204, 204, 204));
        bienvenido.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("Bienvenido:");
        bienvenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bienvenidoMousePressed(evt);
            }
        });
        jPanel1.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 210, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTittleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameTittleMousePressed
        c.setColor(AlquilerAdm, SdAlquilerAdm, lblAlquilerAdm1);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, MovimientoAdm, SdMovimientoAdm, ConsultaAdm, SdConsultaAdm, ReportAdm, SdReporteAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblMovimientoAdm, lvlConsultaADm, lblReporteAdm, lblCrearAdm});
    }//GEN-LAST:event_NameTittleMousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        c.salir();
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MousePressed

    private void lblCrearAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearAdmMouseClicked
        RegistroEmpleado r = new RegistroEmpleado();
        c.mostrar(MostarAdm, r);
        c.setColor(CrearAdm, SdCrearAdm, lblCrearAdm);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, AlquilerAdm, SdAlquilerAdm, MovimientoAdm, SdMovimientoAdm, ConsultaAdm, SdConsultaAdm, ReportAdm, SdReporteAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblAlquilerAdm1, lblMovimientoAdm, lvlConsultaADm, lblReporteAdm});
        c.activar(false, false, false, false, false, true);
    }//GEN-LAST:event_lblCrearAdmMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        Inicio i = new Inicio();
        c.mostrar(MostarAdm, i);
        c.setColor(InicioAdm, SdIniciAdm, lblInicio);
        c.resetColorJPanel(new JPanel[]{AlquilerAdm, SdAlquilerAdm, MovimientoAdm, SdMovimientoAdm, ConsultaAdm, SdConsultaAdm, ReportAdm, SdReporteAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblAlquilerAdm1, lblMovimientoAdm, lvlConsultaADm, lblReporteAdm, lblCrearAdm});
        c.activar(true, false, false, false, false, false);

    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblReporteAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteAdmMouseClicked
        Reporte Re = new Reporte();
        c.mostrar(MostarAdm, Re);
        c.setColor(ReportAdm, SdReporteAdm, lblReporteAdm);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, AlquilerAdm, SdAlquilerAdm, MovimientoAdm, SdMovimientoAdm, ConsultaAdm, SdConsultaAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblAlquilerAdm1, lblMovimientoAdm, lvlConsultaADm, lblCrearAdm});
        c.activar(false, false, false, false, true, false);
    }//GEN-LAST:event_lblReporteAdmMouseClicked

    private void lvlConsultaADmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlConsultaADmMouseClicked
        Consulta Con = new Consulta();
        c.mostrar(MostarAdm, Con);
        c.setColor(ConsultaAdm, SdConsultaAdm, lvlConsultaADm);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, AlquilerAdm, SdAlquilerAdm, MovimientoAdm, SdMovimientoAdm, ReportAdm, SdReporteAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblAlquilerAdm1, lblMovimientoAdm, lblReporteAdm, lblCrearAdm});
        c.activar(false, false, false, true, false, false);
    }//GEN-LAST:event_lvlConsultaADmMouseClicked

    private void lblMovimientoAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoAdmMouseClicked
        MovimientoCaja Mov = new MovimientoCaja();
        c.mostrar(MostarAdm, Mov);
        c.setColor(MovimientoAdm, SdMovimientoAdm, lblMovimientoAdm);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, AlquilerAdm, SdAlquilerAdm, ConsultaAdm, SdConsultaAdm, ReportAdm, SdReporteAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblAlquilerAdm1, lvlConsultaADm, lblReporteAdm, lblCrearAdm});
        c.activar(false, false, true, false, false, false);
    }//GEN-LAST:event_lblMovimientoAdmMouseClicked

    private void lblAlquilerAdm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlquilerAdm1MouseClicked
        AlquilarHabitacion al = new AlquilarHabitacion();
        c.mostrar(MostarAdm, al);
        c.setColor(AlquilerAdm, SdAlquilerAdm, lblAlquilerAdm1);
        c.resetColorJPanel(new JPanel[]{InicioAdm, SdIniciAdm, MovimientoAdm, SdMovimientoAdm, ConsultaAdm, SdConsultaAdm, ReportAdm, SdReporteAdm, CrearAdm, SdCrearAdm});
        c.resetColorLabel(new JLabel[]{lblInicio, lblMovimientoAdm, lvlConsultaADm, lblReporteAdm, lblCrearAdm});
        c.activar(false, true, false, false, false, false);
    }//GEN-LAST:event_lblAlquilerAdm1MouseClicked

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        if (c.AcInicio == false) {
            c.setColorMovimiento(InicioAdm, SdIniciAdm, lblInicio);
        }

    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        if (c.AcInicio == false) {
            c.resetColorMovimiento(InicioAdm, SdIniciAdm, lblInicio);
        }

    }//GEN-LAST:event_lblInicioMouseExited

    private void lblAlquilerAdm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlquilerAdm1MouseEntered
        if (c.AcVenta == false) {
            c.setColorMovimiento(AlquilerAdm, SdAlquilerAdm, lblAlquilerAdm1);
        }

    }//GEN-LAST:event_lblAlquilerAdm1MouseEntered

    private void lblAlquilerAdm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlquilerAdm1MouseExited
        if (c.AcVenta == false) {
            c.resetColorMovimiento(AlquilerAdm, SdAlquilerAdm, lblAlquilerAdm1);
        }

    }//GEN-LAST:event_lblAlquilerAdm1MouseExited

    private void lblAlquilerAdm1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlquilerAdm1MousePressed
    }//GEN-LAST:event_lblAlquilerAdm1MousePressed

    private void lblMovimientoAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoAdmMouseEntered
        if (c.AcMov == false) {
            c.setColorMovimiento(MovimientoAdm, SdMovimientoAdm, lblMovimientoAdm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMovimientoAdmMouseEntered

    private void lblMovimientoAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovimientoAdmMouseExited
        if (c.AcMov == false) {
            c.resetColorMovimiento(MovimientoAdm, SdMovimientoAdm, lblMovimientoAdm);
        }
    }//GEN-LAST:event_lblMovimientoAdmMouseExited

    private void lvlConsultaADmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlConsultaADmMouseEntered
        if (c.AcCons == false) {
            c.setColorMovimiento(ConsultaAdm, SdConsultaAdm, lvlConsultaADm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlConsultaADmMouseEntered

    private void lvlConsultaADmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlConsultaADmMouseExited

        if (c.AcCons==false) {
            c.resetColorMovimiento(ConsultaAdm, SdConsultaAdm, lvlConsultaADm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlConsultaADmMouseExited

    private void lblReporteAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteAdmMouseEntered
        if (c.AcRepo == false) {
            c.setColorMovimiento(ReportAdm, SdReporteAdm, lblReporteAdm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReporteAdmMouseEntered

    private void lblReporteAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteAdmMouseExited
        if (c.AcRepo == false) {
            c.resetColorMovimiento(ReportAdm, SdReporteAdm, lblReporteAdm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReporteAdmMouseExited

    private void lblCrearAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearAdmMouseEntered
        if (c.AcCrea == false) {
            c.setColorMovimiento(CrearAdm, SdCrearAdm, lblCrearAdm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCrearAdmMouseEntered

    private void lblCrearAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearAdmMouseExited
         if (c.AcCrea == false) {
            c.resetColorMovimiento(CrearAdm, SdCrearAdm, lblCrearAdm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCrearAdmMouseExited

    private void FechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaMousePressed

    private void bienvenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienvenidoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bienvenidoMousePressed

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        c.efectoColocarColor(SalirAdm);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        c.efectoQuitarColorSalir(SalirAdm);
    }//GEN-LAST:event_jLabel14MouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlquilerAdm;
    private javax.swing.JPanel ConsultaAdm;
    private javax.swing.JPanel CrearAdm;
    private javax.swing.JLabel Fecha;
    private javax.swing.JPanel InicioAdm;
    private javax.swing.JDesktopPane MostarAdm;
    private javax.swing.JPanel MovimientoAdm;
    private javax.swing.JLabel NameTittle;
    private javax.swing.JPanel ReportAdm;
    private javax.swing.JPanel SalirAdm;
    private javax.swing.JPanel SdAlquilerAdm;
    private javax.swing.JPanel SdConsultaAdm;
    private javax.swing.JPanel SdCrearAdm;
    private javax.swing.JPanel SdIniciAdm;
    private javax.swing.JPanel SdMovimientoAdm;
    private javax.swing.JPanel SdReporteAdm;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAlquilerAdm1;
    private javax.swing.JLabel lblCrearAdm;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMovimientoAdm;
    private javax.swing.JLabel lblReporteAdm;
    private javax.swing.JLabel lvlConsultaADm;
    // End of variables declaration//GEN-END:variables
}
