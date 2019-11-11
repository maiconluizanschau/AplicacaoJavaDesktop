/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author maicon
 */
public class conexao {

    public static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    private Connection conn;
    private Statement Stmt;
    
    
    public conexao(){
        
    }
    
    public Connection abrirBDconn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/agendabd?zeroDateTimeBehavior=convertToNull";
            con=DriverManager.getConnection(url, "root", "123456");
            System.out.println("Conexao com banco de dados realizada com sucesso");
            return con;
        }catch(Exception e){
            System.out.println("ERROR! Conexao com problemas");
            e.printStackTrace();
            return null;
        }
    }
    public void fecharBDconn(){
        try{
            con.close();
            System.out.println("Conexao finalizada com sucesso");
            
        }catch(Exception e){
            System.out.println("Erro ao fechar conexao com banco de dados"+e.getMessage());
        }
    }
    
    
}
