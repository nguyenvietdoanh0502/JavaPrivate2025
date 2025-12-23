package org.example;

import org.example.dao.CategoryDAO;
import org.example.dao.ProductDAO;
import org.example.dto.ProductDTO;
import org.example.model.Category;
import org.example.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        CategoryDAO categoryDAO = new CategoryDAO();
/*        List<Category> categories = CategoryDAO.findAll();
        for (var x:categories){
            System.out.println(x);
        }*/
        /*Category category = new Category("2","Asus");
        categoryDAO.update(category);*/
        ProductDAO productDAO = new ProductDAO();
        List<ProductDTO> productDTOS = productDAO.findAllWithCategoryName();
        for(var x:productDTOS){
            System.out.println(x);
        }
    }
}