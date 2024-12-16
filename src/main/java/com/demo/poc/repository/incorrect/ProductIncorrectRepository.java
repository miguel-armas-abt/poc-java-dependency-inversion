package com.demo.poc.repository.incorrect;

import com.demo.poc.dao.ProductDAO;
import com.demo.poc.dao.ProductDAOImpl;
import com.demo.poc.dto.ProductDTO;
import java.util.List;

public class ProductIncorrectRepository {

    private final ProductDAO productDAO;

    //incorrect
    public ProductIncorrectRepository() {
        productDAO = new ProductDAOImpl();
    }

    public List<ProductDTO> findAll() {
        return productDAO.findAll();
    }

    public ProductDTO findById(Long id) {
        return productDAO.findById(id);
    }
}
