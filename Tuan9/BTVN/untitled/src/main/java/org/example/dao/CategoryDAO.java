package org.example.dao;

import org.example.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.example.utils.JDBCUtils.connectionDB;

public class CategoryDAO {
    private static final Connection connection = connectionDB();

    public static List<Category> findAll() throws SQLException {
        List<Category> categories = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try{
            String query = "SELECT * FROM category";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                Category category = new Category(id,name);
                categories.add(category);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        return categories;
    }
    public void insert(Category category) throws SQLException {
        PreparedStatement preparedStatement = null;
        try{
            String sql = "INSERT INTO category (id, name) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, category.getId());
            preparedStatement.setString(2, category.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            connection.close();
        }
    }
    public void update(Category category) throws SQLException {
        PreparedStatement preparedStatement = null;
        try{
            String sql = "UPDATE category SET name = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,category.getName());
            preparedStatement.setString(2,category.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            connection.close();
        }
    }
    public void delete(String id) throws SQLException {
        PreparedStatement preparedStatement = null;
        try{
            String sql = "DELETE FROM category WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            connection.close();
        }
    }
}
