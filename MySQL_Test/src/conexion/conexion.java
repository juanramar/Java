/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author JuanRaMar
 */
public class conexion {
    
    private Connection con = null;
    
    public Connection conexion() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_test", "root","");
            
        }catch (ClassNotFoundException e){
        }
        return con;
    }
        
    
    public void cerrarConexion (Connection con){
        try{
            con.close();
            }catch(SQLException e){
        }
    }
    
}
