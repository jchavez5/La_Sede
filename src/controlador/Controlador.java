/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
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
        int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea salir del login)", "EXIT", dialogButton);
        if (resultado == 0) {
            System.exit(0);
        }
    }

}
