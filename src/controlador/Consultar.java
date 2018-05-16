/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datechooser.beans.DateChooserCombo;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import vista.Consulta;

/**
 *
 * @author Josechavez
 */
public class Consultar {

    private Consulta view;

    public Consultar(Consulta view) {
        this.view = view;
    }

    public void iniciar( JRadioButton chek1, JRadioButton chek2, JButton boton, DateChooserCombo date) {
        chek1.setVisible(false);
        chek2.setVisible(false);
        boton.setVisible(false);
        date.setVisible(false);

    }
//efecto de colores
    public void botonEmpleado(JPanel reportesPanel, JLabel titulo) {
        reportesPanel.setVisible(true);
        titulo.setText("Buscar Empleado: ");
        

    }

    public void botonVentas(JPanel reportesPanel, JLabel titulo) {
        reportesPanel.setVisible(true);
        titulo.setText("Ventas de la residencia: ");

    }

    public void botonVentasEmpleado(JPanel reportesPanel, JLabel titulo) {
        reportesPanel.setVisible(true);
        titulo.setText("Ventas de la residenciauscar hechas por Empleado: ");

    }

    public void botonCaja(JPanel reportesPanel, JLabel titulo) {
        reportesPanel.setVisible(true);
        titulo.setText("Movimiento de caja: ");

    }
     public void resetColorLabel(JLabel[] label) {
        for (int i = 0; i < label.length; i++) {
            label[i].setForeground(new Color(255,82,82));
        }
    }

    public void resetColorJPanel(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(255,255,255));
        }
    }
//
    public boolean Empleado = false, Venta = false, VenteEm = false, Caja = false;

    public void activar(boolean empleado, boolean venta, boolean venteEm, boolean caja) {
        Empleado=empleado ;
        Venta=venta ;
        VenteEm=venteEm ;
        Caja=caja ;
    }

}
