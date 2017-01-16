/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class Conexion {
    protected static Connection conec = null;
    
    private static void conectar(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    conec = DriverManager.getConnection("jdbc:mysql//localhost:3306/mydb", "root", "");
    }catch(SQLException ex){
        System.out.println("Error"+ ex.getMessage());
    }catch (ClassNotFoundException e){
        System.out.println("Error inesperado"+ e.getMessage());
    }  
}
    private Conexion(){
        
    }
    public static Connection getInstance(){
        if (conec == null) {
            conectar();
    }
        return conec;
    }
}
