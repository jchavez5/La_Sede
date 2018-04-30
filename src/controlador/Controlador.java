/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.login;

/**
 *
 * @author Josechavez
 */
public class Controlador implements ActionListener{
    private login view;
    
    public Controlador(login view){
        this.view= view;
        this.view.cerrar.addActionListener(this);
    }
    public void iniciar(){
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
        int resultado=JOptionPane.showConfirmDialog(null,"Desea salir del login)","EXIT",dialogButton);
        if (resultado==0) {
            System.exit(0);
        }
    }
    
}
