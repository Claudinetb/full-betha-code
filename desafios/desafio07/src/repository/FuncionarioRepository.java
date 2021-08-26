package repository;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<Funcionario> {

    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM desafio07.funcionario ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Funcionario> funcionariosLista = new ArrayList<>();

        while (resultSet.next()) {

            Funcionario funcionarioCorrente =
                    new Funcionario(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getDouble(4));

            funcionariosLista.add(funcionarioCorrente);

        }

        conn.close();

        return funcionariosLista;
    }

    @Override
    public Funcionario findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM desafio07.funcionario WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        Funcionario funcionario = new Funcionario();

        while (resultSet3.next()) {
            funcionario.setId(id);
            funcionario.setNome(resultSet3.getString(2));
            funcionario.setCpf(resultSet3.getString(3));
            funcionario.setSalario(resultSet3.getDouble(4));
        }

        return funcionario;
    }
}
