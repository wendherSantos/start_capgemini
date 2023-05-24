package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT INTO projects(name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));

            if (project.getUpdatedAt() != null) {
                statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
            } else {
                // Remova o parâmetro 'updatedAt' se for nulo
                statement.setNull(4, java.sql.Types.DATE);
            }

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Projeto salvo com sucesso.");
            } else {
                throw new RuntimeException("Falha ao salvar o projeto.");
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar o projeto.", ex);
        }
    }

    public void update(Project project) {
        String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            if (project.getUpdatedAt() != null) {
                statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
            } else {
                statement.setNull(4, java.sql.Types.DATE);
            }
            statement.setInt(5, project.getId());
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Projeto atualizado com sucesso.");
            } else {
                throw new RuntimeException("Falha ao atualizar o projeto.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto.", ex);
        }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM projects";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            List<Project> projects = new ArrayList<>();

            while (resultSet.next()) {
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                Date updatedAt = resultSet.getDate("updatedAt");
                if (updatedAt != null) {
                    project.setUpdatedAt(updatedAt);
                }
                projects.add(project);
            }

            return projects;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar os projetos.", ex);
        }
    }

    public void removeById(int idProject) {
        String sql = "DELETE FROM projects WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idProject);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Projeto removido com sucesso.");
            } else {
                throw new RuntimeException("Falha ao deletar o projeto.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto.", ex);
        }
    }
}
