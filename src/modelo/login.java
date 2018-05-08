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
        conn = DriverManager.getConnection(urlDatabase,  "postgres", "admin");
        } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Ocurrio un error : "+e.getMessage());
        }
}
public String  logiarce(String user,String pass){
    String devolver = new String();
    try {
        Statement stmt = conn.createStatement(); 
        ResultSet rs = stmt.executeQuery("SELECT buscar_usuario('"+user+"','"+pass+"');");
        rs.next();
        devolver = rs.getString(1);
    } catch (SQLException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }
    return devolver;
}
}

