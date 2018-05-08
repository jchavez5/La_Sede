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
import javax.swing.JButton;
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
    public boolean activo = false;
    public boolean inicio = false,alquiler=false,movimiento=false;

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
        activo = true;

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

    public void efectoQuitarColorSalir(JPanel panelPrincipal) {
        panelPrincipal.setBackground(new Color(244, 67, 54));
    }

    public void efectoColocarColor(JPanel panelPrincipal) {
        panelPrincipal.setBackground(new Color(150, 40, 27));
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

    public void efectoColorButton(JButton panelPrincipal) {
        panelPrincipal.setBackground(new Color(150, 40, 27));
    }

    public void efectoQuitarColorbotton(JButton panelPrincipal) {
        panelPrincipal.setBackground(new Color(244, 67, 54));
    }
//////////////// movimiento del mouse

    public void setColorMovimiento(JPanel pane, JPanel Sdpane, JLabel label) {
        if (inicio == false) {
            label.setForeground(new Color(255, 82, 82));
            pane.setBackground(new Color(189, 189, 189));
            Sdpane.setBackground(new Color(189, 189, 189));
            activo = false;
        }

    }

    public void resetColorMovimiento(JPanel pane, JPanel Sdpane, JLabel label) {
        if (activo == false) {
            label.setForeground(new Color(222, 222, 222));
            pane.setBackground(new Color(69, 90, 100));
            Sdpane.setBackground(new Color(69, 90, 100));

        }

    }

    public void activar(String cadena) {
        if (cadena == "inicio") {
            inicio = true;
        } else {
            inicio = false;
        }
        if (cadena=="alquiler") {
            movimiento=true;
        }else{
            movimiento=false;
        }
    }

}
