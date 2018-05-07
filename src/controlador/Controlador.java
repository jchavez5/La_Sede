/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.RegistroEmpleado;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.security.cert.Extension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.login;

/**
 *
 * @author Josechavez
 */
public class Controlador {

    private login view;

    public Controlador() {
    }

    public Controlador(login view) {
        this.view = view;
    }

    public void iniciar() {
        view.setLocationRelativeTo(null);
    }

    public void salir() {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea salir del login?", "EXIT", dialogButton);
        if (resultado == 0) {
            System.exit(0);
        }
    }

    public void cerrar() {
        System.exit(0);

    }

    public void setColor(JPanel pane, JPanel Sdpane, JLabel label) {
        label.setForeground(new Color(255, 82, 82));
        pane.setBackground(new Color(207, 216, 220));
        Sdpane.setBackground(new Color(255, 82, 82));
    }

    public void resetColorLabel(JLabel[] label) {
        for (int i = 0; i < label.length; i++) {
            label[i].setForeground(new Color(255, 255, 255));
        }
    }

    public void resetColorJPanel(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(69, 90, 100));
        }
    }

    public void efectoQuitarColor(JPanel panelPrincipal) {
        panelPrincipal.setBackground(new Color(69, 90, 100));
    }

    public void efectoColocarColor(JPanel panelPrincipal) {
        panelPrincipal.setBackground(new Color(255, 82, 82));
    }

    public void mostrar(JDesktopPane mostrar, JInternalFrame x) {

        mostrar.add(x);
        x.show();
        try {
            x.setMaximum(true);
            x.setUI(null);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

}
