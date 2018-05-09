package objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class usuarios {
    private int id;
    private String nombre;
    private String telefono;
    private  int cedula;
    private  int idrol;
    private String correo;
    private String usario;
    private String contrasena;
    private boolean visible;
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public usuarios(int id, String nombre, String telefono, int cedula, int idrol, String correo, String usario, String contrasena, boolean visible) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.idrol = idrol;
        this.correo = correo;
        this.usario = usario;
        this.contrasena = contrasena;
        this.visible = visible;
    }
    
    
    
}
