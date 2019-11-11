/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.control;

import agenda.bancodedados.conexao;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author maicon
 */
public class cadastroclientecontrol {
     public String Inserecadastro(String nome,String email,String senhas ){
        conexao banco= new conexao();
        String retorno = "ERRO";
        try{
            Connection exconn=banco.abrirBDconn();
            Statement Stmt= exconn.createStatement();
            
            String mysql="INSERT INTO banco.cadastro VALUES(null,'"+nome+"','"+email+"',','"+senhas+"');";
            boolean res=Stmt.execute(mysql);
            //mandar imprimir string banco
            System.out.println(mysql);
           
            
            JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso":""+"Os dados nao foram inseridos com sucesso");
            Stmt.close();
            banco.fecharBDconn();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Os dados nao foram inseridos com sucesso");
        }
        return retorno;
        
    }

    
}

    



