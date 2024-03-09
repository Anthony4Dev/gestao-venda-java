package modelo;

import modelo.conexao.Conexao;
import modelo.conexao.ConexaoMySQL;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexao conexao = new ConexaoMySQL();

        try {
            System.out.println(conexao.obterConexao());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}