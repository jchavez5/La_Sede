/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.loginObjetos;
/**
 *
 * @author User
 */
public class login {
private Connection conn;
public void realizaConexion(){
        conn = null;
        String urlDatabase =  "jdbc:postgresql://localhost:5432/la_sede";
        try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(urlDatabase,  "postgres", "q4xnkvc1");
        } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Ocurrio un error : "+e.getMessage());
        }
}
public loginObjetos logiarce(String user,String pass){
    loginObjetos devolver;
    try {
        Statement stmt = conn.createStatement(); 
        ResultSet rs = stmt.executeQuery("SELECT * from buscar_usuario('"+user+"','"+pass+"');");
        if(rs.next() && rs.getObject(1)!=null){
            devolver = new loginObjetos(rs.getString(1),rs.getString(2),rs.getBoolean(3));
            return devolver;
        }
    } catch (SQLException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}
}

