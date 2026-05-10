package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {
	
    public void inserir(String nome_produto, double quantidade, int cod_unidade, double preco_unitario) {
        String sql = "INSERT INTO produtos(nome_produto, quantidade, cod_unidade, preco_unitario) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
            PreparedStatement smt = conn.prepareStatement(sql)) {
            smt.setString(1, nome_produto);
            smt.setDouble(2, quantidade);
            smt.setInt(3, cod_unidade);
            smt.setDouble(4, preco_unitario);
            smt.executeUpdate();
            System.out.println("Produto inserido com sucesso!\n");
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Falhas na inserção do produto!\n");
        }
    }

    public List<String> listar() {
        List<String> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (Connection conn = Conexao.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                produtos.add(rs.getInt("id_produto") + " - " + rs.getString("nome_produto") + " - " 
                + rs.getDouble("quantidade") + " - " + rs.getInt("cod_unidade") + rs.getDouble("preco_unitario"));
            }
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Falhas na consulta de Produto!\n");
        }
        return produtos;
    }

    public void atualizar(String nome_produto, double quantidade, int cod_unidade, int id_produto, double preco_unitario) {
        String sql = "UPDATE produtos SET nome_produto = ?, quantidade = ?, cod_unidade = ?, preco_unitario = ?  WHERE id_produto = ?";
        try (Connection conn = Conexao.getConnection();
            PreparedStatement smt = conn.prepareStatement(sql)) {
            smt.setString(1, nome_produto);
            smt.setDouble(2, quantidade);
            smt.setInt(3, cod_unidade);
            smt.setDouble(4, preco_unitario);
            smt.setInt(5, id_produto);
            smt.executeUpdate();
            System.out.println("Produto atualizado com sucesso!\n");
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Falhas na atualização do Produto!");
        }
    }

    public void deletar(int id_produto) {
        String sql = "DELETE FROM produtos WHERE id_produto = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement smt = conn.prepareStatement(sql)) {
            smt.setInt(1, id_produto);
            smt.executeUpdate();
            System.out.println("Produto deletado com sucesso!\n");
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Falhas na exclusão do Produto!\n");
        }
    }
}