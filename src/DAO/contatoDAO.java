/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Agendabancodades.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicon
 */
public class contatoDAO {

    private Connection conexao;

 //   public contatoDAO(){
        //  this.conexao = CriaConexao.getConexao();
    //}
    public void adiciona(Contato contato) throws SQLException {
        //prepara conexao ler o codigo sql ?? ajuda impedir sqlinjection
        String sql = "insert into contato(nome,endereco,telefone,email,sexo)" + "values(?,?,?,?,?)";
        PreparedStatement stat = conexao.prepareStatement(sql);
        //setar os valores pelo stat
        stat.setString(1, contato.getNome());
        stat.setString(2, contato.getEndereco());
        stat.setString(3, contato.getTelefone());
        stat.setString(4, contato.getEmail());
        stat.setString(5, contato.getSexo());
        //executa o codigo sql
        stat.execute();
        stat.close();

    }

    public List<Contato> getLista(String nome) throws SQLException {
        String sql = "select *from contato where nome like ?";
        PreparedStatement stat = this.conexao.prepareStatement(sql);
        stat.setString(1, nome);
        ResultSet rs = stat.executeQuery();

        List<Contato> minhaLista = new ArrayList<Contato>();

        while (rs.next()) {
            Contato contato = new Contato();
            contato.setId(Long.valueOf(rs.getString("id")));
            contato.setNome(rs.getString("nome"));
            contato.setEndereco(rs.getString("Endereco"));
            contato.setTelefone(rs.getString("Telefone"));
            contato.setEmail(rs.getString("Email"));
            contato.setSexo(rs.getString("Sexo"));
            minhaLista.add(contato);

        }
        rs.close();
        stat.close();
        return minhaLista;

    }

}
