package com.chien.DAO;

import com.chien.models.Product;
import com.chien.models.ProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void insert(Product products) {
        String sql = "INSERT INTO `test`.`products` (`name`, `price`) VALUES (?, ?)";
        jdbcTemplate.update(sql,products.getName(),products.getPrice());
    }
    public List<Product> getDb() {
        String sql = "select * from products";
        return jdbcTemplate.query(sql,new ProductsMapper());
    }
}
