/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 

 

/**
 *
 * @author PIYUMINI
 */
 
public class DBconnection {
    private static DBconnection dbConnection;
    private Connection connection;
    
    private DBconnection(){
       try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket" ,"root", "1234");
             
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public static DBconnection getInstance(){ 
       if (dbConnection==null){
           dbConnection= new DBconnection();
       }
       return dbConnection;
   } 
   public Connection getConnection(){
        return connection;
   }
}
