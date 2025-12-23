package org.example.dao;

import org.example.dto.ProductDTO;
import org.example.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.example.utils.JDBCUtils.connectionDB;

public class ProductDAO {
    private static final Connection connection = connectionDB();
    public void insert(Product product) throws SQLException {
        PreparedStatement preparedStatement = null;
        try{
            String sql = "INSERT INTO product (id,name,price,category_id) VALUES (?,?,?,?)";
            preparedStatement  = connection.prepareStatement(sql);
            preparedStatement.setString(1,product.getId());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setString(3, String.valueOf(product.getPrice()));
            preparedStatement.setString(4,product.getCategoryId());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
    public List<ProductDTO> findAllWithCategoryName() throws SQLException {
        PreparedStatement preparedStatement = null;
        List<ProductDTO> productDTOS = new ArrayList<>();
        try{
            String sql = "SELECT p.id, p.name, p.price, p.category_id, c.name AS category_name FROM product p JOIN category c ON p.category_id = c.id";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String category_id = resultSet.getString("category_id");
                String categoryName = resultSet.getString("category_name");
                ProductDTO productDTO = new ProductDTO(id,name,category_id,price,categoryName);
                productDTOS.add(productDTO);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            connection.close();
        }
        return productDTOS;
    }
}
