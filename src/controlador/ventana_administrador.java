/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import objetos.loginObjetos;
import objetos.usuarios;

/**
 *
 * @author User
 */
public class ventana_administrador {

    public static loginObjetos usuario;
    public static usuarios usu;

    public ventana_administrador() {
    }

    public void IniciarLogin(JLabel texto, JLabel fecha) {
        Date date = new Date();
        modelo.login logeo =new modelo.login();
        //Date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fecha.setText(fecha.getText() + " " + dateFormat.format(date));
        //al iniciar programa
        logeo.realizaConexion();
        String nombre = logeo.TraerRolUsuario(usu.getIdrol());
        texto.setText(texto.getText()+""+ nombre);
       

    }

}
