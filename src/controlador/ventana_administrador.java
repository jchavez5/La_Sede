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
import objetos.usuarios;

/**
 *
 * @author User
 */
public class ventana_administrador {

    public static usuarios usuario;

    public ventana_administrador() {
    }

    public void IniciarLogin(JLabel texto, JLabel fecha) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        texto.setText(texto.getText() + " " + usuario.getNombre());
        fecha.setText(fecha.getText() + " " + dateFormat.format(date));

    }

}
