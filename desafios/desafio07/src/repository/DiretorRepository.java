package repository;

import model.Diretor;
import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements IRepository<Diretor> {


    @Override
    public List<Diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM desafio07.diretor ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Diretor> diretores = new ArrayList<>();

        while (resultSet.next()) {
            Diretor diretorCorrente =
                    new Diretor(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getDouble(4),
                            resultSet.getDouble(5));

            diretores.add(diretorCorrente);
        }

        conn.close();

        return diretores;
    }

    @Override
    public Diretor findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM desafio07.diretor WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        Diretor diretor = new Diretor();

        while (resultSet3.next()) {
            diretor.setId(id);
            diretor.setNome(resultSet3.getString(2));
            diretor.setCpf(resultSet3.getString(3));
            diretor.setSalario(resultSet3.getDouble(4));
            diretor.setBonus(resultSet3.getDouble(5));
        }

        return diretor;
    }
}
