package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;
import java.sql.Date;

public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO tasks(idProjects, name, description, completed, notes, deadline, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, task.getIdProjects());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Tarefa salva com sucesso.");
            } else {
                throw new RuntimeException("Falha ao salvar a tarefa.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa.", ex);
        }
    }

    public void update(Task task) {
        String sql = "UPDATE tasks SET idProjects = ?, name = ?, description = ?, notes = ?, completed = ?, deadline = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, task.getIdProjects());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Tarefa atualizada com sucesso.");
            } else {
                throw new RuntimeException("Falha ao atualizar a tarefa.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa.", ex);
        }
    }

    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, taskId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Tarefa removida com sucesso.");
            } else {
                throw new RuntimeException("Falha ao deletar a tarefa.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa.", ex);
        }
    }

    public List<Task> getAll(int idProjects) {
        String sql = "SELECT * FROM tasks WHERE idProjects = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idProjects);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<Task> tasks = new ArrayList<>();
                while (resultSet.next()) {
                    Task task = new Task();
                    task.setId(resultSet.getInt("id"));
                    task.setIdProjects(resultSet.getInt("idProjects"));
                    task.setName(resultSet.getString("name"));
                    task.setDescription(resultSet.getString("description"));
                    task.setNotes(resultSet.getString("notes"));
                    task.setCompleted(resultSet.getBoolean("completed"));
                    task.setDeadline(resultSet.getDate("deadline"));
                    task.setCreatedAt(resultSet.getDate("createdAt"));
                    task.setUpdatedAt(resultSet.getDate("updatedAt"));
                    tasks.add(task);
                }
                return tasks;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas.", ex);
        }
    }
}
