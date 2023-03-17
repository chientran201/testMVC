package com.chien.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsMapper implements RowMapper<Product> {
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product products = new Product();
        products.setId(rs.getInt("id"));
        products.setName(rs.getString("name"));
        products.setPrice(rs.getDouble("price"));
        return products;
    }
}
