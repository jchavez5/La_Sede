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

    public void activar(JRadioButton chek1, JRadioButton chek2, JButton boton, DateChooserCombo date) {
        chek1.setVisible(false);
        chek2.setVisible(false);
        boton.setVisible(false);
        date.setVisible(false);

    }

    public void descativar(JRadioButton chek1, JRadioButton chek2, JButton boton, DateChooserCombo date) {
        chek1.setVisible(true);
        chek2.setVisible(true);
        boton.setVisible(true);
        date.setVisible(true);

    }
//efecto de colores

    public void EventoConsultaActivar(int valor, JLabel titulo, JRadioButton chek1, JRadioButton chek2, JButton boton, DateChooserCombo date) {
        if (valor == 1) {
            titulo.setText("Buscar Empleado: ");
        }
        if (valor == 2) {
            titulo.setText("Ventas de la residencia: ");
        }
        if (valor == 3) {
            titulo.setText("Ventas de la residenciauscar hechas por Empleado: ");
        }
        if (valor == 4) {
            titulo.setText("Movimiento de caja: ");
        }

        descativar(chek1, chek2, boton, date);
    }

    public void resetColorLabel(JLabel[] label) {
        for (int i = 0; i < label.length; i++) {
            label[i].setForeground(new Color(255, 82, 82));
        }
    }

    public void resetColorJPanel(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(255, 255, 255));
        }
    }
//
    public boolean Empleado = false, Venta = false, VenteEm = false, Caja = false;

    public void activar(boolean empleado, boolean venta, boolean venteEm, boolean caja) {
        Empleado = empleado;
        Venta = venta;
        VenteEm = venteEm;
        Caja = caja;
    }

}
