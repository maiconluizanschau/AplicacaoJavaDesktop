/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaologin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author maicon
 */
public class conexaologin {
    
    private static final String uri_mysql="jdbc:mysql://localhost:3306/banco?zeroDateTimeBehavior=convertToNull";
    private static final String driver_mysql="com.mysql.jdbc.Driver";
    private static final String user_mysql="root";
    private static final String password_mysql="123456";
    
    
    //criando metodode conexao
    
    public static Connection getConnection(){
        System.out.println("Conectando ao banco de dados");
        try {
            Class.forName(driver_mysql);
            return DriverManager.getConnection(uri_mysql, user_mysql,password_mysql);
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }catch(SQLException ex){
         //   throws new RuntimeException(ex){
            
        }
        return null;
        
    }
    public static void close(Connection conn,PreparedStatement prm, Result res ){
        System.out.println("Descontefdfsdf");
       try{
           if(conn!=null){
               conn.close();
           }
           if(prm!=null && res!=null){
               prm.close();
           }
           }catch(SQLException e){
                   e.printStackTrace();
                   }
    }
       public static void main(String args[]){
       
           
           getConnection();
       }  
           
        
    }
    

