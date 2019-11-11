/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredisciplinaorientacaoaobjetos;

import Agendabancodades.Contato;
import InterfaceGraficasistema.TelaLogin;
import agenda.bancodedados.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maicon
 */
public class Softwaredisciplinaorientacaoaobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metodo chama a tela de login
        JFrame frame = new TelaLogin();
        frame.show();
    }

}
