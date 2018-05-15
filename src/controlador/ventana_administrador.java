/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JLabel;
import objetos.usuarios;
import vista.Ventana_Administrador;

/**
 *
 * @author User
 */
public class ventana_administrador {
    public static usuarios usuario;
    private Ventana_Administrador view;

    public ventana_administrador() {
    }
   // bienvenido.setText(bienvenido.getText()+" "+usuario.getNombre());
    public ventana_administrador(Ventana_Administrador view) {
        this.view = view;
    }
    public String IniciarLogin(String nombre,JLabel texto){
        texto.setText(texto.getText()+" "+usuario.getNombre());
        return nombre;
    }
    
    
    
    
}
