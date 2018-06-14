/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Josechavez
 */
public class loginObjetos {
    private String usuario;
    private String  contraseña;
    private boolean visible;

    public loginObjetos(String usuario, String contraseña, boolean visible) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.visible = visible;
    }

    public loginObjetos() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "loginObjetos{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", visible=" + visible + '}';
    }
    
    
    
}
