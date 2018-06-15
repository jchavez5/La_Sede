/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.loginObjetos;
import objetos.usuarios;

/**
 *
 * @author User
 */
public class registro_empleado {
    private Connection conn;
    public void realizaConexion(){
        conn = null;
        String urlDatabase =  "jdbc:postgresql://localhost:5432/la_sede";
        try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(urlDatabase,  "postgres", "admin");
        } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Ocurrio un error : "+e.getMessage());
        }
    }
    
    public void guardar_empleado(usuarios n1, loginObjetos n2, String contra){
        try{
            Statement stmt = conn.createStatement(); 
            String sql1 = "SELECT public.agregar_usuario('"
                    + n1.getNombre()+"','"
                    + n1.getApellido()+"','"
                    + n1.getTelefono()+"',"
                    + n1.getCedula()+","
                    + n1.getIdrol()+",'"+n1.getCorreo()+"');";
            String sql2 ="UPDATE public.login SET \"contraseña\"='"+contra+"'" 
                    + "WHERE usuario='"+n1.getCedula()+"';";
            String sql3="INSERT INTO public.registros(idusuario, actividad, descripcion, fecha)VALUES ("
                    + n2.getId()+", "
                    + "'Crear empleado', "
                    + "'El cliente ha creado un nuevo empleado', "
                    + "current_timestamp);";
            stmt.executeQuery(sql1);
            stmt.executeUpdate(sql2);
            stmt.execute(sql3);
        }catch (SQLException ex) {
        
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }
}
